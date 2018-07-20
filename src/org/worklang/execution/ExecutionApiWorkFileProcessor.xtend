package org.worklang.execution

import org.eclipse.xtext.resource.XtextResource

interface ExecutionApiWorkFileProcessor {
	
	def void processWorkFile(XtextResource workFile);
	
}