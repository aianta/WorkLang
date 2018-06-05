package org.worklang

import org.eclipse.xtext.resource.XtextResource
import java.io.OutputStream
import java.io.IOException
import java.util.Map
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import org.apache.tinkerpop.gremlin.structure.Transaction
import org.neo4j.driver.v1.Driver
import com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider
import com.steelbridgelabs.oss.neo4j.structure.providers.Neo4JNativeElementIdProvider
import org.neo4j.driver.v1.AuthTokens
import org.neo4j.driver.v1.GraphDatabase
import org.apache.tinkerpop.gremlin.structure.VertexProperty
import org.worklang.work.FieldDefinition
import org.worklang.work.Namespace
import org.worklang.work.Referencespace
import org.worklang.work.Instancespace

class WorklangResource extends XtextResource{
	
	val Driver graphDBDriver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j","admin"))
	
	val Neo4JElementIdProvider vertexIdProvider = new Neo4JNativeElementIdProvider
	val Neo4JElementIdProvider edgeIdProvider = new Neo4JNativeElementIdProvider
	
	var Neo4JGraph graph
	
	new (){
		try{
			graph = new Neo4JGraph(graphDBDriver, vertexIdProvider, edgeIdProvider)
			
		}catch (Exception it){
			it.printStackTrace
		}
	}
	
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
		 	
		 	try {
				
				val Transaction t = graph.tx
				
				
				allContents
				.filter[ele|ele.eClass.instanceClass.equals(org.worklang.work.FieldDefinition)]
				.forEach[ele|
					
					//Create graph field structure
					val FieldDefinition field = ele as FieldDefinition
					
					
					//Create a vertex for the field
					var fieldVertex = graph.addVertex(ele.eClass.instanceTypeName)
					fieldVertex.property(VertexProperty.Cardinality.single, "type", "field")
					fieldVertex.property(VertexProperty.Cardinality.single, "name", field.space.name)
					
					//Create vertices for all field spaces
					val fieldNamespaceVertex = graph.addVertex(org.worklang.work.Namespace.typeName)
					fieldNamespaceVertex.property(VertexProperty.Cardinality.single, "name", field.conceptualspace.spaceType)
					
					val fieldReferencesVertex = graph.addVertex(org.worklang.work.Referencespace.typeName)
					fieldReferencesVertex.property(VertexProperty.Cardinality.single, "name", field.referencespace.spaceType)
					
					val fieldInstancesVertex = graph.addVertex(org.worklang.work.Instancespace.typeName)
					fieldInstancesVertex.property(VertexProperty.Cardinality.single, "name", field.instancespace.spaceType)
					
					//Create edges from field to fieldspaces
					fieldVertex.addEdge("nameSpace", fieldNamespaceVertex, "field", field.space.name)
					fieldVertex.addEdge("referenceSpace", fieldReferencesVertex, "field", field.space.name)
					fieldVertex.addEdge("instanceSpace", fieldInstancesVertex, "field", field.space.name)
					
					//Create graph namespace structure
					var Namespace namespace = field.conceptualspace
					
					//Create graph structures for namepsace states
					namespace.states.forEach[state|
						
						var stateVertex = graph.addVertex(org.worklang.work.StateObjectDefinition.typeName)
						stateVertex.property(VertexProperty.Cardinality.single, "stateType", state.type)
						stateVertex.property(VertexProperty.Cardinality.single, "name", state.state.state.name)
						
						fieldNamespaceVertex.addEdge("definesState", stateVertex, 
							"field", field.space.name,
							"space", field.conceptualspace.spaceType
							)
						
					]
					
					//Resolve relationships between states for compound states
					
					
					
					//TODO Create graph referencespace structure
					var Referencespace referencespace = field.referencespace
					
					//TODO Create graph instancespace structure
					var Instancespace instancespace = field.instancespace
					
				]
				
				t.commit
				
			}catch (Exception it){
				it.printStackTrace
			}
		 	
		 	
		 }else{
		 	println("We should save to the .work file!")
		 	super.doSave(outputStream,options)
		 }
		
	}
	
}