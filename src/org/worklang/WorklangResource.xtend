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

import java.io.OutputStream
import java.io.IOException
import java.util.Map
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import org.apache.tinkerpop.gremlin.structure.VertexProperty
import org.worklang.work.FieldDefinition
import org.apache.tinkerpop.gremlin.structure.Vertex
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.worklang.metamodel.FieldModelFactory
import java.util.ArrayList
import org.worklang.interpreter.WorkApi

class WorklangResource extends LazyLinkingResource{
	
	@Inject
	IScopeProvider scopeProvider
	
	@Inject
	IQualifiedNameProvider qualifiedNameProvider
	
	var Neo4JGraph graph
	
	var Vertex globalWorkspace
	
	new (){
		super()
		try{
			this.graph = WorkApi.graph
			
		}catch (Exception it){
			it.printStackTrace
		}
	}
	
	override doSave (OutputStream outputStream, Map<?,?> options) throws IOException{
		if (options !== null 
		 	&& options.containsKey("WorkPersistenceType") 
		 	&& options.get("WorkPersistenceType").equals("globalWorkspace")
		 ){
		 	
		 	//Clear previous meta model from db and APIs
		 	graph.execute("match (n) detach delete n")
		 	initMetaModel
		 	
		 	val fieldFactories = new ArrayList<FieldModelFactory>
		 	
		 	//Generate static meta models for all fields in the work file
		 	allContents.filter[ele|
		 		ele.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)
		 	].forEach[ele|
		 		
		 		val field = ele as FieldDefinition
		 		
		 		var fieldFactory =  new FieldModelFactory(graph, field, globalWorkspace)
		 		fieldFactory.generateInternal
		 		
		 		fieldFactories.add(fieldFactory)
		 	]
		 	
		 	//Generate dynamic meta models for all fields in the work file
			fieldFactories.forEach[fieldFactory|
				fieldFactory.generateExternal
			]
		 	
		 
		 }else{
		 	println("We should save to the .work file!")
		 	super.doSave(outputStream,options)
		 }
		 
	}

	def initMetaModel(){
			val t = graph.tx
			
			//Check to see if global workspace vertex exists, if not, create it
			var globalWorkspaceQuery  = graph.vertices("match (n:globalWorkspace) return n")
			
			var head =  globalWorkspaceQuery.head
			
			if ( head !== null){
				println("found global workspace")
				this.globalWorkspace = head
			}else{
				println("new global workspace")
				this.globalWorkspace = graph.addVertex("globalWorkspace")
				this.globalWorkspace.property(VertexProperty.Cardinality.single, "name", "Global Workspace")
			}
			
			
			t.commit
	}
}