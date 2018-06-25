package org.worklang

import org.eclipse.xtext.resource.XtextResource
import org.worklang.interpreter.WorkApi
import org.worklang.work.StateDefinition
import org.worklang.work.FieldDefinition
import org.slf4j.LoggerFactory
import org.worklang.work.InstanceSpace

class WorklangResourceUtils {
	
	var static logger = LoggerFactory.getLogger(WorklangResourceUtils)
	
	//Utility method to return State Definition, given a field and state name
	def static StateDefinition resolveStateDefinition(String fieldName, String stateName) {
		
		var XtextResource model = WorkApi.getActiveResource();
		
		var targetField = model.allContents.filter[ele| //Filter out everything but fields
			ele.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
		].findFirst[fieldEObject| //Filter out all fields that don't have the name we're looking for
			(fieldEObject as FieldDefinition).name.equals(fieldName)
		] as FieldDefinition
		
		if (targetField.definitionSpace !== null){
			
			return targetField.definitionSpace.states.findFirst[state|
				state.name.equals(stateName)
			]
			
		}else{ 
			logger.error("Cannot resolve state definition, {} does not have a definition space", fieldName)
			throw new Exception()
		}
		
	}
	
	def static InstanceSpace resolveInstanceSpace(String fieldName){
		
		var XtextResource model = WorkApi.activeResource
		
		var targetField = model.allContents.filter[ele|
			ele.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
		].findFirst[fieldEObject|
			(fieldEObject as FieldDefinition).name.equals(fieldName)
		] as FieldDefinition
		
		return targetField.instanceSpace
	}
}