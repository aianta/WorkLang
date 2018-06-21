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

package org.worklang.metamodel

import org.worklang.metamodel.MetaModelVertexFactory
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import org.worklang.work.FieldDefinition
import org.apache.tinkerpop.gremlin.structure.VertexProperty
import org.eclipse.emf.ecore.EObject
import org.worklang.work.DefinitionSpace
import org.worklang.work.InstanceSpace
import org.slf4j.LoggerFactory
import org.apache.tinkerpop.gremlin.structure.Vertex
import java.util.Date
import java.time.Instant
import org.worklang.work.CompoundStateDefinition
import org.worklang.work.Predicate
import org.worklang.work.StateDefinition
import org.worklang.work.Operation
import org.worklang.work.TransitionDefinition

/* Create static meta-model for a field.
 * - Definition Space
 * - Instance Space
 */

class FieldModelFactory extends MetaModelVertexFactory {
	
	//Logging
	val logger = LoggerFactory.getLogger(FieldModelFactory)
	
	//Meta Info
	val creationStamp = Date.from(Instant.now)
	var fieldMeta = "field - "
	var stateMeta = "state"
	var transitionMeta = "transition"
	var stateCompositionMeta = "state composition logic"
	
	var String fieldName
	
	//WorkLang Bindings
	var DefinitionSpace definitionSpace
	var InstanceSpace instanceSpace
	
	//Meta Model Bindings
	var Vertex workspaceVertex
	var Vertex fieldVertex
	var Vertex definitionSpaceVertex
	var Vertex instanceSpaceVertex	

	
	var protected FieldDefinition field
	
	new (Neo4JGraph g, FieldDefinition f, Vertex workspace){
		super(g)
		this.field = f
		fieldName = f.name
		fieldMeta += f.name
		workspaceVertex = workspace
		
		logger.info("Generating meta model for {}", fieldName)
		
		if (field.definitionSpace !== null){
			logger.info("Discovered definition space for {}", fieldName )
			definitionSpace = field.definitionSpace
		}
		
		if (field.instanceSpace !== null){
			logger.info("Discovered instance space for {}", fieldName)
		}
	}
	
	def generate (){
		
		logger.info("Generating field ({}) static meta model", fieldName)
		
		try{
			var tx = graph.tx
			generateField
			tx.commit
			
			tx = graph.tx
			generateSpaces
			tx.commit
			
			tx = graph.tx
			firstPassStates
			tx.commit
			
			tx = graph.tx
			secondPassStates
			tx.commit
			
		}catch(Exception it){
			it.printStackTrace
			logger.error("Failed to generate field meta model")
		}

	}
	
	def private generateField(){
		logger.info("Generating field vertex for {}", fieldName)
		fieldVertex = createVertex(field, fieldMeta)
		createEdge(workspaceVertex, fieldVertex, "containsField")
	}
	
	def private generateSpaces(){
		
		logger.info("Generating spaces for {}", fieldName)
		
		if (definitionSpace !== null){
			definitionSpaceVertex = createVertex(definitionSpace, fieldMeta)
			createEdge(fieldVertex, definitionSpaceVertex, "definitionSpace")
		}
		
		if (instanceSpace !== null){
			instanceSpaceVertex = createVertex(instanceSpace, fieldMeta)
			createEdge(fieldVertex, instanceSpaceVertex, "instanceSpace")
		}
		
		
	}
	
	//Create stubs for all states in definition space
	def private firstPassStates(){
		definitionSpace.states.forEach[state|
			var vertex = createVertex(state, stateMeta)
			vertex.property(VertexProperty.Cardinality.single, "type", state.type)
			vertex.property(VertexProperty.Cardinality.single, "name", state.name)
			
			createEdge(definitionSpaceVertex, vertex, stateMeta)
		]	
	}
	
	//Resolve compound states in definition space
	def private secondPassStates(){
		definitionSpace.states.filter[state|
			state.type.equals("compound")
		].forEach[state|
			
			//Get compound state vertex
			var vertex = graph.vertices("match (n:`"+stateMeta + "` {field:'" + fieldName + "', name:'" + state.name + "'}) return n").head
			//Resolve structures
			resolveCompoundState(state as CompoundStateDefinition, vertex)
		]
	}
	
	def private generateTransitions(){
		
		definitionSpace.transitions.forEach[transition|
			var transitionVertex = generateTransitionGraphStructure(transition, transitionMeta)
		]
		
	}
	
	def private firstPassInstances(){
		
		
	}
	
	//Utility method for generating edges with meta data for this field
	def private createEdge(Vertex from, Vertex to, String label){
		var edge = from.addEdge(label, to).property("creationStamp", creationStamp.toString)
		return edge
	}

	//Utility method for generating vertices with meta data for this field	
	def private createVertex(EObject o, String label){
		var vertex = super.getVertex(o, label)
		vertex.property(VertexProperty.Cardinality.single, "field", field.name)
		return vertex
	}
	
		
	//Utility methods for generating compound state meta model structures
	def private resolveCompoundState(CompoundStateDefinition compoundState, Vertex compoundStateVertex){
		
		var withVertex = createVertex(compoundState.composition, stateCompositionMeta)
		withVertex.property(VertexProperty.Cardinality.single, "name", "with")
		
		var predicateVertex = generatePredicateGraphStructure(compoundState.composition.predicate, stateCompositionMeta)
		withVertex.addEdge("has", predicateVertex).property("type","composition")
		
		compoundStateVertex.addEdge("composedWith", withVertex)
		
		return compoundState
	}
	
	def private generatePredicateGraphStructure (Predicate predicate, String label){
		
		val predicateVertex = createVertex(predicate, label)
		predicateVertex.property(VertexProperty.Cardinality.single, "name", "predicate")
		
		//NOTE: if negation behaves weird, this is probably why. Look at the grammar implementation for Predicate
		predicateVertex.property(VertexProperty.Cardinality.single, "negation", predicate.negation)
		
		/* Handle possible predicate structures:
		 * setOf, single state, and Operations (AND/OR) 
		 */
						
		//If predicate contains a state
		predicate.eContents.filter[predicateEle| predicateEle.eClass.instanceClass.equals(org.worklang.work.StateDefinition)]
			.forEach[state|
				
				var composedStateVertex = generateComposedStateGraphStructure(state as StateDefinition, label)
			
				//Attach composed state to predicate vertex
				predicateVertex.addEdge("has", composedStateVertex).property("type","composition")
				
			]
			
							
		//If predicate contains an operation
		predicate.eContents.filter[predicateEle| predicateEle.eClass.instanceClass.equals(org.worklang.work.Operation)]
			.forEach[operation|
				var operationVertex = generateOperationGraphStructure(operation as Operation, label)
				var operationEdge = predicateVertex.addEdge("has", operationVertex)
				operationEdge.property("type","composition")			
			]					
		
		return predicateVertex
	} 
	
	def private Vertex generateOperationGraphStructure (Operation operation, String label){
		
		var operationVertex = createVertex(operation,label)
		operationVertex.property(VertexProperty.Cardinality.single, "name", operation.op)
		
		
		/* Either side of the operation can only be one of the following:
		 * 	Predicate, StateID, another operation.
		 */
		
		//Resolve left hand side of operation
		var leftType = operation.left.eClass.instanceClass
		
		var leftVertex = 
			switch (leftType){
				case org.worklang.work.Operation:
					generateOperationGraphStructure(operation.left as Operation, label)
				case org.worklang.work.Predicate:
					generatePredicateGraphStructure(operation.left as Predicate, label)
				case org.worklang.work.StateDefinition:
					generateComposedStateGraphStructure(operation.left as StateDefinition, label)
				default: throw new IllegalArgumentException("Operation element wasn't Predicate, StateDefinition, or another operation")
			}
		
		var leftEdge = operationVertex.addEdge("leftOperator", leftVertex)
		leftEdge.property("type","composition")
		
		//Resolve right hand side of operation
		
		var rightType = operation.right.eClass.instanceClass
		
		var rightVertex = 
			switch (rightType){
				case org.worklang.work.Operation:
					generateOperationGraphStructure(operation.right as Operation, label)
				case org.worklang.work.Predicate:
					generatePredicateGraphStructure(operation.right as Predicate, label)
				case org.worklang.work.StateDefinition:
					generateComposedStateGraphStructure(operation.right as StateDefinition, label)
				default: throw new IllegalArgumentException("Operation element wasn't Predicate, StateDefinition, or another operation")
	
			}
		
		var rightEdge = operationVertex.addEdge("rightOperator", rightVertex)
		rightEdge.property("type","composition")
		
		return operationVertex
	}
	
	def private generateComposedStateGraphStructure(StateDefinition state, String label){
		var composedStateVertex = createVertex(state, label)
		composedStateVertex.property(VertexProperty.Cardinality.single, "name", "composedState")
		
		var lookupStateName = state.instance.name
		
		println("looking for: " + lookupStateName)
		
		logger.info("Query\nmatch (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ lookupStateName +"'}) return n")
		
		//NOTE: Potential Cypher injection exploit 
		var refStateLookup = graph.vertices(
			"match (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ lookupStateName +"'}) return n"
			)
							
		var refStateVertex = refStateLookup.head
								
		/*The composition can be referencing either a single instance of 
		 * the referenced state or a set of them. Build relationships in the
		 * meta model to reflect this.
		 */
		if (state.list){
			composedStateVertex.addEdge("setOf", refStateVertex)
		}else{
			composedStateVertex.addEdge("is", refStateVertex)
		}
		
		return composedStateVertex
	}
	
	//Utility method for generating transition meta model structures
	def private generateTransitionGraphStructure(TransitionDefinition transition, String label){
		
		var transitionVertex = createVertex(transition, label)
		transitionVertex.property(VertexProperty.Cardinality.single, "name", transition.name)

		var hasInput = if (transition.in !== null) true else false
		
		transitionVertex.property(VertexProperty.Cardinality.single, "hasInput", hasInput)
		transitionVertex.property(VertexProperty.Cardinality.single, "hasOutput", true) //All transitions must have an output
		
		//If the transition requires an input
		if (hasInput){
			
			//Create input vertex
			val inputVertex = createVertex(transition.in, label)
			inputVertex.property(VertexProperty.Cardinality.single, "name", "input")
			
			//Create graph structures for input parameters
			transition.in.eCrossReferences.forEach[input|
			
			var inputStateName = (input as StateDefinition).name
			
			//Add a parameter property to input vertex with the state name
			inputVertex.property(VertexProperty.Cardinality.list, "parameter", inputStateName)
			
			println("Query to run:\n" + "match (n:`state` {field:'"+fieldName+"', name:'"+ inputStateName +"'}) return n")
			
			//Find input state vertex in graph and connect it to input vertex
			var inputStateVertex = graph.vertices("match (n:`state` {field:'"+fieldName+"', name:'"+ inputStateName +"'}) return n").head
			println("inputStateVertex="+inputStateVertex)
			println("inputVertex=" + inputVertex)
			
			inputVertex.addEdge("hasParameter", inputStateVertex)
				.property("resolves", inputStateName)
		
			]
			
			//Attach input vertex to transition vertex
			transitionVertex.addEdge("requires", inputVertex)
		}
		
		
		val outputVertex = createVertex(transition.out,label)
		outputVertex.property(VertexProperty.Cardinality.single, "name", "output")
		
		
		println("After create outputVertex=" + outputVertex)
		
		//Create graph structures for output parameters
		transition.out.eCrossReferences.forEach[output|
			
			var outputStateName = (output as StateDefinition).name
			
			println("transition output looking for " + outputStateName)
			
			//Add a parameter property to output vertex with the state name
			outputVertex.property(VertexProperty.Cardinality.list, "parameter", outputStateName)
			
			println("Query to run:\n" + "match (n:`state` {field:'"+fieldName+"',name:'"+ outputStateName +"'}) return n")
			
			//Find output state vertex in graph and connect it to output vertex
			var outputStateVertex = graph.vertices("match (n:`state` {field:'"+fieldName+"',name:'"+ outputStateName +"'}) return n").head
			println("outputStateVertex=" + outputStateVertex)
			println("outputVertex=" + outputVertex)
			
			outputVertex.addEdge("hasParameter", outputStateVertex)
				.property("resolves", outputStateName)
		
		]
		
		//Attach output vertex to transition vertex
		transitionVertex.addEdge("produces", outputVertex)
		
		return transitionVertex
	}
	
}
