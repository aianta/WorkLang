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
	
	private Vertx vertx;
	
	public CompoundTransitionProcessor (Vertx vertx, WebClient client, Vertex transition, String fieldName) {
		
		this.vertx = vertx;
		this.transition = transition;
		this.fieldName = fieldName;
		computation = new Computation(vertx, client);
		
		//Find and save the definition of this compound transitions' output
		logger.info("instanceOf -> {}", transition.vertices(Direction.OUT, "instanceOf").next());
		//logger.info("hasParameter -> {}", transition.vertices(Direction.OUT, "instanceOf").next().vertices(Direction.OUT, "hasParameter").next());
		Vertex outputVertex = transition.vertices(Direction.OUT, "instanceOf").next()
				.vertices(Direction.OUT, "produces").next()
				.vertices(Direction.OUT, "hasParameter").next();
		outputDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, outputVertex.property("name").value().toString());
		
		Vertex expressionVertex = transition.vertices(Direction.OUT, "expression").next();
		
		logger.info("Processing compound transition code");
		processExecutionResult(expressionVertex);
		
	}
	
	public void process(RoutingContext rc) {
	
		try {
			ExecutionInstruction result = computation.run();
			
			JsonObject resultData =  ExecutionUtils.StateInstanceToJson(result.getOutput(outputDefinition));
			
			rc.response().end(resultData.encode());
			
		}catch(Exception e) {
			rc.response().end("Computation Failed!");
			logger.error("Computation Failed!");
			e.printStackTrace();
		}
		
	
	}
	
	public void processExecutionResult(Vertex expressionVertex) {
		
		//Process first instruction to execute
		
		//Find the vertices that represent the instructions to execute
		Vertex computeFirst = expressionVertex.vertices(Direction.OUT, "computeFirst").next();
		
		
		//Create execution instruction to compute first
		ExecutionInstruction instruction =
				new ExecutionInstruction(computation, fieldName);
		
		
		if (computeFirst.property("name").equals("simple instance instruction")) {
			processSimpleInstanceInstruction(computeFirst, instruction);
		}
		
		if (computeFirst.property("name").equals("execution result")) {
			processExecutionResult(computeFirst);
		}
		
		Vertex computeNext = expressionVertex.vertices(Direction.OUT, "computeNext").next();
		
		//If there is another instruction to execute
		if(computeNext != null) {
			//Process it
			if (computeNext.property("name").equals("simple instance instruction")) {
				processSimpleInstanceInstruction(computeNext, instruction);
			}
			
			if (computeNext.property("name").equals("execution result")) {
				processExecutionResult(computeNext);
			}
		}
		
		
		
		
	}
	
	public void processSimpleInstanceInstruction(Vertex simpleInstanceInstruction, ExecutionInstruction instruction ) {
		
		Iterator<Vertex> instructionTransitions = simpleInstanceInstruction.vertices(Direction.OUT, "toExecute");
		
		while(instructionTransitions.hasNext()) {
			Vertex curr = instructionTransitions.next();
			
			Instance transitionInstance = 
					WorklangResourceUtils.resolveTransitionInstance(
						curr.property("field").value().toString(),
						curr.property("name").value().toString());
				
				TransitionDefinition transitionDefinition = 
						WorklangResourceUtils.resolveTransition(
								curr.property("field").value().toString(),
								transitionInstance
									.getTransitionDeclaration()
									.getTransition()
									.getName());
				
				instruction.addTransition(transitionDefinition, transitionInstance);
				
				//Determine if this transition has inputs
				if(transitionDefinition.getIn() != null){
					
					/* If it does, get the execution context to try and resolve them
					 * from the outputs of the previous instruction
					 */
					
					EList<StateDefinition> transitionInputs = transitionDefinition.getIn().getInputState();
						
					SimpleEntry<UUID,ExecutionInstruction> context = instruction.executionContext();
					
					//Iterate through previous execution instruction's output and this transitions input
					context.getValue().getOutputs().forEach((state,entry)->{
						transitionInputs.forEach(input->{
							//If an output matches the input add it to this instruction's input 
							if (input.getName().equals(state.getName())) {
								instruction.addInput(state, entry.getKey()); //Here we passed the output's UUID, so we can resolve it later
							}
						});
						
						
					});
					
				}
				
				//Define this instruction's output
				instruction.addOutput(transitionDefinition.getOut().getOutputState());
		}
		
		
		
		
	}
	
}
