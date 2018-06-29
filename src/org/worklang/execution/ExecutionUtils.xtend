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

class ExecutionUtils {
	
	def static StateInstanceToJson(Instance instance){
		
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
				
				jsonInstance.put(useDef.predefinedValue.name, StateInstanceToJson(useDef.predefinedValue))
			}
			
		]
		
		return jsonInstance
		
	}
}