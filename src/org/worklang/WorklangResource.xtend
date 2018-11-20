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
import org.apache.tinkerpop.gremlin.structure.Vertex
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.worklang.interpreter.WorkApi
import org.worklang.work.Domain
import java.util.Date
import java.time.Instant
import org.slf4j.LoggerFactory

class WorklangResource extends LazyLinkingResource{
	
	val static logger = LoggerFactory.getLogger(WorkApi)
	
	@Inject
	IScopeProvider scopeProvider
	
	@Inject
	IQualifiedNameProvider qualifiedNameProvider
	
	var Neo4JGraph graph
	
	var Vertex globalWorkspace
	
	val worklangKey = "worklangKey"
	val date = Date.from(Instant.now)
	
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
		 	
		 	
		 	allContents.filter[ele|
		 		ele.eClass.instanceClass.equals(org.worklang.work.Domain)
		 	].forEach[ele|
		 		
		 		val domain = ele as Domain
		 		
		 		/* 
		 		var domainVertex = graph.addVertex("Domain")
		 		domainVertex.property(VertexProperty.Cardinality.single, "name", domain.name)
		 		domainVertex.property(VertexProperty.Cardinality.single, worklangKey, domain.eClass.instanceTypeName)
		 		domainVertex.property(VertexProperty.Cardinality.single, "created", date.toString) */
		 		
		 		var tx = graph.tx
		 		
		 		//Create vertices for all states in the definition space of the domain
		 		domain.definitionSpace.states.forEach[state|
		 			var stateVertex = graph.addVertex("State")
		 			stateVertex.property(VertexProperty.Cardinality.single, "name", state.name)
		 			stateVertex.property(VertexProperty.Cardinality.single, worklangKey, state.eClass.instanceTypeName)
		 			stateVertex.property(VertexProperty.Cardinality.single, "created", date.toString)
		 			
		 		]
		 		
		 		//Commit states to the model graph, we must do this before we create edges
		 		tx.commit
		 		
		 		tx = graph.tx
		 		
		 		//Create edges for all transitions in the definition space of the domain
		 		domain.definitionSpace.transitions.forEach[transition|
		 			var inputState = graph.vertices("match (n:State {name:'"+ transition.input.name +"'}) return n").head
		 			var outputState = graph.vertices("match (n:State {name:'"+ transition.output.name + "'}) return n").head
		 			
		 			inputState.addEdge("transition", outputState,
		 				"name", transition.name,
		 				worklangKey, transition.eClass.instanceTypeName,
		 				"created", date.toString
		 			)
		 		]
		 		
		 		
		 		tx.commit
		 		
		 		logger.info("testing path")
		 		
		 		var inputState = graph.vertices("match (n:State {name:'name'}) return n").head
		 		var outputState = graph.vertices("match (n:State {name:'accountBalance'}) return n").head
		 		
		 		//graph.traversal.V(inputState.id).repeat(graph.traversal.V().outE().inV.simplePath).until(hasId(outputState.id))
		 		
		 		var traversal = graph.traversal.V(inputState.id)
		 		
		 		var repeat = graph.traversal.V.outE.inV.simplePath
		 		
		 		var path = traversal.repeat(repeat).until(traversal.hasId(outputState.id)).path.limit(1)
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 	]
		 	  
		 	  
		 	
		 
		 	
		 
		 }else{
		 	println("We should save to the .work file!")
		 	super.doSave(outputStream,options)
		 }
		 
	}

}