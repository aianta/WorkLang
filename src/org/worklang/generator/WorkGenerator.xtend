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
package org.worklang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.resource.XtextResource

import org.slf4j.LoggerFactory

import org.worklang.interpreter.WorkApi



/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WorkGenerator extends AbstractGenerator {
	
	val static logger = LoggerFactory.getLogger(WorkGenerator)

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var XtextResource xResource = resource as XtextResource
		
		
		//Test WorkResource binding
		val Map<String,String> globalWorkspaceSaveOptions = new HashMap<String,String>
		globalWorkspaceSaveOptions.put("WorkPersistenceType", "globalWorkspace")
		
		xResource.save(globalWorkspaceSaveOptions)
		WorkApi.activeResource = xResource
		
		//Attach Content Adapter
		//var adapter = new InstanceSpaceAdapter();
		//xResource.eAdapters.add(adapter);
		
		generateAPIs(xResource)

	}
	
	def static generateAPIs(XtextResource xResource){
		
		
	}
}
