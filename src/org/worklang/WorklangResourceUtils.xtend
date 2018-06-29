package org.worklang

import org.eclipse.xtext.resource.XtextResource
import org.worklang.interpreter.WorkApi
import org.worklang.work.StateDefinition
import org.worklang.work.FieldDefinition
import org.slf4j.LoggerFactory
import org.worklang.work.InstanceSpace
import org.worklang.work.Instance
import org.worklang.work.TransitionInstance
import org.worklang.work.DefinitionSpace
import org.worklang.work.TransitionDefinition

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
	
	def static Instance resolveTransitionInstance(String fieldName, String transitionName){
		resolveInstanceSpace(fieldName).instances.filter[instance|
			instance.transition !== null
		].findFirst[instance|
			instance.name.equals(transitionName)
		]
	}
	
	def static FieldDefinition resolveField(String fieldName){
		
		var XtextResource model = WorkApi.activeResource
		
		var targetField = model.allContents.filter[ele|
			ele.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
		].findFirst[fieldEObject|
			(fieldEObject as FieldDefinition).name.equals(fieldName)
		] as FieldDefinition
		
		return targetField
	}
	
	def static TransitionDefinition resolveTransition(String fieldName, String transitionName){
		
		resolveDefinitionSpace(fieldName).transitions.findFirst[transition|
			transition.name.equals(transitionName)
		]
		
	}
	
	def static DefinitionSpace resolveDefinitionSpace(String fieldName){
		
		var XtextResource model = WorkApi.activeResource
		
		resolveField(fieldName).definitionSpace
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
	
	def static Instance resolveInstance(String fieldName, String instanceName){
		
		var InstanceSpace space = resolveInstanceSpace(fieldName)
		
		return space.instances.findFirst[instance|
			instance.name.equals(instanceName)
		]
		
	}
}