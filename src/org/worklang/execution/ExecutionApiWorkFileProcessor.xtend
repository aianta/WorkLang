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

import org.eclipse.xtext.resource.XtextResource
import org.worklang.work.FieldDefinition
import org.worklang.work.Instance
import org.worklang.work.TransitionInstance
import org.worklang.work.CompoundTransitionInstance

/** Encapsulate work file processing for the execution api into
 *  and Xtend Class since EMF resources are much easier to manipulate
 * 	with Xtend than Java.
 * 
 * 	Ideally there should be a processor for the meta model in the future.
 */

class ExecutionApiWorkFileProcessor {
	
	var ExecutionApi api;
	
	new (ExecutionApi api){
		this.api = api
	}
	
	def processWorkFile(XtextResource workFile) {
		
		processTransitionInstances(workFile);
		processTransitionDefinitions(workFile);
		
	}
	
	def private processTransitionInstances(XtextResource workFile) {
		
		workFile.allContents.filter[worklangElement|
			worklangElement.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
		].forEach[fieldEObject|
			val field = fieldEObject as FieldDefinition
			
			//Process primitive instance transitions
			field.instanceSpace.instances.filter[instance|
				instance.eContents.exists[instanceComponent|
					instanceComponent instanceof TransitionInstance
				]
			].forEach[primitiveTransition|
				
				api.addProxyRoute(field.name, primitiveTransition);
			]
			
			//Process compound instance transitions
			field.instanceSpace.instances.filter[instance|
				instance.eContents.exists[instanceComponent|
					instanceComponent instanceof CompoundTransitionInstance
				]
			].forEach[compoundTransition|
				
				/* If a processor doesn't exist for this compound instance transition, 
				 * create one. 
				 * 
				 * IMPORTANT: DO NOT REPLACE EXISTING PROCESSOR
				 */
				 
				 if (!api.routeExists(
				 "/" + field.name.toLowerCase + "/" +
				 compoundTransition.transitionDeclaration.transition.name.toLowerCase + "/" + 
				 compoundTransition.name.replaceAll("\\s", "").toLowerCase
				 )){
				 	api.addCompoundTransitionProcessor(field.name, compoundTransition);
				 }
				
				
			]
			
			//Process primitive transitions
			field.definitionSpace.transitions.filter[transition|
				transition.type.equals("primitive")
			].forEach[primitiveTransition|
				
				
				//TODO 
				
			]
			
			//Process compound transitions
			field.definitionSpace.transitions.filter[transition|
				transition.type.equals("compound")
			].forEach[compoundTransition|
				
				//TODO
			]
		]
		
	}

	
	def private processCompoundTransitionInstance(Instance compoundTransition) {
		
		
		
	}
	
	def private processTransitionDefinitions(XtextResource workFile) {
		
	}
	
	def private processPrimitiveTransitionDefinition(XtextResource workFile) {
		
	}
	
	def private processCompoundTransitionDefinition(XtextResource workFile) {
		
	}
	
}