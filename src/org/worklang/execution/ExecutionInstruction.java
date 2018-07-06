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
import org.worklang.execution.structures.StateInfo;
import org.worklang.execution.structures.TransitionInfo;
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
	
	private ArrayList<StateInfo> inputs = new ArrayList<>();
	private ArrayList<StateInfo> outputs = new ArrayList<>();
	
	private ArrayList<TransitionInfo> transitions = new ArrayList<>();
	
	//Flag indicated if this instruction has been executed
	private boolean executed = false;
	
	private ExecutionInstructionState status = new ExecutionInstructionState(this);
	
	private WebClient client;
	
	private String fieldName;
	
	private UUID id;
	
	private Computation computation;
	
	private boolean isLastInstruction = false;
	private String lastOutputInstanceId;
	
	//Create an Execution Instruction stub from a transition definition
	public ExecutionInstruction(Computation computation, String fieldName) {
		this.fieldName = fieldName;
		this.computation = computation;
		
		this.id = computation.addInstruction(this);
		
		client = computation.getClient();
	}
	
	//Add new input for this execution instruction
	public void addInput (StateDefinition definition, Instance instance) {
		
		StateInfo info = new StateInfo();
		info.setDefinition(definition);
		info.setId(UUID.randomUUID());
		info.setInstance(instance);
		
		inputs.add(info);
	}
	
	//Add new input stub for this execution instruction
	public void addInput(StateDefinition definition) {
		
		StateInfo info = new StateInfo();
		info.setDefinition(definition);
		info.setId(UUID.randomUUID());
		
		inputs.add(info);
	}
	
	//Add a new input to be resolved with a specified UUID from the previous executionContext
	public void addInput (StateDefinition definition, UUID id) {
		
		StateInfo info = new StateInfo();
		info.setDefinition(definition);
		info.setId(id);
		
		inputs.add(info);
	}
	
	//Add new output for this execution instruction
	public void addOutput(StateDefinition definition, Instance instance) {
		
		StateInfo info = new StateInfo();
		info.setDefinition(definition);
		info.setId(UUID.randomUUID());
		info.setInstance(instance);
		
		outputs.add(info);
	}
	
	//Add an output stub for this execution instance
	public void addOutput(StateDefinition definition) {
		
		StateInfo info = new StateInfo();
		info.setDefinition(definition);
		info.setId(UUID.randomUUID());
		
		outputs.add(info);
	}
	
	//Set a transition definition stub
	public void addTransition(TransitionDefinition transition) {
		
		TransitionInfo info = new TransitionInfo();
		info.setDefinition(transition);
		info.setId(UUID.randomUUID());
		
		transitions.add(info);
	}
	
	public void addTransition(TransitionDefinition transition, UUID id) {
		
		TransitionInfo info = new TransitionInfo();
		info.setDefinition(transition);
		info.setId(id);
		
		transitions.add(info);
	}
	
	public void addTransition (TransitionDefinition definition, Instance instance) {

		TransitionInfo info = new TransitionInfo();
		info.setDefinition(definition);
		info.setId(UUID.randomUUID());
		info.setInstance(instance);
		
		transitions.add(info);
	}
	
	public ExecutionInstructionState status() {
		status.update();
		return status;
	}
	
	public void setInputInstance(UUID id, Instance i) {
		
		StateInfo input = getInput(id);
		
		input.setInstance(i);
	}
	
	private StateInfo getInput(UUID id) {
		Iterator<StateInfo> it = inputs.iterator();
		
		while (it.hasNext()) {
			StateInfo curr = it.next();
			
			if (curr.getId().equals(id)) {
				return curr;
			}
		}
		
		logger.error("Could not find input with id -> {}", id.toString());
		return null;
	}
	
	public ArrayList<StateInfo> getInputs() {
		return inputs;
	}
	
	public ArrayList<StateInfo> getOutputs(){
		return outputs;
	}
	
	public ArrayList<TransitionInfo> getTransitions(){
		return transitions;
	}
	
	public UUID getId() {
		return id;
	}
	
	public StateInfo getOutput(UUID id) {
		Iterator<StateInfo> it =  outputs.iterator();
		
		while(it.hasNext()) {
			StateInfo curr = it.next();
			
			if (curr.getId().equals(id)) {
				return curr;
			}
			
		}
		
		logger.error("Cannot find output with id {}", id);
		return null;
		
	}
	
	public Instance getOutputInstance (StateDefinition state){
		
		Iterator<StateInfo> it =  outputs.iterator();
		
		while(it.hasNext()) {
			StateInfo curr = it.next();
			
			if (curr.getDefinition().getName().equals(state.getName())) {
				return curr.getInstance();
			}
			
		}
		
		logger.error("Cannot find output instance defined by {}", state.getName());
		return null;
	}
	
	public List<Instance> getOutputInstances(){
		List<Instance> result = new ArrayList<>();
		
		Iterator<StateInfo> it = outputs.iterator();
		
		while (it.hasNext()) {
			StateInfo curr = it.next();
			result.add(curr.getInstance());
		}
		
		return result;
	}
	
	public UUID getOutputId (StateDefinition state) {
		Iterator<StateInfo> it = outputs.iterator();
		
		while(it.hasNext()) {
			StateInfo curr = it.next();
			
			if (curr.getDefinition() == state) {
				return curr.getId();
			}
		}
		
		logger.error("Could not find output id for state -> {}", state);
		return null;
	}
	
	public ExecutionInstruction executionContext(){
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
			transitions.forEach(transition->{
				
				//If the transition has inputs
				if (transition.getDefinition().getIn() != null) {
					
					JsonArray inputArray = new JsonArray();
					
					//Resolve inputs for this transition from instruction inputs
					EList<StateDefinition> transitionInputs = transition.getDefinition().getIn().getInputState();
					
					transitionInputs.forEach(input->{
						inputs.forEach(state->{
							if (state.getDefinition().getName().equals(input.getName())) {
								inputArray.add(state.getInstance().getName());
							}
						});
					});
					
					//Create a new future for the result of this transition
					Future<Void> transitionResult  = Future.future();
					//Add the future to the list of transition executions
					transitionExecutions.add(transitionResult);
					
					//Call transition instance asynchronously
					computation.getVertx().<Instance>executeBlocking(fut->{
						
						//Resolve Output Instance ID
						UUID transitionOutputId = getOutputId(transition.getDefinition().getOut().getOutputState());
						
						String routePath = "/exec/" + fieldName.toLowerCase() + "/" +
								transition.getDefinition().getName().toLowerCase() + "/" +
								transition.getInstance().getName().replaceAll("\\s", "").toLowerCase();
						

							routePath += "?produce=" + transitionOutputId.toString();
						
						
						
						
						logger.info("Execution Instruction POST: routePath -> {}", routePath);
						
						client.post(
								WorkApi.getServer().actualPort(),
								"localhost",
								routePath 
								).sendJson(inputArray, result->{
									
									HttpResponse response = result.result();
									
									logger.info("Execution Instruction POST: body ->{}", response.bodyAsString());
									
									JsonObject data = response.bodyAsJsonObject();
									
									
									//find output instance					
									Instance outputInstance = 
											WorklangResourceUtils.resolveInstance(fieldName, transitionOutputId.toString());
									
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
							outputs.forEach(outputState->{
								if(outputState.getDefinition().getName().equals(resolvedOutputDefinition.getName())) {
									outputState.setInstance(instance);
								}
							});
						
							transitionResult.complete();

							
						}else {
							logger.error("Failed execution at computation {} -> instruction {} -> transition {} ", computation.getId(), id, transition.getId().toString() );
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
						
						//Resolve transition output id
						UUID transitionOutputId = getOutputId(transition.getDefinition().getOut().getOutputState());
						
						String routePath = "/exec/" + fieldName.toLowerCase() + "/" +
								transition.getDefinition().getName().toLowerCase() + "/" +
								transition.getInstance().getName().replaceAll("\\s","").toLowerCase();
						
						routePath += "?produce=" + transitionOutputId.toString();
						
						logger.info("Execution Instruction GET: routePath -> {}", routePath);
						
						client.get(
								WorkApi.getServer().actualPort(),
								"localhost",
								routePath
								).send(result->{
									
									HttpResponse response = result.result();
									
									JsonObject data = response.bodyAsJsonObject();
									
									Instance outputInstance = WorklangResourceUtils.resolveInstance(fieldName, transitionOutputId.toString());
									
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
							outputs.forEach(outputState->{
								if(outputState.getDefinition().getName().equals(resolvedOutputDefinition.getName())) {
									outputState.setInstance(instance);
								}
							});
							
							
							//Complete this transitions future
							transitionResult.complete();
							
						}else {
							logger.error("Failed execution at computation {} -> instruction {} -> transition {} ", computation.getId(), id, transition.getId() );
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
	
	public String toString() {

		return toJson().encodePrettily();
	}
	
	public JsonObject toJson() {
		JsonObject data = new JsonObject()
				.put("id", id.toString())
				.put("executed", executed)
				.put("fieldName", fieldName)
				.put("isLastInstruction", isLastInstruction)
				.put("lastOutputInstanceId", lastOutputInstanceId)
				.put("status", status.toJson());
		
		JsonObject inputs = new JsonObject();
		JsonObject outputs = new JsonObject();
		JsonObject transitions = new JsonObject();
		
		this.inputs.forEach(state->{
			inputs.put(state.getDefinition().getName(), new JsonObject()
					.put("UUID", state.getId().toString()));
			
			if (state.getInstance() != null) {
				inputs.getJsonObject(state.getDefinition().getName())
				.put("Instance", state.getInstance().toString());
			}else {
				inputs.getJsonObject(state.getDefinition().getName())
				.put("Instance", state.getInstance());
			}
					
		});
		
		this.outputs.forEach(state->{
			outputs.put(state.getDefinition().getName(), new JsonObject()
					.put("UUID", state.getId().toString()));
			
			if (state.getInstance() != null) {
				outputs.getJsonObject(state.getDefinition().getName())
					.put("Instance", state.getInstance().toString());
			}else {
				outputs.getJsonObject(state.getDefinition().getName())
				.put("Instance", state.getInstance());
			}
			
					
		});
		
		this.transitions.forEach(transition->{
			transitions.put(transition.getDefinition().getName(), new JsonObject()
					.put("UUID", transition.getId().toString()));
			
			if (transition.getInstance() != null) {
				transitions.getJsonObject(transition.getDefinition().getName())
				.put("Instance", transition.getInstance().toString());
			}else {
				
				transitions.getJsonObject(transition.getDefinition().getName())
				.put("Instance", transition.getInstance());
			}
					
		});
		
		data.put("inputs", inputs)
			.put("outputs", outputs)
			.put("transitions", transitions);
		
		
		return data;
		
	}

	public boolean isLastInstruction() {
		return isLastInstruction;
	}

	public void setLastInstruction(boolean isLastInstruction) {
		this.isLastInstruction = isLastInstruction;
	}

	public String getLastOutputInstanceId() {
		return lastOutputInstanceId;
	}

	public void setLastOutputInstanceId(String lastOutputInstanceId) {
		logger.info("OVERWRITING generated output id ->{} with ->{}", outputs.get(0).getId(), lastOutputInstanceId);
		this.lastOutputInstanceId = lastOutputInstanceId;
		outputs.get(0).setId(UUID.fromString(lastOutputInstanceId));
	}
}
