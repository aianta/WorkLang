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
import io.vertx.core.json.JsonObject
import org.worklang.work.WorkFactory
import java.util.List
import org.worklang.work.CompoundStateDefinition
import java.util.ArrayList
import org.worklang.work.PrimitiveStateDefinition
import org.worklang.work.Operation
import org.worklang.work.Predicate
import org.worklang.structures.StateComponents
import java.util.HashMap
import java.util.Map
import org.worklang.work.impl.PrimitiveStateDefinitionImpl
import org.worklang.work.impl.CompoundStateDefinitionImpl
import org.worklang.work.SetStatement
import org.eclipse.emf.ecore.util.EcoreUtil

class WorklangResourceUtils {
	
	var static logger = LoggerFactory.getLogger(WorklangResourceUtils)
	var static factory = WorkFactory.eINSTANCE
	
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
			instance.transitionDeclaration !== null
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
		
		var Instance result =  space.instances.findFirst[instance|
			instance.name.equals(instanceName)
		]
		
		if (result === null){
			logger.error("Could not resolve instance ->{} in field ->{}", instanceName, fieldName);
		}
		
		return result;
	}
	
	def static Instance mapInstancesToCollectionInstance(CompoundStateDefinition compoundDefinition, List<Instance> instances){
		
		val i = factory.createInstance
		
		i.stateDeclaration = factory.createStateDeclaration
		i.stateDeclaration.state = compoundDefinition as StateDefinition
		i.collection = factory.createCollectionInstance
		
		//Populate collection instance elements
		instances.forEach[instance|
			
			if (!instance.isIsCollectionElement){
				logger.error("Execution instruction resulting in collection instance produced instance that wasn't collection element! ")
				throw new Exception("Cannot create collection instance if all instances aren't collection elements!")
			}
			
			i.collection.elements.add(i)
		]
		
		return i
		
	}
	
	def static Instance mapInstancesToCompoundInstance(CompoundStateDefinition compoundDefinition, List<Instance> instances){
		
		if (validateInstances(compileComponents(compoundDefinition), instances)){
			logger.info("Instances are valid for creating compound state instance of type ->{}",
				compoundDefinition.name
			)
			
			val i = factory.createInstance
			i.stateDeclaration = factory.createStateDeclaration
			i.stateDeclaration.state = compoundDefinition as StateDefinition
			i.state = factory.createStateInstance
			
			//Populate primitive instance children
			instances.filter[instance|
				instance.stateDeclaration.state.type.equals("primitive")
			].forEach[primitiveInstance|
				//Create set statements for all primitive instance children 
				var setStmt = EcoreUtil.copy(primitiveInstance.state.members.get(0)) as SetStatement
				i.state.members.add(setStmt)
			]
			
			//Populate compound instance children
			instances.filter[instance|
				instance.stateDeclaration.state.type.equals("compound")
			].forEach[compoundInstance|
				//Create use statements for all compound instance children
				var useDef = factory.createUseDefinition
				useDef.predefinedValue = compoundInstance
			]
			
			return i
			
		}else{
			logger.error("Instances cannot be used to create compound state instance of type -> {}",
				compoundDefinition.name
			)
		}
		
		
		return null;
	}
	
	def static private boolean validateInstances(StateComponents definition, List<Instance> instances){
		
		val Map<StateDefinition, Boolean> result = new HashMap
		
		//Add all instance definitions to result
		instances.forEach[instance|
			result.put(instance.stateDeclaration.state, false);
		]
		
		
		//Verify that all primitive ANDs exist
		var primitiveAndIt = definition.andPrimitives.iterator
		var primitiveAndFail = false
		
		while(primitiveAndIt.hasNext){
			var curr = primitiveAndIt.next
			var match = result.get(curr)
			if (match !== null){
				match = true
			}else{
				primitiveAndFail = true
			}
		}
			
		
		
		//Verify that all compound ANDs exist
		var compoundAndIt = definition.andCompounds.iterator
		var compoundAndFail = false
		
		while(compoundAndIt.hasNext){
			var curr = compoundAndIt.next
			var match = result.get(curr)
			if (match !== null){
				match = true
			}else{
				compoundAndFail = true
			}
		}
		
		//Verify that primitive OR is satisfied
		var primitiveOrIt = definition.orPrimitives.iterator
		var primitiveOr = false;
		
		while(primitiveOrIt.hasNext){
			var curr = primitiveOrIt.next
			var candidate = result.get(curr)
			if (candidate !== null){
				candidate = true
				primitiveOr = true
			}
		}
		
		
		//Verify that compound OR is satisfied
		var compoundOrIt = definition.orPrimitives.iterator
		var compoundOr = false;
		
		while (compoundOrIt.hasNext){
			val curr = compoundOrIt.next
			var candidate = result.get(curr)
			if (candidate !== null){
				candidate = true
				compoundOr = true
			}
		}
		
		//Remove all true results
		val finalResult = new ArrayList<Instance>
		
		result.filter[instanceDef, value|
			value == false					//Find all instance defs that are unresolved 
		].forEach[instanceDef, value|
			instances.filter[instance|
				instance.stateDeclaration.state == instanceDef 	//Find associated instance
			].forEach[instance|
				finalResult.add(instance) //Add associated instance to final result
			]
			
		]
		
		if (finalResult.size == 0){
			if (!primitiveAndFail && !compoundAndFail && primitiveOr && compoundOr){
				return true
			}else{
				return false
			}
		}else{
			//Create a list of sub components that didn't validate 
			var subComponentsResult = 
			definition.subComponents.filter[subComponent|
				validateInstances(subComponent, finalResult) != true
			]
			
			//If there are no sub components that didn't validate
			if (subComponentsResult.size == 0){
				return true 
			}else{
				return false
			}
		}
		
			
		
		
	}
	
	
	def static private compileComponents (CompoundStateDefinition compoundDefinition){

		var rootPredicate  = compoundDefinition.composition.predicate
		
		var result = extractPredicateComponents(rootPredicate)
		
		logger.info("Components for compound definition -> {} {}", compoundDefinition.name, result.toJson.encodePrettily);
		
		return result
		
	}
	
	def static private StateComponents extractOperationComponents (Operation o){
		val result = new StateComponents
		
		if (o.op.equals("AND")){
			logger.info("Operation was an AND operation")
			var andResult = extractANDOperationComponents(o)
			logger.info("andResult -> {}", andResult.toJson.encodePrettily)
			
			andResult.andPrimitives.forEach[ele|
				result.andPrimitives.add(ele)
			]
			
			andResult.andCompounds.forEach[ele|
				result.andCompounds.add(ele)
			]
			
			andResult.subComponents.forEach[ele|
				result.subComponents.add(ele)
			]

		}
		
		if (o.op.equals("OR")){
			logger.info("Operation was an OR operation")
			var orResult = extractOROperationComponents(o)
			logger.info("orResult -> {}", orResult.toJson.encodePrettily)
			
			orResult.orPrimitives.forEach[ele|
				result.orPrimitives.add(ele)
			]
			
			orResult.orCompounds.forEach[ele|
				result.orCompounds.add(ele)
			]
			
			orResult.subComponents.forEach[ele|
				result.subComponents.add(ele)
			]
			
		}
		
		return result
	}
	
	def static private StateComponents extractANDOperationComponents(Operation o){
		val result = new StateComponents
		
		//Extract left
		var it = o.left
		logger.info("o.left ->{}", it)
		
		switch(it){
			case it instanceof StateDefinition:
			{
				if ((it as StateDefinition).instance.type.equals("primitive")){
					logger.info("left was primitive state definition")
					result.andPrimitives.add(it as StateDefinition)
				}
				
				if ((it as StateDefinition).instance.type.equals("compound")){
					logger.info("left was compound state definition")
					result.andCompounds.add(it as StateDefinition)
				}
			}
			case it instanceof Predicate:
			{
				logger.info("left was predicate")
				result.subComponents.add(extractPredicateComponents(it as Predicate))
			}
			case it instanceof Operation:
				{
					logger.info("left was operation")
					var subResult = extractOperationComponents(it as Operation)
					//Merge primitive ANDs
					subResult.andPrimitives.forEach[primitive|
						result.andPrimitives.add(primitive)
					]
					//Merge compound ANDS
					subResult.andCompounds.forEach[compound|
						result.andCompounds.add(compound)
					]
					//Merge subcomponents
					subResult.subComponents.forEach[subComp|
						result.subComponents.add(subComp)
					]
				}
		}
		
		//Extract right
		it = o.right
		logger.info("o.right ->{}", it)
		switch (it){
			case it instanceof StateDefinition:
			{
				if ((it as StateDefinition).instance.type.equals("primitive")){
					logger.info("right was primitive state definition")
					result.andPrimitives.add(it as StateDefinition)
				}
				
				if ((it as StateDefinition).instance.type.equals("compound")){
					logger.info("right was compound state definition")
					result.andCompounds.add(it as StateDefinition)
				}
			}
			case it instanceof Predicate:
			{
				logger.info("right was predicate")
				result.subComponents.add(extractPredicateComponents(it as Predicate))
			}
			case it instanceof Operation:
				{
					logger.info("right was operation")
					var subResult = extractOperationComponents(it as Operation)
					//Merge primitive ANDs
					subResult.andPrimitives.forEach[primitive|
						result.andPrimitives.add(primitive)
					]
					//Merge compound ANDS
					subResult.andCompounds.forEach[compound|
						result.andCompounds.add(compound)
					]
					//Merge subcomponents
					subResult.subComponents.forEach[subComp|
						result.subComponents.add(subComp)
					]
				}
		}
		
		return result
	}
	
	def static private StateComponents extractOROperationComponents(Operation o){
		val result = new StateComponents
		
		/** Handle all cases:
		 *  - PrimitiveStateDefinition
		 * 	- CompoundStateDefinition
		 *  - Predicate
		 *  - Operation
		 */
		
		//Extract left
		var it = o.left
		
		switch(it){
			case it instanceof StateDefinition:
			{
				if ((it as StateDefinition).instance.type.equals("primitive")){
					logger.info("left was primitive state definition")
					result.orPrimitives.add(it as StateDefinition)
				}
				
				if ((it as StateDefinition).instance.type.equals("compound")){
					logger.info("left was compound state definition")
					result.orCompounds.add(it as StateDefinition)
				}
			}
			case it instanceof Predicate:
				result.subComponents.add(extractPredicateComponents(it as Predicate))
			case it instanceof Operation:
				{
					var subResult = extractOperationComponents(it as Operation)
					//Merge primitive ORs
					subResult.orPrimitives.forEach[primitive|
						result.orPrimitives.add(primitive)
					]
					//Merge compound ORs
					subResult.orCompounds.forEach[compound|
						result.orCompounds.add(compound)
					]
					//Merge subcomponents
					subResult.subComponents.forEach[subComp|
						result.subComponents.add(subComp)
					]
				}
		}
		
		//Extract right
		it = o.right
		
		switch (it){
			case it instanceof StateDefinition:
			{
				if ((it as StateDefinition).instance.type.equals("primitive")){
					logger.info("right was primitive state definition")
					result.orPrimitives.add(it as StateDefinition)
				}
				
				if ((it as StateDefinition).instance.type.equals("compound")){
					logger.info("right was compound state definition")
					result.orCompounds.add(it as StateDefinition)
				}
			}
			case it instanceof Predicate:
				result.subComponents.add(extractPredicateComponents(it as Predicate))
			case it instanceof Operation:
				{
					var subResult = extractOperationComponents(it as Operation)
					//Merge primitive ORs
					subResult.orPrimitives.forEach[primitive|
						result.orPrimitives.add(primitive)
					]
					//Merge compound ORs
					subResult.orCompounds.forEach[compound|
						result.orCompounds.add(compound)
					]
					//Merge subcomponents
					subResult.subComponents.forEach[subComp|
						result.subComponents.add(subComp)
					]
				}
		}
		
		return result
	}
	
	def static private StateComponents extractPredicateComponents(Predicate p){
		var result = new StateComponents
		
		var it = p.expression;
		/** Handle all cases:
		 *  - PrimitiveStateDefinition
		 * 	- CompoundStateDefinition
		 *  - Operation
		 */
		
		switch (it){
			//Any Primitive or Compound States in a predicate are implicitly ANDed
			case it instanceof StateDefinition:
			{
				if ((it as StateDefinition).instance.type.equals("primitive")){
					logger.info("state was primitive state definition")
					result.andPrimitives.add(it as StateDefinition)
				}
				
				if ((it as StateDefinition).instance.type.equals("compound")){
					logger.info("state was compound state definition")
					result.andCompounds.add(it as StateDefinition)
				}
			}

			case it instanceof Operation:
			{
				logger.info("Predicate expression was operation")
				result.subComponents.add(extractOperationComponents(it as Operation))
			}
		}
		
		return result;
	}
}