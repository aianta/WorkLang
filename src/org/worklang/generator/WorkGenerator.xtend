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
import org.neo4j.driver.v1.Driver
import org.neo4j.driver.v1.GraphDatabase
import org.neo4j.driver.v1.AuthTokens
import com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider
import com.steelbridgelabs.oss.neo4j.structure.providers.Neo4JNativeElementIdProvider
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import org.apache.tinkerpop.gremlin.structure.Transaction
import org.worklang.work.FieldDefinition
import org.worklang.work.Instance
import org.slf4j.LoggerFactory
import java.io.File
import java.io.FileWriter
import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.ProcessBuilder.Redirect
import java.util.ArrayList
import org.worklang.interpreter.WorkApi

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WorkGenerator extends AbstractGenerator {
	
	val static logger = LoggerFactory.getLogger(WorkGenerator)
	val GEN_PATH = "R:/transitions-gen"

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var XtextResource xResource = resource as XtextResource
		
		
		//Test WorkResource binding
		val Map<String,String> globalWorkspaceSaveOptions = new HashMap<String,String>
		globalWorkspaceSaveOptions.put("WorkPersistenceType", "globalWorkspace")
		
		xResource.save(globalWorkspaceSaveOptions)
		WorkApi.activeResource = xResource
		
		val paths = new ArrayList<String>
		
		//Create Execution API for transition instances
		xResource.allContents.filter[ele|
			ele.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
		].forEach[fieldEObject|
			val field = fieldEObject as FieldDefinition
			
			field.instanceSpace.instances.filter[instance|
				instance.transitionDeclaration !== null //Filter out state instances
			].forEach[transitionInstance|
				
				WorkApi.executionManager.addTransition(field.name, transitionInstance)
						
			]
		]

	}
}
