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
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.Inject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import org.worklang.work.impl.StateIDImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.worklang.work.TransitionObjectDefinition

class WorklangResource extends LazyLinkingResource{
	
	@Inject
	IScopeProvider scopeProvider
	
	@Inject
	IQualifiedNameProvider qualifiedNameProvider
	
	val Driver graphDBDriver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j","admin"))
	
	val Neo4JElementIdProvider vertexIdProvider = new Neo4JNativeElementIdProvider
	val Neo4JElementIdProvider edgeIdProvider = new Neo4JNativeElementIdProvider
	
	var Neo4JGraph graph
	
	new (){
		super()
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
					
					//Commit state structures
					println("commit state structures")
					t.commit
					
					val t2 = graph.tx
					
					//Create graph structure for namespace transitions
					namespace.transitions.forEach[transition|
						var transitionVertex = generateTransitionGraphStructure(transition)
						fieldNamespaceVertex.addEdge("definesTransition", transitionVertex,
							"field", field.space.name,
							"space", field.conceptualspace.spaceType
						)
					]
					
					
					//Resolve relationships between states for compound states
					namespace.states.filter[state| state.type.equals("compound")]
						.forEach[stateObjectDefinition|
							
							var with = stateObjectDefinition.state.withDefinition
							
							var compoundStateName = stateObjectDefinition.state.state.name
							
							println("in dosave stateID name= " + compoundStateName)
							var compoundStateVertex = graph.vertices("match (n:`org.worklang.work.StateObjectDefinition` {name:'"+ compoundStateName +"'}) return n").head
							
							
							//Create With vertex
							var withVertex = graph.addVertex(org.worklang.work.WithStatesDefinition.typeName)
							withVertex.property(VertexProperty.Cardinality.single, "name", "with")
							
							var predicateVertex = generatePredicateGraphStructure(with.predicate)
							
							//Connect predicate to with With
							withVertex.addEdge("has", predicateVertex).property("type","composition")
							
							//Connect With to compound state
							compoundStateVertex.addEdge("composedWith", withVertex).property("type","composition")
						]
					
					println("commit transition and computed compound state structures")
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
						
		//If predicate contains a state
		predicate.eContents.filter[predicateEle| predicateEle.eClass.instanceClass.equals(org.worklang.work.StateID)]
			.forEach[stateId|
				
				var composedStateVertex = generateComposedStateGraphStructure(stateId as StateID)
			
				//Attach composed state to predicate vertex
				predicateVertex.addEdge("has", composedStateVertex).property("type","composition")
				
			]
			
							
		//If predicate contains an operation
		predicate.eContents.filter[predicateEle| predicateEle.eClass.instanceClass.equals(org.worklang.work.Operation)]
			.forEach[operation|
				var operationVertex = generateOperationGraphStructure(operation as Operation)
				var operationEdge = predicateVertex.addEdge("has", operationVertex)
				operationEdge.property("type","composition")			
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
		
		var leftEdge = operationVertex.addEdge("leftOperator", leftVertex)
		leftEdge.property("type","composition")
		
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
		
		var rightEdge = operationVertex.addEdge("rightOperator", rightVertex)
		rightEdge.property("type","composition")
		
		return operationVertex
	}
	
	def generateComposedStateGraphStructure(StateID stateId){
		var composedStateVertex = graph.addVertex(org.worklang.work.StateID.typeName)
		composedStateVertex.property(VertexProperty.Cardinality.single, "name", "composedState")
		
		var lookupStateName = (stateId.eCrossReferences.get(0) as StateID).name
		
		println("looking for: " + lookupStateName)
		
		//NOTE: Potential Cypher injection exploit 
		var refStateIdLookup = graph.vertices(
			"match (n:`org.worklang.work.StateObjectDefinition` {name:'"+ lookupStateName +"'}) return n"
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
	
	def generateTransitionGraphStructure(TransitionObjectDefinition transition){
		
		var transitionVertex = graph.addVertex(org.worklang.work.TransitionObjectDefinition.typeName)
		transitionVertex.property(VertexProperty.Cardinality.single, "name", transition.transition.transition.name)
		
		var transitionDefinition = transition.transition
		var hasInput = if (transitionDefinition.in !== null) true else false
		
		transitionVertex.property(VertexProperty.Cardinality.single, "hasInput", hasInput)
		transitionVertex.property(VertexProperty.Cardinality.single, "hasOutput", true) //All transitions must have an output
		
		//If the transition requires an input
		if (hasInput){
			
			//Create input vertex
			val inputVertex = graph.addVertex(org.worklang.work.InputDefinition.typeName)
			inputVertex.property(VertexProperty.Cardinality.single, "name", "input")
			
			//Create graph structures for input parameters
			transitionDefinition.in.eCrossReferences.forEach[input|
			
			var inputStateName = (input as StateID).name
			
			//Add a parameter property to input vertex with the state name
			inputVertex.property(VertexProperty.Cardinality.list, "parameter", inputStateName)
			
			//Find input state vertex in graph and connect it to input vertex
			var inputStateVertex = graph.vertices("match (n:`org.worklang.work.StateObjectDefinition` {name:'"+ inputStateName +"'}) return n").head
			inputVertex.addEdge("hasParameter", inputStateVertex)
				.property("resolves", inputStateName)
		
			]
			
			//Attach input vertex to transition vertex
			transitionVertex.addEdge("requires", inputVertex)
		}
		
		
		val outputVertex = graph.addVertex(org.worklang.work.OutputDefinition.typeName)
		outputVertex.property(VertexProperty.Cardinality.single, "name", "output")
		
		//Create graph structures for output parameters
		transitionDefinition.out.eCrossReferences.forEach[output|
			
			var outputStateName = (output as StateID).name
			
			println("transition output looking for " + outputStateName)
			
			//Add a parameter property to output vertex with the state name
			outputVertex.property(VertexProperty.Cardinality.list, "parameter", outputStateName)
			
			//Find output state vertex in graph and connect it to output vertex
			var outputStateVertex = graph.vertices("match (n:`org.worklang.work.StateObjectDefinition` {name:'"+ outputStateName +"'}) return n").head
			outputVertex.addEdge("hasParameter", outputStateVertex)
				.property("resolves", outputStateName)
		
		]
		
		//Attach output vertex to transition vertex
		transitionVertex.addEdge("produces", outputVertex)
		
		return transitionVertex
	}
}