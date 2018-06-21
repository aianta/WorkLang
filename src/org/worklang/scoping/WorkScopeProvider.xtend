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
package org.worklang.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2
import org.worklang.work.ReferenceState

import org.worklang.work.FieldDefinition
import java.util.ArrayList
import org.worklang.work.StateMapping

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class WorkScopeProvider extends AbstractWorkScopeProvider {

			override getScope(EObject context, EReference reference){
		
		println("getting scope for context " + context + " with reference " + reference)
		
		
		//Resolve references to states in other fields in the same work file
		if (reference.name.equals("refState")){
			if (context instanceof org.worklang.work.ReferenceState){
				val scopeIDList = new ArrayList
				println("custom scoping rule")
				
				var refState = context as ReferenceState
				println("refState=" + refState)
				
				
				//Name of target field
				val targetField = refState.foreignField
				println("targetSpace=" + targetField)
				println("target space name: "+ targetField.name)
				
				
				/* Iterate through all fields in the current work file.
				 * Find target field.
				 * Use target field's definitionspace as scope for resolving the StateID
				 */
				
				val root = EcoreUtil2.getRootContainer(context)	
				
				
				
				//Target Field
				val targetFieldInstance = root.eContents.filter[rootElement| 
					rootElement.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
				].findFirst[ele|
					(ele as FieldDefinition).name.equals(targetField.name)
				]
				
				println("targetFieldInstance=" + targetFieldInstance)
				println("targetFieldInstance name: "+ (targetFieldInstance as FieldDefinition).name)
				
				var field = targetFieldInstance as FieldDefinition
				
				field.definitionSpace.states.forEach[stateDefinition|
					println("adding State Definition " + stateDefinition)
					scopeIDList.add(stateDefinition)
				]
				
				
				
				return Scopes.scopeFor(scopeIDList)
			}else{
				return super.getScope(context,reference)
			}
		}else if (reference.name.equals("foreignState")){
			if (context instanceof StateMapping){
				val scopeIDList = new ArrayList
				var mapping = context as StateMapping
				
				val field = mapping.field.name
				
				val root = EcoreUtil2.getRootContainer(context)	
				
				//Target Field
				val targetFieldInstance = root.eContents.filter[rootElement| 
					rootElement.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
				].findFirst[ele|
					(ele as FieldDefinition).name.equals(field)
				]
				
				println("targetFieldInstance=" + targetFieldInstance)
				println("targetFieldInstance name: "+ (targetFieldInstance as FieldDefinition).name)
				
				var resolvedField = targetFieldInstance as FieldDefinition
				
				resolvedField.definitionSpace.states.forEach[stateDefinition|
					println("adding State Definition " + stateDefinition)
					scopeIDList.add(stateDefinition)
				]
				
				return Scopes.scopeFor(scopeIDList)
				
			}else{
				super.getScope(context, reference)
			}
			
		}else{
			return super.getScope(context,reference)	
		}
			
	}

}
