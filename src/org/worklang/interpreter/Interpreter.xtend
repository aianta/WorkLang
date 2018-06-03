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
		val resource = set.createResource(URI.createURI("dummy:/data.work"))
		
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