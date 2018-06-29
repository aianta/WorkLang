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

import java.util.ArrayList;

import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;

public class ExecutionInstructionState {

	ExecutionInstruction instruction;
	
	boolean isInputResolved;
	boolean isOutputResolved;
	boolean isTransitionResolved;
	
	ArrayList<StateDefinition> unresolvedInputs = new ArrayList<StateDefinition>();
	ArrayList<StateDefinition> unresolvedOutputs = new ArrayList<StateDefinition>();
	TransitionDefinition unresolvedTransition;
	
	public ExecutionInstructionState(ExecutionInstruction instruction) {
		this.instruction = instruction;
	}
	
	/**
	 *  Inspect instruction and determine its state
	 */
	
	public void update() {
		
		//Inspect inputs
		instruction.getInputs().forEach((state,instance)->{
			//Add missing input instances to unresolved inputs list
			if (instance == null) {
				unresolvedInputs.add(state);
			}
		});
		
		//Update flag
		if (unresolvedInputs.size() > 0) {
			isInputResolved = false;
		}
		
		//Inspect outputs
		instruction.getOutputs().forEach((state, instance)->{
			//Add missing output instances to unresolved outpts list
			if (instance == null) {
				unresolvedOutputs.add(state);
			}
		});
		
		//Update flag
		if (unresolvedOutputs.size() > 0) {
			isOutputResolved = false;
		}
		
		//Inspect transition
		if(instruction.getTransition().getValue() == null) {
			unresolvedTransition = instruction.getTransition().getKey();
			isTransitionResolved = false;
		}
	}

	//Getters and Setters
	public boolean isInputResolved() {
		return isInputResolved;
	}

	public void setInputResolved(boolean isInputResolved) {
		this.isInputResolved = isInputResolved;
	}

	public boolean isOutputResolved() {
		return isOutputResolved;
	}

	public void setOutputResolved(boolean isOutputResolved) {
		this.isOutputResolved = isOutputResolved;
	}

	public boolean isTransitionResolved() {
		return isTransitionResolved;
	}

	public void setTransitionResolved(boolean isTransitionResolved) {
		this.isTransitionResolved = isTransitionResolved;
	}

	public ArrayList<StateDefinition> getUnresolvedInputs() {
		return unresolvedInputs;
	}

	public void setUnresolvedInputs(ArrayList<StateDefinition> unresolvedInputs) {
		this.unresolvedInputs = unresolvedInputs;
	}

	public ArrayList<StateDefinition> getUnresolvedOutputs() {
		return unresolvedOutputs;
	}

	public void setUnresolvedOutputs(ArrayList<StateDefinition> unresolvedOutputs) {
		this.unresolvedOutputs = unresolvedOutputs;
	}

	public TransitionDefinition getUnresolvedTransition() {
		return unresolvedTransition;
	}

	public void setUnresolvedTransition(TransitionDefinition unresolvedTransition) {
		this.unresolvedTransition = unresolvedTransition;
	}
	
	
}
