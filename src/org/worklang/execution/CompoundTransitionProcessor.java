/* 
 * 	Copyright 2018 Alexandru Ianta
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 * 
 */

package org.worklang.execution;

import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;
import java.util.UUID;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.work.CompoundTransitionInstance;
import org.worklang.work.InputDefinition;
import org.worklang.work.Instance;
import org.worklang.work.SimpleInstanceInstruction;
import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionInstance;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.client.WebClient;

/**	Compound Transition Processor
 *  @author Alex Ianta
 *	
 *	Creates 
 */

public class CompoundTransitionProcessor {

	private static Logger logger = LoggerFactory.getLogger(CompoundTransitionProcessor.class);

	private Computation computation;
	private Vertex transition;
	private String fieldName;
	private StateDefinition outputDefinition;
	private Vertex expressionVertex;
	private WebClient client;
	
	private Vertx vertx;
	
	public CompoundTransitionProcessor (Vertx vertx, WebClient client, Vertex transition, String fieldName) {
		
		this.vertx = vertx;
		this.transition = transition;
		this.fieldName = fieldName;
		this.client = client;
		
		//Find and save the definition of this compound transitions' output
		logger.info("instanceOf -> {}", transition.vertices(Direction.OUT, "instanceOf").next());
		logger.info("produces -> {}", transition.vertices(Direction.OUT, "instanceOf").next().vertices(Direction.OUT, "produces").next());
		logger.info("hasParameter -> {}", transition.vertices(Direction.OUT, "instanceOf").next()
				.vertices(Direction.OUT, "produces").next()
				.vertices(Direction.OUT, "hasParameter").next());
		
		Vertex outputVertex = transition.vertices(Direction.OUT, "instanceOf").next()
				.vertices(Direction.OUT, "produces").next()
				.vertices(Direction.OUT, "hasParameter").next();
		
		logger.info("outputVertex:  field -> {}, name -> {}", outputVertex.property("field").value().toString(), outputVertex.property("name").value().toString());
		
		logger.info("fieldName as constructor parameter -> {}", fieldName);
		outputDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, outputVertex.property("name").value().toString());
		logger.info("outputDefinition name -> {}", outputDefinition.getName());
		
		
		expressionVertex = transition.vertices(Direction.OUT, "expression").next();
		logger.info("expression vertex: name-> {}", expressionVertex.property("name").value().toString());
		
		logger.info("Processing compound transition code");
		processExecutionResult(expressionVertex);
		
	}
	
	public void process(RoutingContext rc) {
	
		try {
			
			Future<ExecutionInstruction> runResult = Future.future();
			
			computation.run(runResult);
			
			runResult.setHandler(result->{
				
				if (result.succeeded()){
					ExecutionInstruction lastInstruction = result.result();
					JsonObject resultData =  ExecutionUtils.StateInstanceToJson(lastInstruction.getOutputInstance(outputDefinition));
					
					rc.response().end(resultData.encode());
					
					/**Re-process the computation so it's ready to execute next time
					 * This will probably have to be refactored at some point.
					 */
					processExecutionResult(expressionVertex);
				}
				
				
			});
			
			
			
		}catch(Exception e) {
			rc.response().end("Computation Failed!");
			logger.error("Computation Failed!");
			e.printStackTrace();
		}
		
	
	}
	
	public void processExecutionResult(Vertex expressionVertex) {
		
		logger.info("creating a new computation");
		computation = new Computation(vertx, client);
		
		logger.info("processing execution result");
		
		/**MUST CREATE compute last execute instruction first if it exists so that it  
		 * is in the correct order on the execution stack.
		 * 
		 * BUT MUST PROCESS compute last AFTER compute first for dependency resolution to work.
		 */
		
		logger.info("find compute next vertex");
		Vertex computeNext = expressionVertex.vertices(Direction.OUT, "computeNext").next();
		
		ExecutionInstruction instructionComputeNext = null;
		
		//If there is another instruction to execute
		if(computeNext != null) {
			logger.info("compute next exists!");
			
			logger.info("creating execution instruction for compute next");
			
			instructionComputeNext = new ExecutionInstruction(computation, fieldName);
			
		}
		
		
		//Process first instruction to execute
		
		logger.info("finding compute first vertex");
		//Find the vertices that represent the instructions to execute
		Vertex computeFirst = expressionVertex.vertices(Direction.OUT, "computeFirst").next();
		logger.info("computeFirst -> {} name -> {}", computeFirst, computeFirst.property("name").value().toString());
		
		logger.info("Create new execution instruction");
		//Create execution instruction to compute first
		ExecutionInstruction instructionComputeFirst =
				new ExecutionInstruction(computation, fieldName);
		
		
		if (computeFirst.property("name").value().toString().equals("simple instance instruction")) {
			logger.info("process simple instruction for compute first");
			processSimpleInstanceInstruction(computeFirst, instructionComputeFirst);
		}
		
		if (computeFirst.property("name").value().toString().equals("execution result")) {
			logger.info("process execution result for compute first");
			processExecutionResult(computeFirst);
		}
		
		//Now process computeNext if it exists
		if (instructionComputeNext != null) {
			//Process it
			if (computeNext.property("name").value().toString().equals("simple instance instruction")) {
				logger.info("process simple instruction for compute next");
				processSimpleInstanceInstruction(computeNext, instructionComputeNext);
			}
			
			if (computeNext.property("name").value().toString().equals("execution result")) {
				logger.info("process execution result for compute next");
				processExecutionResult(computeNext);
			}
		}
		
		
		
	}
	
	public void processSimpleInstanceInstruction(Vertex simpleInstanceInstruction, ExecutionInstruction instruction ) {
		
		logger.info("Finding transitions to execute from simple instruction vertex");
		Iterator<Vertex> instructionTransitions = simpleInstanceInstruction.vertices(Direction.OUT, "toExecute");
	
		//Iterating through all the transitions
		while(instructionTransitions.hasNext()) {
			Vertex curr = instructionTransitions.next();
			logger.info("processing {} : transition-> {}", curr, curr.property("name").value().toString());
			
			Instance transitionInstance = 
					WorklangResourceUtils.resolveTransitionInstance(
						curr.property("field").value().toString(),
						curr.property("name").value().toString());
			
			logger.info("created transition instance from vertex: Instance ->{} -> name ->{}", transitionInstance, transitionInstance.getName());
				
				TransitionDefinition transitionDefinition = 
						WorklangResourceUtils.resolveTransition(
								curr.property("field").value().toString(),
								transitionInstance
									.getTransitionDeclaration()
									.getTransition()
									.getName());
				
				logger.info("Resolved transition definition from transition instance. TransitionDefinition -> {} -> name -> {}", transitionDefinition, transitionDefinition.getName());
				
				instruction.addTransition(transitionDefinition, transitionInstance);
				logger.info("Added transition to execution instruction.");
				
				//Determine if this transition has inputs
				if(transitionDefinition.getIn() != null){
					logger.info("This transition has inputs, processing them");
					
					/* If it does, get the execution context to try and resolve them
					 * from the outputs of the previous instruction
					 */
					logger.info("Getting list of inputs");
					EList<StateDefinition> transitionInputs = transitionDefinition.getIn().getInputState();
						
					logger.info("Getting execution context");
					SimpleEntry<UUID,ExecutionInstruction> context = instruction.executionContext();
					
					logger.info("Context -> {}", context);
					
					logger.info("Iterate through previous instruction's output and this transition's inpunt");
					//Iterate through previous execution instruction's output and this transitions input
					context.getValue().getOutputs().forEach(state->{
						logger.info("LAST OUTPUT: State -> {} UUID-> {} Instance -> {}", state.getDefinition().getName(), state.getId().toString(), state.getInstance());
						
						transitionInputs.forEach(input->{
							logger.info("CURRENT INPUT: State -> {}", input.getName());;
							//If an output matches the input add it to this instruction's input 
							if (input.getName().equals(state.getDefinition().getName())) {
								logger.info("match!");
								instruction.addInput(state.getDefinition(), state.getId()); //Here we passed the output's UUID, so we can resolve it later
								logger.info("Added output UUID as input for execution Instruction");
							}
						});
						
						
					});
					
				}
				
				//Define this instruction's output
				instruction.addOutput(transitionDefinition.getOut().getOutputState());
				logger.info("Adding output state definition to execution instruction");
				
				logger.info("resulting execution instruction -> {}", instruction.toString());
				
				logger.info("Current computation -> {}", computation);
		}
		
		
		
		
	}
	
}
