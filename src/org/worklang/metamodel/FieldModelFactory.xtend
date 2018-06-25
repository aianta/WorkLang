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
import org.worklang.work.Instance
import org.worklang.work.UseDefinition
import org.worklang.work.MapSpace
import org.worklang.work.ReferenceSpace
import org.apache.tinkerpop.gremlin.structure.Transaction

/* Create static meta-model for a field.
 * - Definition Space
 * - Instance Space
 */

class FieldModelFactory extends MetaModelVertexFactory {
	
	//Logging
	val logger = LoggerFactory.getLogger(FieldModelFactory)
	
	//Meta Info
	val creationStamp = Date.from(Instant.now)
	//var fieldMeta = "field - "
	var stateMeta = "state"
	var transitionMeta = "transition"
	var stateCompositionMeta = "state composition logic"
	var stateInstanceMeta = "state instance"
	var transitionInstanceMeta = "transition instance"
	var stateMappingMeta = "mapped state"
	var referenceMeta = "reference"
	
	
	
	var String fieldName
	
	//WorkLang Bindings
	var DefinitionSpace definitionSpace
	var InstanceSpace instanceSpace
	var MapSpace mapSpace
	var ReferenceSpace referenceSpace
	
	//Meta Model Bindings
	var Vertex workspaceVertex
	var Vertex fieldVertex
	var Vertex definitionSpaceVertex
	var Vertex instanceSpaceVertex
	var Vertex mapSpaceVertex
	var Vertex referenceSpaceVertex	

	
	var protected FieldDefinition field
	
	new (Neo4JGraph g, FieldDefinition f, Vertex workspace){
		super(g)
		this.field = f
		fieldName = f.name
		//fieldMeta += f.name
		workspaceVertex = workspace
		
		logger.info("Generating meta model for {}", fieldName)
		
		if (field.definitionSpace !== null){
			logger.info("Discovered definition space for {}", fieldName )
			definitionSpace = field.definitionSpace
		}
		
		if (field.instanceSpace !== null){
			logger.info("Discovered instance space for {}", fieldName)
			instanceSpace = field.instanceSpace
		}
		
		if (field.mapSpace !== null){
			logger.info("Discovered map space for {}", fieldName)
			mapSpace = field.mapSpace
		}
		
		if (field.referenceSpace !== null){
			logger.info("Discovered reference space for {}", fieldName)
			referenceSpace = field.referenceSpace
		}
	}
	
	//Generates dynamic field meta model, that, structures that connect fields together
	def generateExternal(){
		
		try{
			
			var Transaction tx
			
			if (mapSpace !== null){
				logger.info("Generating mappings for {}", fieldName)
				tx = graph.tx
				generateMappings
				tx.commit
			}

			if (referenceSpace !== null){
				logger.info("Generating references for {}", fieldName)
				tx = graph.tx
				generateReferences
				tx.commit
			}

			
		}catch(Exception it){
			it.printStackTrace
		}
		
	}
	
	//Generates static field meta model, that is, structures entirely contained in the field
	def generateInternal (){
		
		logger.info("Generating field ({}) static meta model", fieldName)
		
		try{
			var Transaction tx
			
			//Field Vertex
			tx = graph.tx
			generateField
			tx.commit
			
			//Space Vertices 
			tx = graph.tx
			generateSpaces
			tx.commit
			
			if (definitionSpace !== null){
				logger.info("Generating definition space for {}", fieldName)
				//Definition space states 
				tx = graph.tx
				firstPassStates
				tx.commit
				
				tx = graph.tx
				secondPassStates
				tx.commit
				
				//Definition space transitions
				tx = graph.tx
				generateTransitions
				tx.commit
			}
			
			if (instanceSpace !== null){
				logger.info("Generating instance space for {}", fieldName)
				//Instance space states
				tx = graph.tx
				firstPassStateInstances
				tx.commit
				
				tx = graph.tx
				secondPassStateInstances
				tx.commit
				
				//Instance space transitions
				tx = graph.tx
				generateInstanceTransitions
				tx.commit
			}
			
		}catch(Exception it){
			it.printStackTrace
			logger.error("Failed to generate field meta model")
		}

	}
	
	def private generateReferences(){
		referenceSpace.refStates.forEach[refState|
			var refVertex = createVertex(refState,referenceMeta)
			refVertex.property(VertexProperty.Cardinality.single, "name", refState.refState.name)
			
			//Find foreign concept being referenced
			logger.info("ref query2: \n" + "match (n {name:'{}'}) return n", refState.refState.name)
			var foreignVertex = graph.vertices("match (n {name:'"+refState.refState.name+"'}) return n").head
			createEdge(refVertex,foreignVertex,"references")
							
			//Attach reference node to referenceSpace node
			createEdge(referenceSpaceVertex,refVertex,"definesReference")
		]
	}
	
	//Utility method for populating the structures in the map space 
	def private generateMappings(){
		
		mapSpace.mappedStates.forEach[state|
			var foreignField = state.field
			var foreignState = state.foreignState
			var localState = state.localState
							
			//Find related vertices in graph
			logger.info("match (n {field:'"+foreignField.name+"',name:'"+foreignField.name+"'}) return n")
			var foreignFieldVertex = graph.vertices("match (n {field:'"+foreignField.name+"',name:'"+foreignField.name+"'}) return n").head
			var foreignStateVertex = graph.vertices("match (n {name:'"+foreignState.name+"'}) return n").head
			var localStateVertex = graph.vertices("match (n {name:'"+localState.name+"'}) return n").head
			
			logger.info("foreignStateVertex = {}", foreignStateVertex)
			logger.info("mapSpaceVertex = {}", mapSpaceVertex)
			logger.info("localStateVertex = {}", localStateVertex)
			
			//connect foreign state vertex to local state vertex
			createEdge(foreignStateVertex, localStateVertex, "mapsTo")
							
			//connect local field's mapping vertex to local state vertex
			createEdge(mapSpaceVertex, localStateVertex, "mappedState")
							
			//connect foreign field vertex to local field's mapping vertex
			createEdge(mapSpaceVertex, foreignFieldVertex, "requires")
		]
	}
	
	def private generateField(){
		logger.info("Generating field vertex for {}", fieldName)
		fieldVertex = createVertex(field, field.name)
		fieldVertex.property(VertexProperty.Cardinality.single,"name", field.name)
		createEdge(workspaceVertex, fieldVertex, "containsField")
	}
	
	def private generateSpaces(){
		
		logger.info("Generating spaces for {}", fieldName)
		
		if (definitionSpace !== null){
			definitionSpaceVertex = createVertex(definitionSpace, field.name)
			definitionSpaceVertex.property(VertexProperty.Cardinality.single, "name", "definition space")
			createEdge(fieldVertex, definitionSpaceVertex, "definitionSpace")
		}
		
		if (instanceSpace !== null){
			instanceSpaceVertex = createVertex(instanceSpace, field.name)
			instanceSpaceVertex.property(VertexProperty.Cardinality.single, "name", "instance space")
			createEdge(fieldVertex, instanceSpaceVertex, "instanceSpace")
		}
		
		if (mapSpace !== null){
			mapSpaceVertex = createVertex(mapSpace, field.name)
			mapSpaceVertex.property(VertexProperty.Cardinality.single, "name",  "map space")
			createEdge(fieldVertex, mapSpaceVertex, "mapSpace")
		}
		
		if (referenceSpace !== null){
			referenceSpaceVertex = createVertex(referenceSpace, field.name)
			referenceSpaceVertex.property(VertexProperty.Cardinality.single, "name",  "reference space")
			createEdge(fieldVertex, referenceSpaceVertex, "referenceSpace")
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
			
			createEdge(definitionSpaceVertex, transitionVertex, "transition")
		]
		
	}
	
	def private firstPassStateInstances(){
		
		logger.info ("Generating instance stubs for {}", fieldName)
		
		logger.info("instanceSpace = {}", instanceSpace)
		
		//Create graph structures for state instances
		instanceSpace.instances.filter[instance|
			instance.eContents.exists[instanceElement|
				instanceElement.eClass.instanceClass.equals(org.worklang.work.StateInstance)
			]
		].forEach[instance|
			
			var state = instance.state
			
			logger.info("Creating {} stub ", instance.name)
			
			var vertex = createVertex(state, stateInstanceMeta)
			vertex.property(VertexProperty.Cardinality.single,"name", instance.name)
			vertex.property(VertexProperty.Cardinality.single, "type", "state")
			createEdge(instanceSpaceVertex, vertex, "definesInstance")
			
			//Find vertex of state this is an instance of
			var instancedState = instance.stateDeclaration.eCrossReferences.get(0) as StateDefinition 
						
			var Vertex instancedStateVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ instancedState.name +"'}) return n").head
						
			//Hookup instance vertex to state it is an instance of
			createEdge(vertex, instancedStateVertex, "instanceOf")
		]
		
	}
	
	//Resolve graph structures for use and set statements in state instances
	def private secondPassStateInstances(){
		
		instanceSpace.instances.filter[instance|
			instance.eContents.exists[instanceElement|
				instanceElement.eClass.instanceClass.equals(org.worklang.work.StateInstance)
			]
		].forEach[instance|
			logger.info("instance vertex query\nmatch (n:`"+stateInstanceMeta+"` {field:'"+fieldName+"',name:'"+ instance.name +"'}) return n")
			
			var Vertex instanceVertex = graph.vertices("match (n:`"+stateInstanceMeta+"` {field:'"+fieldName+"',name:'"+ instance.name +"'}) return n").head
						
						
			//Create nodes for every instance attribute
			for (EObject obj: instance.state.members){
							
				//Deal with all possible cases (set statement, use statement or instance)
				if (obj.eClass.instanceClass.equals(org.worklang.work.Instance)){
					var subInstanceVertex = generateSubStateInstanceGraphStructure(obj as Instance, stateInstanceMeta)

					createEdge(instanceVertex,subInstanceVertex,"has")
				}
							
						
				//Create graph structure for set statement
				if (obj.eClass.instanceClass.equals(org.worklang.work.SetStatement)){
								
					var setStmt = obj as org.worklang.work.SetStatement
								
					//find the namespace state this set statement sets the value of
					var setStmtInstanced = setStmt.eCrossReferences.get(0) as StateDefinition
					
					logger.info("Query\nmatch (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ setStmtInstanced.name +"'}) return n")

					var setStmtInstancedVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ setStmtInstanced.name +"'}) return n").head
						
					var valueVertex = createVertex(setStmtInstanced, "value")
					valueVertex.property(VertexProperty.Cardinality.single, "name", setStmtInstanced.name)
					valueVertex.property(VertexProperty.Cardinality.single, "value", setStmt.toDef.value)
					
					logger.info("instanceVertx = {}", instanceVertex)
					logger.info("valueVertex = {}", valueVertex)
					logger.info("setStmtInstancedVertex = {}", setStmtInstancedVertex)
							
					//Attach setValue node to state it is an instance of
					createEdge(valueVertex, setStmtInstancedVertex, "instanceOf")
					
					//Attach instance node to setValue node
					createEdge(instanceVertex,valueVertex,"set")
					
				}
							
				//Create graph structure for use statement
				if (obj.eClass.instanceClass.equals(org.worklang.work.UseDefinition)){
								
					var useState = obj as UseDefinition
								
					var useStateVertex = graph.vertices("match (n:`"+stateInstanceMeta+"` {field:'"+fieldName+"',name:'"+ (useState.eCrossReferences.get(0) as Instance).name +"'}) return n").head
								
					instanceVertex.addEdge("use", useStateVertex)
				}
			}
		]
		
	}
	
	def private generateInstanceTransitions(){
		//Create graph structures for transition instances
		instanceSpace.instances.filter[instance| 
			instance.eContents.exists[instanceElement| 
				instanceElement.eClass.instanceClass.equals(org.worklang.work.TransitionInstance)
			]
		].forEach[transitionInstance|
							
			//Generate transition instance vertex
			var transitionInstanceVertex = generateInstanceTransitionGraphStructure(transitionInstance, transitionInstanceMeta)
						
			//Connect field instancespace vertex to transition instance vertex
			createEdge(instanceSpaceVertex,transitionInstanceVertex, "definesInstance")
		]
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
	
	def private generateInstanceTransitionGraphStructure(Instance instance, String label){
		
		var instanceVertex = createVertex(instance,label)
		instanceVertex.property(VertexProperty.Cardinality.single, "type", "transition")
		instanceVertex.property(VertexProperty.Cardinality.single, "name", instance.name)
		instanceVertex.property(VertexProperty.Cardinality.single, "host", instance.transition.host)
		instanceVertex.property(VertexProperty.Cardinality.single, "port", Integer.toString(instance.transition.port))
		instanceVertex.property(VertexProperty.Cardinality.single, 
			"path", 
			if (instance.transition.path !== null) 
				instance.transition.path else
				"/" //Default path
		)
		
		
		var transitionName = (instance.transitionDeclaration.eCrossReferences.get(0)as TransitionDefinition).name
		
		//Find the transition vertex of the transition this instance implements
		var instanceOfVertex = graph.vertices("match (n:`"+transitionMeta+"` {field:'"+fieldName+"',name:'"+ transitionName +"'}) return n").head
	
		createEdge(instanceVertex,instanceOfVertex, "instanceOf")
		
		return instanceVertex
	}
	
	def private Vertex generateSubStateInstanceGraphStructure(Instance instance, String label){
		
		var subInstanceVertex = graph.addVertex(label)
		subInstanceVertex.property(VertexProperty.Cardinality.single, "type", "state")
		subInstanceVertex.property(VertexProperty.Cardinality.single, "name", instance.name)
		
		//Find vertex of state this is an instance of
		var instancedState = instance.stateDeclaration.eCrossReferences.get(0) as StateDefinition 
					
		var Vertex instancedStateVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ instancedState.name +"'}) return n").head
		
		createEdge(subInstanceVertex, instancedStateVertex, "instanceOf")
		
		//Create nodes for every instance attribute
		for (EObject obj: instance.state.members){
						
			//Deal with all possible cases (set statement, use statement or instance)
			if (obj.eClass.instanceClass.equals(org.worklang.work.Instance)){
				
				var subSubInstanceVertex = generateSubStateInstanceGraphStructure(obj as Instance, label)	
				
				subInstanceVertex.addEdge("has", subSubInstanceVertex)
			}
						
			//Create graph structure for set statement
			if (obj.eClass.instanceClass.equals(org.worklang.work.SetStatement)){
							
				var setStmt = obj as org.worklang.work.SetStatement
							
				//find the namespace state this set statement sets the value of
				var setStmtInstanced = setStmt.eCrossReferences.get(0) as StateDefinition
				var setStmtInstancedVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+fieldName+"',name:'"+ setStmtInstanced.name +"'}) return n").head
							
				var valueVertex = createVertex(setStmtInstanced, "value")
				valueVertex.property(VertexProperty.Cardinality.single, "name", setStmtInstanced.name)
				valueVertex.property(VertexProperty.Cardinality.single, "value", setStmt.toDef.value)
							
				//Attach setValue node to state it is an instance of
				createEdge(valueVertex,setStmtInstancedVertex,"instanceOf")
				
				//Attach instance node to setValue node
				createEdge(subInstanceVertex,valueVertex,"set")
				
			}
						
			//Create graph structure for use statement
			if (obj.eClass.instanceClass.equals(org.worklang.work.UseDefinition)){
							
				var useState = obj as UseDefinition
							
				var useStateVertex = graph.vertices("match (n:`"+stateInstanceMeta+"` {field:'"+fieldName+"',name:'"+ (useState.eCrossReferences.get(0) as Instance).name +"'}) return n").head
				
				createEdge(subInstanceVertex, useStateVertex, "use")
			}
		}
		
		return subInstanceVertex
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
		transitionVertex.property(VertexProperty.Cardinality.single, "type", transition.type)
		
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
