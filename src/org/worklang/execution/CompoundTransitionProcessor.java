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
import org.worklang.execution.impl.RESTInstruction;
import org.worklang.execution.impl.RESTUtils;
import org.worklang.work.CompoundStateDefinition;
import org.worklang.work.CompoundTransitionInstance;
import org.worklang.work.InputDefinition;
import org.worklang.work.Instance;
import org.worklang.work.PrimitiveStateDefinition;
import org.worklang.work.SimpleInstanceInstruction;
import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionInstance;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.client.WebClient;

/**	Compound Transition Processor
 *  @author Alex Ianta
 *	
 *	Creates 
 */


/* Notes on compound execution:
 * 	
 * 	Don't forget to pre-calculate state composition objects for all transition
 * 	input and output definitions so that runtime performance on compound transitions
 * 	doesn't turn to garbage. 
 * 
 * 	ESPECIALLY don't forget that the above advice includes mapped state definitions
 *  from the input and output definitions.
 * 
 *  Don't forget to split arrays that come as input into multiple instances.
 *  This may be possible through InstanceResolution. But there still needs to be
 *  execution logic that knows to loop through all the Instances produced by 
 *  InputResolution and add them to the execution instruction.
 *  
 *  Use the input of a definition to try to parse input received from a client
 *  
 *  If the input doesn't match the definition of the transition's input,
 *  go through all mapped states of the input definition and try to parse as those.
 * 
 * 	When all inputs are resolved, check to see if the transition can accept the
 *  resolved inputs as its input. 
 *  
 *  If a transition cannot use the resolved input as its input, then go through all
 * 	the transitions mapped from the current transitions definition to see of one of 
 * 	them can. 
 * 
 * 	If no transitions can be found that can process the resolved input return an error.
 * 
 * 	
 */

public class CompoundTransitionProcessor {

	private static Logger logger = LoggerFactory.getLogger(CompoundTransitionProcessor.class);

	private Computation computation;
	private Vertex transition;
	private String fieldName;
	private StateDefinition outputDefinition;
	private Vertex expressionVertex;
	private WebClient client;
	private String transitionName;
	
	private Vertx vertx;
	
	public CompoundTransitionProcessor (Vertx vertx, WebClient client, Vertex transition, String fieldName) {
		
		this.vertx = vertx;
		this.transition = transition;
		this.fieldName = fieldName;
		this.client = client;
		this.transitionName = transition.property("name").value().toString();
		
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
		
		String expressionName = expressionVertex.property("name").value().toString();
		
		if (expressionName.equals("execution result")) {
			processExecutionResult(expressionVertex);
		}
		
		if (expressionName.equals("simple instance instruction")) {
			processSimpleInstanceInstruction(expressionVertex);
		}
		
		
		
	}
	
	public void process(RoutingContext rc) {
		
		logger.info("BEGIN Compound Transition execution for -> {}", transitionName);
	
		String produceParam = rc.request().getParam("produce");
		String collectionParam = rc.request().getParam("collection");
		String collectionIndexParam = rc.request().getParam("collectionIndex");
		if (produceParam != null) {
			computation.customizeFinalInstructionOutputId(produceParam);
		}
		
		try {
			
			Future<RESTInstruction> runResult = Future.future();
			
			computation.run(runResult);
			
			runResult.setHandler(result->{
				
				if (result.succeeded()){
					RESTInstruction lastInstruction = result.result();
					
					JsonObject resultData = null;
					JsonArray resultArray = null;
					
					logger.info("END Compound Transition execution for -> {}", transitionName);
					logger.info("BEGIN PROCESSING Compound transition execution results for ->{}", transitionName);
					
					
					//Assemble compound transition result
					/* Here I have to find some way of assembling an instance from the last execution instruction's result
					 * The following cases are possible:
					 *  - The output is a primitive state
					 *  	If this is the case, then there should be exactly one instance in the last exececution instruction's result, and it should have
					 *  	the same definition as the output definition. 
					 *  
					 *  	We can therefore simple retrieve the resulting instance and and attach the output definition to it's state declaration.
					 *  
					 *  - The output is a compound state
					 *  	If this is the case then there will be numerous instances in the execution instruction's result. Each instance's definition
					 *  	should correspond with the definition of a child in the output state's composition logic.
					 *  	
					 *  	Create a new instance for the assembled result. Iterate through the output definition's composition logic and match each instance
					 *  	from the execution instruction's output. 
					 *  
					 *  	For every collection defined by the output definition, create a collection state instance to store elements associated with the 
					 *  	collection.
					 *  
					 *  	For every collection created, go through the instances in the execution instruction's output and add them to the collection if 
					 *  	the definition type of the collection and the definition type of the collection element match. 
					 *  
					 *  	For every primitive state definition matched, create a set statement in the assembled instance from the execution instructions's
					 *  	corresponding state instance.
					 *  
					 *   	For every compound state definition matched, create a use definition in the assembled instance, set the use definition's 
					 *   	predefined value to the corresponding compound state instance in the execution instruction's output.	 
					 *  	
					 *  - The output is a collection state
					 *  
					 *  	If this is the case there will be only collection elements in the last execution instruction's output list. Create a new
					 *  	collection state instance with the output definition as the state declaration and add all collection elements from the
					 *  	execution instruction's output list to the collection state instance. 
					 *  
					 * 
					 */
					if (outputDefinition instanceof PrimitiveStateDefinition) {
						resultData =  RESTUtils.stateInstanceToJson(lastInstruction.getOutputInstance(outputDefinition));
					}
					
					
					if (outputDefinition instanceof CompoundStateDefinition) {
						Instance i = WorklangResourceUtils.mapInstancesToCompoundInstance(
								(CompoundStateDefinition)outputDefinition,
								lastInstruction.getOutputInstances());
						
						//Set assembled state instance name
						i.setName(produceParam != null?produceParam:UUID.randomUUID().toString());
						
						WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
						resultData = RESTUtils.stateInstanceToJson(i);
						
					}
					
					if (outputDefinition instanceof CompoundStateDefinition) {
						Instance i = WorklangResourceUtils.mapInstancesToCollectionInstance(
								(CompoundStateDefinition)outputDefinition,
								lastInstruction.getOutputInstances());
						
						//Set assembled collection instance name
						i.setName(produceParam != null?produceParam:UUID.randomUUID().toString());
						
						WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
						resultArray = RESTUtils.collectionInstanceToJsonArray(i);
					}
					
					logger.info("END PROCESSING Compound transition execution results for -> {}", transitionName);
					
					//Send back either result data or result array depending on which one isn't null
					
					if (resultData != null && resultArray == null) {
						rc.response().end(resultData.encode());
					}
					
					if (resultData == null && resultArray != null) {
						rc.response().end(resultArray.encode());
					}
					
					
					/**Re-process the computation so it's ready to execute next time
					 * This will probably have to be refactored at some point.
					 */
					String expressionName = expressionVertex.property("name").value().toString();
					
					if (expressionName.equals("execution result")) {
						processExecutionResult(expressionVertex);
					}
					
					if (expressionName.equals("simple instance instruction")) {
						processSimpleInstanceInstruction(expressionVertex);
					}
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
			
			instructionComputeNext = new RESTInstruction(computation, fieldName);
			
		}
		
		
		//Process first instruction to execute
		
		logger.info("finding compute first vertex");
		//Find the vertices that represent the instructions to execute
		Vertex computeFirst = expressionVertex.vertices(Direction.OUT, "computeFirst").next();
		logger.info("computeFirst -> {} name -> {}", computeFirst, computeFirst.property("name").value().toString());
		
		logger.info("Create new execution instruction");
		//Create execution instruction to compute first
		ExecutionInstruction instructionComputeFirst =
				new RESTInstruction(computation, fieldName);
		
		
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
	
	public void processSimpleInstanceInstruction(Vertex simpleInstanceInstruction) {
		logger.info("creating a new computation");
		computation = new Computation(vertx, client);
		
		ExecutionInstruction instruction = new RESTInstruction(computation, fieldName);
		
		processSimpleInstanceInstruction(simpleInstanceInstruction, instruction);
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
			logger.info("resolved transition instance -> {}", transitionInstance);
			
			logger.info("resolved transition instance from vertex: Instance ->{} -> name ->{}", transitionInstance, transitionInstance.getName());
				
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
					ExecutionInstruction context = instruction.executionContext();
					
					logger.info("Context -> {}", context);
					
					logger.info("Iterate through previous instruction's output and this transition's inpunt");
					//Iterate through previous execution instruction's output and this transitions input
					context.getOutputs().forEach(state->{
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
