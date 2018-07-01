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

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;

import java.lang.Exception;

import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.interpreter.WorkApi;
import org.worklang.metamodel.MetaModelUtils;
import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

/** Execution Stack Data Structure
 *  @author Alex Ianta
 *	
 *	Defines the data structure used by ExecutionStacks to define an instruction
 *	to be executed.
 *  
 *  Keeps track of the inputs required to execute a transition, both the 
 *  definitions and the instance being used.
 *  
 *  Keeps track of the outputs the transition produces, both the definitions
 *  and the instance that was produced. 
 *  
 *  Keeps track of the transition to be executed, both its definition and
 *  its instance.
 *  
 *
 */

public class ExecutionInstruction {
	
	private static final Logger logger = LoggerFactory.getLogger(ExecutionInstruction.class);
	
	private Map <StateDefinition, SimpleEntry<UUID, Instance>> inputs = new HashMap<>();
	private Map <StateDefinition, SimpleEntry<UUID, Instance>> outputs = new HashMap<>();
	
	private Map<TransitionDefinition, SimpleEntry<UUID, Instance>> transitions = new HashMap<>();
	
	//Flag indicated if this instruction has been executed
	private boolean executed = false;
	
	private ExecutionInstructionState status = new ExecutionInstructionState(this);
	
	private WebClient client;
	
	private String fieldName;
	
	private UUID id;
	
	private Computation computation;
	
	//Create an Execution Instruction stub from a transition definition
	public ExecutionInstruction(Computation computation, String fieldName) {
		this.fieldName = fieldName;
		this.computation = computation;
		
		this.id = computation.addInstruction(this);
		
		client = computation.getClient();
	}
	
	//Add new input for this execution instruction
	public void addInput (StateDefinition definition, Instance instance) {
		
		//Verify that instance is a state
		if (instance.getStateDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a state", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a state."
			);
		}
		
		inputs.put(definition, new SimpleEntry<>(UUID.randomUUID(), instance));
	}
	
	//Add new input stub for this execution instruction
	public void addInput(StateDefinition definition) {
		inputs.put(definition, new SimpleEntry<>(UUID.randomUUID(),null));
	}
	
	//Add a new input to be resolved with a specified UUID from the previous executionContext
	public void addInput (StateDefinition definition, UUID id) {
		inputs.put(definition, new SimpleEntry<>(id,null));
	}
	
	//Add new output for this execution instruction
	public void addOutput(StateDefinition definition, Instance instance) {
		
		//Verify that instance is a state
		if (instance.getStateDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a state.", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a state."
			);
		}
		outputs.put(definition, new SimpleEntry<>(UUID.randomUUID(), instance));
	}
	
	//Add an output stub for this execution instance
	public void addOutput(StateDefinition definition) {
		
		outputs.put(definition, new SimpleEntry<>(UUID.randomUUID(), null));
	}
	
	//Set a transition definition stub
	public void addTransition(TransitionDefinition transition) {
		transitions.put(transition, new SimpleEntry<>(UUID.randomUUID(), null));
	}
	
	public void addTransition(TransitionDefinition transition, UUID id) {
		transitions.put(transition, new SimpleEntry<>(id,null));
	}
	
	public void addTransition (TransitionDefinition definition, Instance instance) {
		//Verify that instance is a transition
		if (instance.getTransitionDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a transition.", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a transition."
			);
		}
		
		transitions.put(definition, new SimpleEntry<>(UUID.randomUUID(), instance));
	}
	
	public ExecutionInstructionState status() {
		status.update();
		return status;
	}
	
	public Map<StateDefinition, SimpleEntry<UUID, Instance>> getInputs() {
		return inputs;
	}
	
	public Map<StateDefinition, SimpleEntry<UUID, Instance>> getOutputs(){
		return outputs;
	}
	
	public Map<TransitionDefinition, SimpleEntry<UUID,Instance>> getTransitions(){
		return transitions;
	}
	
	public UUID getId() {
		return id;
	}
	
	public Entry<StateDefinition, SimpleEntry<UUID, Instance>>getOutput(UUID id) {
		Iterator<Entry<StateDefinition, SimpleEntry<UUID,Instance>>> it =  outputs.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<StateDefinition, SimpleEntry<UUID,Instance>> curr = it.next();
			
			if (curr.getValue().getKey().equals(id)) {
				return curr;
			}
			
		}
		
		logger.error("Cannot find output with id {}", id);
		return null;
		
	}
	
	public Instance getOutput (StateDefinition state){
		
		Iterator<Entry<StateDefinition, SimpleEntry<UUID,Instance>>> it =  outputs.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<StateDefinition, SimpleEntry<UUID,Instance>> curr = it.next();
			
			if (curr.getKey().getName().equals(state.getName())) {
				return curr.getValue().getValue();
			}
			
		}
		
		logger.error("Cannot find output with id {}", id);
		return null;
	}
	
	public SimpleEntry<UUID, ExecutionInstruction> executionContext(){
		return computation.executionContext(this);
	}
	
	//Determines if this instruction is executable by checking its status
	public boolean isExecutable() {
		status.update();
		
		if (status.isInputResolved && status.areTransitionsResolved) {
			return true;
		}else {
			return false;
		}
	}
	
	public void executed() {
		executed = true;
	}
	
	public boolean wasExecuted() {
		status.update();
		if(executed && status.isOutputResolved ) {
			return true;
		}else {
			return false;
		}
	}
	
	public Future execute(){
		
		//Verify that this instruction is executable
		if (isExecutable()) {
			
			List<Future> transitionExecutions = new ArrayList<>();
			
			//Execute all transitions in this instruction
			transitions.forEach((transition, entry)->{
				
				//If the transition has inputs
				if (transition.getIn() != null) {
					
					JsonArray inputArray = new JsonArray();
					
					//Resolve inputs for this transition from instruction inputs
					EList<StateDefinition> transitionInputs = transition.getIn().getInputState();
					
					transitionInputs.forEach(input->{
						inputs.forEach((state,stateEntry)->{
							if (state.getName().equals(input.getName())) {
								inputArray.add(stateEntry.getValue().getName());
							}
						});
					});
					
					//Create a new future for the result of this transition
					Future<Void> transitionResult  = Future.future();
					//Add the future to the list of transition executions
					transitionExecutions.add(transitionResult);
					
					//Call transition instance asynchronously
					computation.getVertx().<Instance>executeBlocking(fut->{
						
						client.post(
								WorkApi.getServer().actualPort(),
								"localhost",
								"/" + fieldName + "/" +
								transition.getName().toLowerCase() + "/" +
								entry.getValue().getName().replace("\\s", "").toLowerCase() 
								).sendJson(inputArray, result->{
									
									HttpResponse response = result.result();
									
									JsonObject data = response.bodyAsJsonObject();
									
									
									//Create output instance
									Instance outputInstance = MetaModelUtils.jsonToStateInstance(
											data,
											fieldName,
											entry.getValue(),
											computation.getId().toString()+"@"+id.toString() + "@" + entry.getKey()
											);
									
									fut.complete(outputInstance);
										
								});
					},result->{
						
						if (result.succeeded()) {
							
							Instance instance = result.result();
							
							//Resolve output state definition
							StateDefinition resolvedOutputDefinition =
									WorklangResourceUtils
										.resolveStateDefinition(
												fieldName,
												instance
													.getStateDeclaration()
													.getState()
													.getName());
							
							
							
							//Map to output for this execution instruction
							outputs.forEach((outputState,outputStateEntry)->{
								if(outputState.getName().equals(resolvedOutputDefinition.getName())) {
									outputStateEntry.setValue(instance);
								}
							});
							
							//Add new instance to active resource
							WorklangResourceUtils
								.resolveInstanceSpace(fieldName)
								.getInstances()
								.add(instance);
							
							transitionResult.complete();
							
						}else {
							logger.error("Failed execution at computation {} -> instruction {} -> transition {} ", computation.getId(), id, entry.getKey() );
							transitionResult.fail("Failed to execute transition!");
						
						}
						
					});
					
					
				}else {
					//If this transition requires no inputs fire a GET request

					//Create a future for the result of this transition
					Future<Void> transitionResult = Future.future();
					//Add the future to the list of transition executions
					transitionExecutions.add(transitionResult);
					
					//Call transition instance asynchronously
					computation.getVertx().<Instance>executeBlocking(fut->{
						client.get(
								WorkApi.getServer().actualPort(),
								"localhost",
								"/" + fieldName + "/" +
								transition.getName().toLowerCase() + "/" +
								entry.getValue().getName().replaceAll("\\s","").toLowerCase()
								).send(result->{
									
									HttpResponse response = result.result();
									
									JsonObject data = response.bodyAsJsonObject();
									
									Instance outputInstance = 
											MetaModelUtils.jsonToStateInstance(
													data,
													fieldName,
													entry.getValue(),
													computation.getId().toString() + "@" + id.toString() + "@" + entry.getKey()
													);
									
									fut.complete(outputInstance);
								});
					}, result->{
						if (result.succeeded()) {
							
							Instance instance = result.result();
							
							//Resolve output state definition
							StateDefinition resolvedOutputDefinition =
									WorklangResourceUtils
										.resolveStateDefinition(
												fieldName,
												instance
													.getStateDeclaration()
													.getState()
													.getName());
							
							
							
							//Map to output for this execution instruction
							outputs.forEach((outputState,outputStateEntry)->{
								if(outputState.getName().equals(resolvedOutputDefinition.getName())) {
									outputStateEntry.setValue(instance);
								}
							});
							
							//Add new instance to active resource
							WorklangResourceUtils
								.resolveInstanceSpace(fieldName)
								.getInstances()
								.add(instance);
							
							//Complete this transitions future
							transitionResult.complete();
							
						}else {
							logger.error("Failed execution at computation {} -> instruction {} -> transition {} ", computation.getId(), id, entry.getKey() );
							transitionResult.fail("Failed to execute transition");
							
						}
					});
			
				}
			
				
				
				
			});
			
			//Wait for all transitions to complete, then update meta model
			return CompositeFuture.all(transitionExecutions);
			
			
		}else {
			logger.error("Cannot execute instruction. Instruction is not executable.");
			throw new UnsupportedOperationException();
		}	
		
	}
}
