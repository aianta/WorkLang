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
import java.util.Map;
import java.util.UUID;
import java.util.AbstractMap.SimpleEntry;

import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.interpreter.WorkApi;
import org.worklang.metamodel.MetaModelUtils;
import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;

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
	
	private Map <StateDefinition, Instance> inputs = new HashMap<StateDefinition, Instance>();
	private Map <StateDefinition, Instance> outputs = new HashMap<StateDefinition, Instance>();
	
	private AbstractMap.SimpleEntry<TransitionDefinition, Instance> transition;
	
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
		
		inputs.put(definition, instance);
	}
	
	//Add new input stub for this execution instruction
	public void addInput(StateDefinition definition) {
		inputs.put(definition, null);
	}
	
	//Add new output for this execution instruction
	public void addOutput(StateDefinition definition, Instance instance) {
		
		//Verify that instance is a state
		if (instance.getStateDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a state", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a state."
			);
		}
		
		outputs.put(definition, instance);
	}
	
	//Add an output stub for this execution instance
	public void addOutput(StateDefinition definition) {
		
		outputs.put(definition, null);
	}
	
	//Set a transition definition stub
	public void setTransition(TransitionDefinition transition) {
		this.transition = new AbstractMap.SimpleEntry<>(transition, null);
	}
	
	public void setTransition(TransitionDefinition transition, Instance instance) {
		
		//Verify that instance is a transition
		if (instance.getTransitionDeclaration() == null) {
			logger.error("Cannot create execution instruction from instance: {} Instance is not a transition.", instance.getName());
			throw new IllegalArgumentException(
					"Cannot create execution instruction from instance: "+
					instance.getName() + ". " + 
					"Instance is not a transition."
					);
		}
		
		this.transition = new AbstractMap.SimpleEntry<>(transition, instance);
		
	}
	
	public ExecutionInstructionState status() {
		status.update();
		return status;
	}
	
	public Map<StateDefinition, Instance> getInputs() {
		return inputs;
	}
	
	public Map<StateDefinition, Instance> getOutputs(){
		return outputs;
	}
	
	public SimpleEntry<TransitionDefinition, Instance> getTransition(){
		return transition;
	}
	
	//Determines if this instruction is executable by checking its status
	public boolean isExecutable() {
		status.update();
		
		if (status.isInputResolved && status.isTransitionResolved) {
			return true;
		}else {
			return false;
		}
	}
	
	public void execute() {
		
		//Verify that this instruction is executable
		if (isExecutable()) {
			JsonArray inputArray = new JsonArray();
			
			// If this instruction has inputs fire a POST request with the instance names. 
			if (inputs.size() > 0) {
				//Prepare inputs
				inputs.forEach((state, instance)->{
					inputArray.add(instance.getName());
				});
				
				String routePath = "/" + fieldName + "/" +
						transition.getKey().getName().toLowerCase() + "/" +
						transition.getValue().getName().replace("\\s", "").toLowerCase();
				
				logger.info("Execution Instruction: routePath -> {}", routePath);
				
				
				client.post(
						WorkApi.getServer().actualPort(),
						"localhost",
						"/" + fieldName + "/" +
						transition.getKey().getName().toLowerCase() + "/" +
						transition.getValue().getName().replace("\\s", "").toLowerCase() 
						).sendJson(inputArray, result->{
							
							HttpResponse response = result.result();
							
							JsonObject data = response.bodyAsJsonObject();
							
							Instance outputInstance = MetaModelUtils.jsonToStateInstance(
									data,
									fieldName,
									transition.getValue(),
									computation.getId().toString()+"@"+id.toString()
									);
							
							StateDefinition outputDefinition =
									WorklangResourceUtils
										.resolveStateDefinition(
												fieldName,
												outputInstance
													.getStateDeclaration()
													.getState()
													.getName()
												);
							//Add output to this instruction
							addOutput(outputDefinition, outputInstance);
							
							//Add new instance to active resource
							WorklangResourceUtils
								.resolveInstanceSpace(fieldName)
								.getInstances()
								.add(outputInstance);
								
							
						});
			}else {
				
				String routePath = "/" + fieldName + "/" +
						transition.getKey().getName().toLowerCase() + "/" +
						transition.getValue().getName().replace("\\s", "").toLowerCase();
				
				logger.info("Execution Instruction: routePath -> {}", routePath);
				
				//If there are no inputs fire a GET request
				client.get(
						WorkApi.getServer().actualPort(),
						"localhost",
						"/" + fieldName + "/" +
						transition.getKey().getName().toLowerCase() + "/" +
						transition.getValue().getName().replaceAll("\\s","").toLowerCase()
						).send(result->{
							
							HttpResponse response = result.result();
							
							JsonObject data = response.bodyAsJsonObject();
							
							Instance outputInstance = 
									MetaModelUtils.jsonToStateInstance(
											data,
											fieldName,
											transition.getValue(),
											computation.getId().toString() + "@" + id.toString());
							
							StateDefinition outputDefinition = 
									WorklangResourceUtils.resolveStateDefinition(
											fieldName,
											outputInstance
												.getStateDeclaration()
												.getState()
												.getName()
											);
							
							//Add output to this instruction
							addOutput(outputDefinition, outputInstance);
							
							//Add new instance to active resource
							WorklangResourceUtils
								.resolveInstanceSpace(fieldName)
								.getInstances()
								.add(outputInstance);
							
						});
			}
			
			//Update meta model
			WorkApi.reprocessActiveResource();
			
			executed = true;
			
		}else {
			logger.error("Cannot execute instruction. Instruction is not executable.");
			throw new UnsupportedOperationException();
		}	
		
	}
}
