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

package org.worklang.execution.structures;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.Instance;
import org.worklang.work.TransitionDefinition;

public class TransitionInfo {
	
	private static final Logger logger = LoggerFactory.getLogger(TransitionInfo.class);
	
	private TransitionDefinition definition = null;
	private UUID id = null;
	private Instance instance = null;
			
	public TransitionDefinition getDefinition() {
		return definition;
	}
	public void setDefinition(TransitionDefinition definition) {
		this.definition = definition;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Instance getInstance() {
		return instance;
	}
	public void setInstance(Instance instance) {
		//Verify that instance is a transition
		if (instance.getTransitionDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a transition.", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a transition."
			);
		}
		
		this.instance = instance;
	}
}
