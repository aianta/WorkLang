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

import org.worklang.execution.structures.StateInfo;
import org.worklang.execution.structures.TransitionInfo;
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
	
	ArrayList<StateInfo> unresolvedInputs = new ArrayList<>();
	ArrayList<StateInfo> unresolvedOutputs = new ArrayList<>();
	ArrayList<TransitionInfo> unresolvedTransitions = new ArrayList<>();
	
	public ExecutionInstructionState(ExecutionInstruction instruction) {
		this.instruction = instruction;
	}
	
	/**
	 *  Inspect instruction and determine its state
	 */
	
	public void update() {
		
		clear();
		
		//Inspect inputs and update flag
		instruction.getInputs().forEach(state->{
			if (state.getInstance() == null) {
				unresolvedInputs.add(state);
			}
		});
		
		if (unresolvedInputs.size() > 0) {
			isInputResolved = false;
		}else {
			isInputResolved = true;
		}
		
		//Inspect outputs
		instruction.getOutputs().forEach(state->{
			if(state.getInstance() == null) {
				unresolvedOutputs.add(state);
			}
			
		});
		
		if (unresolvedOutputs.size() > 0) {
			isOutputResolved = false;
		}else {
			isOutputResolved = true;
		}
		
		//Inspect transitions
		instruction.getTransitions().forEach(transition->{
			if (transition.getInstance() ==  null) {
				unresolvedTransitions.add(transition);
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

	public ArrayList<StateInfo> getUnresolvedInputs() {
		return unresolvedInputs;
	}

	public ArrayList<StateInfo> getUnresolvedOutputs() {
		return unresolvedOutputs;
	}

	public ArrayList<TransitionInfo> getUnresolvedTransition() {
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
				missingInputs.add(entry.getId().toString());
			});
			
			unresolvedOutputs.forEach(entry->{
				missingOutputs.add(entry.getId().toString());
			});
			
			unresolvedTransitions.forEach(entry->{
				missingTransitions.add(entry.getId().toString());
			});
			
			data
			.put("missing inputs", missingInputs)
			.put("missing outputs", missingOutputs)
			.put("missingTransitions", missingTransitions);
			
			return data;
	}
		
}
