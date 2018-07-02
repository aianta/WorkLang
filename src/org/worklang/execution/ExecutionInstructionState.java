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
import java.util.ArrayList;
import java.util.UUID;

import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class ExecutionInstructionState {

	ExecutionInstruction instruction;
	
	boolean isInputResolved;
	boolean isOutputResolved;
	boolean areTransitionsResolved;
	
	ArrayList<SimpleEntry<UUID, Instance>> unresolvedInputs = new ArrayList<>();
	ArrayList<SimpleEntry<UUID, Instance>> unresolvedOutputs = new ArrayList<>();
	ArrayList<SimpleEntry<UUID, Instance>> unresolvedTransitions = new ArrayList<>();
	
	public ExecutionInstructionState(ExecutionInstruction instruction) {
		this.instruction = instruction;
	}
	
	/**
	 *  Inspect instruction and determine its state
	 */
	
	public void update() {
		
		clear();
		
		//Inspect inputs and update flag
		instruction.getInputs().forEach((state,entry)->{
			if (entry.getValue() == null) {
				unresolvedInputs.add(entry);
			}
		});
		
		if (unresolvedInputs.size() > 0) {
			isInputResolved = false;
		}else {
			isInputResolved = true;
		}
		
		//Inspect outputs
		instruction.getOutputs().forEach((state,entry)->{
			if(entry.getValue() == null) {
				unresolvedOutputs.add(entry);
			}
			
		});
		
		if (unresolvedOutputs.size() > 0) {
			isOutputResolved = false;
		}else {
			isOutputResolved = true;
		}
		
		//Inspect transitions
		instruction.getTransitions().forEach((transition, entry)->{
			if (entry.getValue() ==  null) {
				unresolvedTransitions.add(entry);
			}
		});
		
		if (unresolvedTransitions.size() > 0) {
			areTransitionsResolved = false;
		}else {
			areTransitionsResolved = true;
		}
		
	}
	
	public void clear() {
		unresolvedInputs.clear();
		unresolvedOutputs.clear();
		unresolvedTransitions.clear();
	}

	//Getters and Setters
	public boolean isInputResolved() {
		return isInputResolved;
	}

	public boolean isOutputResolved() {
		return isOutputResolved;
	}

	public boolean areTransitionsResolved() {
		return areTransitionsResolved;
	}

	public ArrayList<SimpleEntry<UUID, Instance>> getUnresolvedInputs() {
		return unresolvedInputs;
	}

	public ArrayList<SimpleEntry<UUID, Instance>> getUnresolvedOutputs() {
		return unresolvedOutputs;
	}

	public ArrayList<SimpleEntry<UUID, Instance>> getUnresolvedTransition() {
		return unresolvedTransitions;
	}
	
	public String toString() {
		
		return toJson().encodePrettily();
	}
	
	public JsonObject toJson() {
		
		JsonObject data = new JsonObject()
				.put("isInputResolved", isInputResolved)
				.put("isOutputResolved", isOutputResolved)
				.put("areTransitionsResolved", areTransitionsResolved);
			
			JsonArray missingInputs = new JsonArray();
			JsonArray missingOutputs = new JsonArray();
			JsonArray missingTransitions = new JsonArray();
			
			unresolvedInputs.forEach(entry->{
				missingInputs.add(entry.getKey().toString());
			});
			
			unresolvedOutputs.forEach(entry->{
				missingOutputs.add(entry.getKey().toString());
			});
			
			unresolvedTransitions.forEach(entry->{
				missingTransitions.add(entry.getKey().toString());
			});
			
			data
			.put("missing inputs", missingInputs)
			.put("missing outputs", missingOutputs)
			.put("missingTransitions", missingTransitions);
			
			return data;
	}
		
}
