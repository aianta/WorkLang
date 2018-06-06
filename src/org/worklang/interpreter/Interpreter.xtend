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

package org.worklang.interpreter

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.GeneratorDelegate
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import java.io.ByteArrayInputStream
import org.eclipse.xtext.resource.XtextResource

class Interpreter {
	
	
	@Inject Provider<ResourceSet> resourceSetProvider

	@Inject IResourceValidator validator

	@Inject GeneratorDelegate generator

	@Inject JavaIoFileSystemAccess fileAccess

	def protected runGenerator(String worklangData) {
		// Load the resource
		val set = resourceSetProvider.get
		

		/*	Create a URI for the resource
		 * 	relative URIs within the document will be resolved relative to the
		 *	absolute URI of the containing resource.
		 */
		val resource = set.createResource(URI.createURI("file:/data.work")) as XtextResource
		
		
		
		//Create ByteStream from input string 
		
		var ByteArrayInputStream resourceByteStream = new ByteArrayInputStream(worklangData.getBytes())
		
		try{
			resource.load(resourceByteStream, null)
		}catch (Exception e){
			e.printStackTrace
		}
		
		// Validate the resource
		val issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
		if (!issues.empty) {
			issues.forEach[System.err.println(it)]
			return
		}

		// Configure and start the generator
		fileAccess.outputPath = 'src-gen/'
		val context = new GeneratorContext => [
			cancelIndicator = CancelIndicator.NullImpl
		]
		generator.generate(resource, fileAccess, context)
		System.out.println('Code generation finished.')
	}
	
}