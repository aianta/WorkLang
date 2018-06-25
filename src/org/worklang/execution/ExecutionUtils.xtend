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