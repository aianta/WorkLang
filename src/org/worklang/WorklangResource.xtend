package org.worklang

import org.eclipse.xtext.resource.XtextResource
import java.io.OutputStream
import java.io.IOException
import java.util.Map

class WorklangResource extends XtextResource{
	
	override doSave (OutputStream outputStream, Map<?,?> options) throws IOException {
		
		/* Check save options to determine if we should save to .work file 
		 * (invoke XtextResource doSave), or save to Neo4j.
		 */
		 
		 if (options !== null 
		 	&& options.containsKey("WorkPersistenceType") 
		 	&& options.get("WorkPersistenceType").equals("globalWorkspace")
		 ){
		 	//Save to Neo4j
		 	println("We should save to the global workspace!")
		 }else{
		 	println("We should save to the .work file!")
		 	super.doSave(outputStream,options)
		 }
		
	}
	
}