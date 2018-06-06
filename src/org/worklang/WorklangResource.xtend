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
import org.worklang.work.StateID
import org.apache.tinkerpop.gremlin.structure.Graph
import org.worklang.work.WithStatesDefinition
import org.worklang.work.Predicate
import org.apache.tinkerpop.gremlin.structure.Vertex
import org.worklang.work.Operation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EReference

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
					
					t.commit
					
					val t2 = graph.tx
					
					//Resolve relationships between states for compound states
					namespace.states.filter[state| state.type.equals("compound")]
						.forEach[stateObjectDefinition|
							
							var with = stateObjectDefinition.state.withDefinition
							
							println("in dosave stateID name= " + stateObjectDefinition.state.state.name)
							
							//Create With vertex
							var withVertex = graph.addVertex(org.worklang.work.WithStatesDefinition.typeName)
							withVertex.property(VertexProperty.Cardinality.single, "name", "with")
							
							var predicateVertex = generatePredicateGraphStructure(with.predicate)
							
							withVertex.addEdge(null, predicateVertex)
						]
					
					t2.commit
					
					//TODO Create graph referencespace structure
					var Referencespace referencespace = field.referencespace
					
					//TODO Create graph instancespace structure
					var Instancespace instancespace = field.instancespace
					
				]
				

				
			}catch (Exception it){
				it.printStackTrace
			}
		 	
		 	
		 }else{
		 	println("We should save to the .work file!")
		 	super.doSave(outputStream,options)
		 }
		
	}
	
	def generatePredicateGraphStructure (Predicate predicate){
		
		val predicateVertex = graph.addVertex(org.worklang.work.Predicate.typeName)
		predicateVertex.property(VertexProperty.Cardinality.single, "name", "predicate")
		
		//NOTE: if negation behaves wierd, this is probably why. Look at the grammar implementation for Predicate
		predicateVertex.property(VertexProperty.Cardinality.single, "negation", predicate.negation)
		
		
		
		/* Handle possible predicate structures:
		 * setOf, single state, and Operations (AND/OR) 
		 */
		
		predicate.eContents.forEach[pEl|
			val pEle = pEl as StateID
			println("CrossRef " + pEle.eIsProxy) 
			println("CrossRef name " + pEle.name)
			println("CrossRef value.name " + pEle.value.name)
			
			pEle.eClass.EAllAttributes.forEach[EAttribute attr|
				println("Attr: " + attr.EType.instanceTypeName)
			]
			
			pEle.eClass.EAllStructuralFeatures.forEach[EStructuralFeature feat|
				println("feat: " + feat.eClass.instanceTypeName)	
			]
			
			pEle.eClass.EReferences.forEach[EReference ref|
				var StateID resolvedStateId = pEle.eGet(ref, true) as StateID
				println("resolved: " + resolvedStateId.name)
			]
			
		]
						
		//If predicate contains a state
		predicate.eContents.filter[predicateEle| predicateEle.eClass.instanceClass.equals(org.worklang.work.StateID)]
			.forEach[stateId|
				
				(stateId as StateID).eCrossReferences.forEach[crossEle|println(crossEle.eClass.instanceTypeName)]
				
				println("in pred gen stateID name= " + (stateId as StateID).name)
				println("in pred gen stateID value.name= " +(stateId as StateID).value.name)
				
				var composedStateVertex = generateComposedStateGraphStructure(stateId as StateID)
			
				//Attach composed state to predicate vertex
				predicateVertex.addEdge(null, composedStateVertex)
			]
			
							
		//If predicate contains an operation
		predicate.eContents.filter[predicateEle| predicateEle.eClass.instanceClass.equals(org.worklang.work.Operation)]
			.forEach[operation|
				var operationVertex = generateOperationGraphStructure(operation as Operation)
				predicateVertex.addEdge(null, operationVertex)			
			]					
		
		return predicateVertex
	} 
	
	def Vertex generateOperationGraphStructure (Operation operation){
		
		var operationVertex = graph.addVertex(org.worklang.work.Operation.typeName)
		operationVertex.property(VertexProperty.Cardinality.single, "name", operation.op)
		
		/* Either side of the operation can only be one of the following:
		 * 	Predicate, StateID, another operation.
		 */
		
		//Resolve left hand side of operation
		var leftType = operation.left.eClass.instanceClass
		
		var leftVertex = 
			switch (leftType){
				case org.worklang.work.Operation:
					generateOperationGraphStructure(operation.left as Operation)
				case org.worklang.work.Predicate:
					generatePredicateGraphStructure(operation.left as Predicate)
				case org.worklang.work.StateID:
					generateComposedStateGraphStructure(operation.left as StateID)
				default: throw new IllegalArgumentException("Operation element wasn't Predicate, StateID, or another operation")
			}
		
		operationVertex.addEdge("leftOperator", leftVertex)
		
		//Resolve right hand side of operation
		
		var rightType = operation.right.eClass.instanceClass
		
		var rightVertex = 
			switch (rightType){
				case org.worklang.work.Operation:
					generateOperationGraphStructure(operation.right as Operation)
				case org.worklang.work.Predicate:
					generatePredicateGraphStructure(operation.right as Predicate)
				case org.worklang.work.StateID:
					generateComposedStateGraphStructure(operation.right as StateID)
				default: throw new IllegalArgumentException("Operation element wasn't Predicate, StateID, or another operation")
	
			}
		
		operationVertex.addEdge("rightOperator", rightVertex)
		
		return operationVertex
	}
	
	def generateComposedStateGraphStructure(StateID stateId){
		var composedStateVertex = graph.addVertex(org.worklang.work.StateID.typeName)
		
		println("looking for: " + stateId.value.name)
		
		//NOTE: Potential Cypher injection exploit 
		var refStateIdLookup = graph.vertices(
			"match (n:`org.worklang.work.StateObjectDefinition` {name:'"+ stateId.value.name +"'}) return n"
			)
							
		var refStateIdVertex = refStateIdLookup.head
								
		/*The composition can be referencing either a single instance of 
		 * the referenced state or a set of them. Build relationships in the
		 * meta model to reflect this.
		 */
		if (stateId.list){
			composedStateVertex.addEdge("setOf", refStateIdVertex)
		}else{
			composedStateVertex.addEdge("is", refStateIdVertex)
		}
		
		return composedStateVertex
	}
}