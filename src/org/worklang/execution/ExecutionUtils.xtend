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

package org.worklang.execution

import org.worklang.work.Instance
import io.vertx.core.json.JsonObject
import org.worklang.work.SetStatement
import org.worklang.work.UseDefinition
import io.vertx.core.json.JsonArray
import org.slf4j.LoggerFactory

class ExecutionUtils {
	
	val static logger = LoggerFactory.getLogger(ExecutionUtils)
	
	def static JsonArray collectionInstanceToJsonArray(Instance instance){
		
		val JsonArray jsonArrayInstance = new JsonArray
		
		
		//TODO handle n-dimensional array nesting
		instance.collection.elements.forEach[element|

			//If the element is based on a primitive state, return its value as a simple string in the array
			if (element.stateDeclaration.state.type.equals("primitive")){
				jsonArrayInstance.add((element.state.members.get(0) as SetStatement).toDef.value)
			}
			
			//If the element is based on a compound state, let stateInstanceToJson figure it out
			if (element.stateDeclaration.state.type.equals("compound")){
				jsonArrayInstance.add(stateInstanceToJson(element))
			}
			 
		]
		
		return jsonArrayInstance
		
	}
	
	def static JsonObject stateInstanceToJson(Instance instance){
		
		logger.info("creating json object from state instance")
		
		val JsonObject jsonInstance = new JsonObject
		
		instance.state.members.forEach[member|
			
			/* Handle cases:
			 *  	- Use Statement
			 * 		- Set Statement
			 */		
			
			if (member instanceof SetStatement){
				var setStmt = member as SetStatement
				
				jsonInstance.put(setStmt.variable.name, setStmt.toDef.value)
			}
			
			if (member instanceof UseDefinition){
				var useDef = member as UseDefinition
				
				var useValue = useDef.predefinedValue
				
				if (useValue.collection !== null){
					jsonInstance.put(useValue.stateDeclaration.state.name, collectionInstanceToJsonArray(useValue))
				}
				
				if (useValue.state !== null){
					jsonInstance.put(useValue.stateDeclaration.state.name, stateInstanceToJson(useDef.predefinedValue))
				}
				
				
			}
			
		]
		
		return jsonInstance
		
	}
}