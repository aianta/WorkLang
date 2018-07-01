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
import org.worklang.work.PrimitiveTransitionDefinition
import org.worklang.work.CompoundTransitionDefinition
import org.worklang.work.TransitionComposition
import org.worklang.work.ExecutionResult
import org.worklang.work.SimpleInstruction
import org.worklang.work.IfInstruction
import org.worklang.work.WhileInstruction
import org.worklang.work.SimpleInstanceInstruction
import org.worklang.work.IfInstanceInstruction
import org.worklang.work.WhileInstanceInstruction
import org.worklang.work.ResolvableTransitionOutputValue
import org.worklang.work.ResolvableInstanceValue
import org.worklang.work.ResolvableValue
import org.worklang.work.TestValue
import org.worklang.work.LiteralValue
import org.worklang.work.CompoundTransitionInstance
import org.worklang.work.InstructionExpression
import org.worklang.work.InstanceInstructionExpression
import java.util.Iterator

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
	var executionResultMeta = "execution result"
	var simpleInstructionMeta = "simple instruction"
	var ifInstructionMeta = "if instruction"
	var whileInstructionMeta = "while instruction"
	var simpleInstanceInstructionMeta = "simple instance instruction"
	var ifInstanceInstructionMeta = "if instance instruction"
	var whileInstanceInstructionMeta = "while instance instruction"	
	var resolvableTransitionOutputMeta = "resolvable output value"
	var resolvableInstanceMeta = "resolvable instance value"
	var testKeyMeta = "test key"
	var testValueMeta = "test value"
	var testObjectMeta = "test object"
	var testObjectKeyMeta = "test object key"
	var literalValueMeta = "literal value"
	var toComputeIfTrueMeta = "compute true"
	var toComputeIfFalseMeta = "compute false"
	var toComputeMeta = "compute"
	var transitionCompositionBodyMeta = "transition composition body" 
	
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
				
				//Resolve Simple Instructions
				tx = graph.tx
				resolveSimpleInstructions
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
				
				//Resolve Simple Instance Instructions
				tx = graph.tx
				resolveSimpleInstanceInstructions
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
		//Create graph structures for primitive transition instances
		instanceSpace.instances.filter[instance| 
			instance.eContents.exists[instanceElement| 
				instanceElement.eClass.instanceClass.equals(org.worklang.work.TransitionInstance)
			]
		].forEach[transitionInstance|
							
			//Generate transition instance vertex
			var transitionInstanceVertex = generatePrimitiveInstanceTransitionGraphStructures(transitionInstance, transitionInstanceMeta)
			logger.info("primitive transition !!")
			//Connect field instancespace vertex to transition instance vertex
			createEdge(instanceSpaceVertex,transitionInstanceVertex, "definesInstance")
		]
		
		//Create graph structures for compound transition instances
		instanceSpace.instances.filter[instance| 
			instance.eContents.exists[instanceElement| 
				instanceElement.eClass.instanceClass.equals(org.worklang.work.CompoundTransitionInstance)
			]
		].forEach[transitionInstance|
							
			//Generate transition instance vertex
			var compoundTransitionInstanceVertex = generateCompoundTransitionInstanceGraphStructures(transitionInstance, transitionInstanceMeta)
						
			//Connect field instancespace vertex to transition instance vertex
			createEdge(instanceSpaceVertex,compoundTransitionInstanceVertex, "definesInstance")
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
	
	def private resolveInstructionExpression(InstructionExpression expression, String label){
				 
		var myVertex = switch (expression){
			case expression instanceof SimpleInstruction:
				generateSimpleInstructionGraphStructures(expression as SimpleInstruction, label)
			case expression instanceof IfInstruction:
				generateIfInstructionGraphStructures(expression as IfInstruction, label)
			case expression instanceof WhileInstruction:
				generateWhileInstructionGraphStructures(expression as WhileInstruction, label)
			case expression instanceof ExecutionResult:
				generateExecutionResultGraphStructures(expression as ExecutionResult, label)
		}
		
		
		return myVertex
		
	}
	
	def private resolveInstanceInstructionExpression (InstanceInstructionExpression expression, String label){
			
		var myVertex = switch (expression){
			case expression instanceof SimpleInstanceInstruction:
				generateSimpleInstanceInstructionGraphStructures(expression as SimpleInstanceInstruction, label)
			case expression instanceof IfInstanceInstruction:
				generateIfInstanceInstructionGraphStructures(expression as IfInstanceInstruction, label)
			case expression instanceof WhileInstanceInstruction:
				generateWhileInstanceInstructionGraphStructures(expression as WhileInstanceInstruction, label)
			case expression instanceof ExecutionResult:
				generateExecutionResultGraphStructures(expression as ExecutionResult, label)
		}
		
		
		return myVertex
	}
	
	
	def private Vertex generatePrimitiveInstanceTransitionGraphStructures(Instance instance, String label){
		var instanceVertex = createVertex(instance,label)
		instanceVertex.property(VertexProperty.Cardinality.single, "type", "transition")
		instanceVertex.property(VertexProperty.Cardinality.single, "name", instance.name)
		instanceVertex.property(VertexProperty.Cardinality.single, "host", instance.transition.host)
		instanceVertex.property(VertexProperty.Cardinality.single, "port", Integer.toString(instance.transition.port))
		instanceVertex.property(VertexProperty.Cardinality.single, "transitionType", "primitive")
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
		
		logger.info ("Created instance transition vertex")
		
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
		
		if (transition instanceof PrimitiveTransitionDefinition){
			return generatePrimitiveTransitionGraphStructure(transition, label)
		}
		
		if (transition instanceof CompoundTransitionDefinition){
			return generateCompoundTransitionGraphStructure(transition, label)
		}

	}
	
	def private generateCompoundTransitionGraphStructure (CompoundTransitionDefinition transition, String label){
		
		var transitionComposition = transition.composition
		
		var transitionVertex = createVertex(transition, label)
		transitionVertex.property(VertexProperty.Cardinality.single, "name", transition.name)
		transitionVertex.property(VertexProperty.Cardinality.single, "transitionType", transition.type)
		
		var compositionVertex = generateTransitionCompositionGraphStructures(transitionComposition, label);
		createEdge(transitionVertex, compositionVertex, "composition")
		
		//Create graph structures for output parameters
		val outputVertex = createVertex(transition.out,label)
		outputVertex.property(VertexProperty.Cardinality.single, "name", "output")
		
		
		println("After create outputVertex=" + outputVertex)
		
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
	
	def private generatePrimitiveTransitionGraphStructure (PrimitiveTransitionDefinition transition, String label){
		
		var transitionVertex = createVertex(transition, label)
		transitionVertex.property(VertexProperty.Cardinality.single, "name", transition.name)
	
		var hasInput = if (transition.in !== null) true else false
		
		transitionVertex.property(VertexProperty.Cardinality.single, "hasInput", hasInput)
		transitionVertex.property(VertexProperty.Cardinality.single, "hasOutput", true) //All transitions must have an output
		transitionVertex.property(VertexProperty.Cardinality.single, "transitionType", transition.type)
		
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
	
	def private Vertex generateTransitionCompositionGraphStructures (TransitionComposition composition, String label){
		var compositionBody = composition.body
		
		val bodyVertex = createVertex(compositionBody, transitionCompositionBodyMeta)
		bodyVertex.property(VertexProperty.Cardinality.single,"name", "transition composition body")
		
		//Find and connect all starting inputs
		compositionBody.startingInputs.forEach[ input|
			var inputVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+field.name+"', name:'"+input.name+"'}) return n").head
			createEdge(bodyVertex, inputVertex, "starting input")
		]
		
		var executionResultVertex = generateExecutionResultGraphStructures(compositionBody.expression as ExecutionResult, label)
		createEdge(bodyVertex, executionResultVertex, "expression")
		
		return bodyVertex
	}
	
	def private Vertex generateCompoundTransitionInstanceGraphStructures(Instance instance, String label){
		
		var composition = instance.compoundTransition
		
		var compositionBody = composition.body
		
		val bodyVertex = createVertex(compositionBody, transitionInstanceMeta)
		bodyVertex.property(VertexProperty.Cardinality.single,"name", instance.name)
		bodyVertex.property(VertexProperty.Cardinality.single, "type", "transition")
		bodyVertex.property(VertexProperty.Cardinality.single, "transitionType","compound")
		
		//Find and connect all starting inputs
		compositionBody.startingInputs.forEach[input|
			var inputVertex = graph.vertices("match (n:`"+stateInstanceMeta+"` {field:'"+field.name+"', name:'"+input.name+"'}) return n").head
			createEdge(bodyVertex, inputVertex, "starting input")
		]
		
		var executionResultVertex = generateExecutionResultGraphStructures(compositionBody.expression as ExecutionResult, executionResultMeta)
		createEdge(bodyVertex, executionResultVertex, "expression")
		
		//Find the transition that this is an instance of
		var transitionVertex = graph.vertices("match (n:`"+transitionMeta+"` {field:'"+field.name+"', name: '"+instance.transitionDeclaration.transition.name+"'}) return n").head
		createEdge(bodyVertex, transitionVertex, "instanceOf")
		
		return bodyVertex
		
	}
	
	def private Vertex generateExecutionResultGraphStructures(ExecutionResult executionResult, String label){
		 
		
		//If this actually is an execution result
		
		var executionResultVertex = createVertex(executionResult, executionResultMeta)
		executionResultVertex.property(VertexProperty.Cardinality.single, "name", "execution result")
		
		/* 7 Cases to handle for computeFirst AND computeNext
		 *  - ExecutionResult
		 *  - SimpleInstruction
		 *  - IfInstruction
		 *  - WhileInstruction
		 *  - SimpleInstanceInstruction
		 *  - IfInstanceInstruction
		 *  - WhileInstanceInstruction
		 */
		
		//Handle computeFirst
		var it = executionResult.computeFirst
		var Vertex computeFirstVertex = 
			switch (it){
				case it instanceof ExecutionResult:
					generateExecutionResultGraphStructures((it as ExecutionResult), executionResultMeta)
				case it instanceof SimpleInstruction:
					generateSimpleInstructionGraphStructures((it as SimpleInstruction), simpleInstructionMeta)
				case it instanceof IfInstruction:
					generateIfInstructionGraphStructures(it as IfInstruction, ifInstructionMeta)
				case it instanceof WhileInstruction:
					generateWhileInstructionGraphStructures(it as WhileInstruction, whileInstructionMeta)
				case it instanceof SimpleInstanceInstruction:
					generateSimpleInstanceInstructionGraphStructures(it as SimpleInstanceInstruction, simpleInstanceInstructionMeta)
				case it instanceof IfInstanceInstruction:
					generateIfInstanceInstructionGraphStructures(it as IfInstanceInstruction, ifInstanceInstructionMeta)
				case it instanceof WhileInstanceInstruction:
					generateWhileInstanceInstructionGraphStructures(it as WhileInstanceInstruction, whileInstanceInstructionMeta)
			}
		
		createEdge(executionResultVertex, computeFirstVertex, "computeFirst")	
		
		//If computeNext exists handle computeNext
		if (executionResult.computeNext !== null){
			it = executionResult.computeNext
			var Vertex computeNextVertex = 
				switch (it){
					case it instanceof ExecutionResult:
						generateExecutionResultGraphStructures((it as ExecutionResult), executionResultMeta)
					case it instanceof SimpleInstruction:
						generateSimpleInstructionGraphStructures((it as SimpleInstruction), simpleInstructionMeta)
					case it instanceof IfInstruction:
						generateIfInstructionGraphStructures(it as IfInstruction, ifInstructionMeta)
					case it instanceof WhileInstruction:
						generateWhileInstructionGraphStructures(it as WhileInstruction, whileInstructionMeta)
					case it instanceof SimpleInstanceInstruction:
						generateSimpleInstanceInstructionGraphStructures(it as SimpleInstanceInstruction, simpleInstanceInstructionMeta)
					case it instanceof IfInstanceInstruction:
						generateIfInstanceInstructionGraphStructures(it as IfInstanceInstruction, ifInstanceInstructionMeta)
					case it instanceof WhileInstanceInstruction:
						generateWhileInstanceInstructionGraphStructures(it as WhileInstanceInstruction, whileInstanceInstructionMeta)
				}
				
				createEdge(executionResultVertex, computeNextVertex, "computeNext")
		}
		
		
		
		return executionResultVertex
		
	}
	
	
	def private Vertex generateSimpleInstructionGraphStructures(SimpleInstruction simpleInstruction, String label){
		
		val simpleInstructionVertex = createVertex(simpleInstruction, simpleInstructionMeta);
		simpleInstructionVertex.property(VertexProperty.Cardinality.single, "name", simpleInstructionMeta)
		
		var transitions = simpleInstruction.toExecute
		
		var iter =  transitions.iterator
		var counter = 0;
		
		while (iter.hasNext){
			var curr = iter.next
			simpleInstructionVertex.property(VertexProperty.Cardinality.single, "toExecute"+counter, curr.name)
			counter++;
		}
		
		
		//TODO come back to this
		//createEdge(simpleInstructionVertex, transition, "toExecute")
		
		return simpleInstructionVertex
	}
	
	def private Vertex generateIfInstructionGraphStructures(IfInstruction ifInstruction, String label){
		
		var Vertex ifInstructionVertex = createVertex(ifInstruction, ifInstructionMeta)
		ifInstructionVertex.property(VertexProperty.Cardinality.single, "name", ifInstructionMeta)
		
		
		//Create Vertex for testKey
		var resolvableValue = ifInstruction.testKey
		var testKeyVertex = generateResolvableValueGraphStructures(resolvableValue, label);		
		
		//Create Vertex for testValue
		var testValue = ifInstruction.testValue
		var testValueVertex = generateTestValueGraphStructures(testValue, label);
		
		//Connect both to ifStatement vertex
		createEdge(ifInstructionVertex, testKeyVertex, testKeyMeta);
		createEdge(ifInstructionVertex, testValueVertex, testValueMeta)
		
		//Create branch verticies
		var ifTrueVertex = resolveInstructionExpression(ifInstruction.toComputeIfTrue, toComputeIfTrueMeta)
		createEdge(ifInstructionVertex, ifTrueVertex, toComputeIfTrueMeta)
		
		//If there is an else
		if (ifInstruction.toComputeIfFalse !== null){
			var ifFalseVertex = resolveInstructionExpression(ifInstruction.toComputeIfFalse, toComputeIfFalseMeta)
			createEdge(ifInstructionVertex, ifFalseVertex, toComputeIfFalseMeta)
		}
		
		return ifInstructionVertex
	}
	
	def private Vertex generateTestValueGraphStructures(TestValue testValue, String label){
		
		var Vertex result
		
		if (testValue instanceof LiteralValue){
			result = createVertex((testValue as LiteralValue), testValueMeta)
			result.property(VertexProperty.Cardinality.single, "name", literalValueMeta)
			result.property(VertexProperty.Cardinality.single, "value", (testValue as LiteralValue).value)
		}
		
		if (testValue instanceof ResolvableValue){
			result = generateResolvableValueGraphStructures(testValue as ResolvableValue, testValueMeta)
		}
		
		return result
	}
	
	def private Vertex generateResolvableValueGraphStructures(ResolvableValue resolvableValue, String label){
		
		var Vertex objectVertex
		
		if (resolvableValue instanceof ResolvableTransitionOutputValue){
			 objectVertex = createVertex(resolvableValue as ResolvableTransitionOutputValue, resolvableTransitionOutputMeta )
			
			//Find and connect State(test object) and ObjectKey vertices
			var stateVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+field.name+"', name:'"+(resolvableValue as ResolvableTransitionOutputValue).state.name+"'}) return n").head
			createEdge(objectVertex, stateVertex, testObjectMeta)
			
			var keyVertex = graph.vertices("match (n:`"+stateMeta+"` {field:'"+field.name+"', name:'"+(resolvableValue as ResolvableTransitionOutputValue).key.name+"'}) return n").head
			createEdge(objectVertex, keyVertex, testObjectKeyMeta)
			
		}
		
		if (resolvableValue instanceof ResolvableInstanceValue){
			objectVertex = createVertex(resolvableValue as ResolvableInstanceValue, resolvableInstanceMeta)
		
			//Find and connect Key and Instance (test object) verticies
			var instanceVertex = graph.vertices("match (n: `"+stateInstanceMeta+"` {field:'"+field.name+"', name:'"+(resolvableValue as ResolvableInstanceValue).instance.name+"'}) return n").head
			createEdge(objectVertex, instanceVertex, testObjectMeta)
		
			var keyVertex = graph.vertices("match (n: `"+stateMeta+"` {field:'"+field.name+"', name:'"+(resolvableValue as ResolvableInstanceValue).key.name+"'}) return n").head
			createEdge(objectVertex, keyVertex, testObjectKeyMeta)
		}
		
		objectVertex.property(VertexProperty.Cardinality.single, "name", testKeyMeta)
		
		return objectVertex
		
	}
	
	def private Vertex generateWhileInstructionGraphStructures(WhileInstruction whileInstruction, String label){
		
		var whileVertex = createVertex(whileInstruction, whileInstructionMeta)
		whileVertex.property(VertexProperty.Cardinality.single, "name", whileInstructionMeta)
		
		var testKeyVertex = generateResolvableValueGraphStructures(whileInstruction.testKey, label)
		createEdge(whileVertex, testKeyVertex, testKeyMeta)
		
		var testValueVertex = generateTestValueGraphStructures(whileInstruction.testValue, label)
		createEdge(whileVertex, testValueVertex, testValueMeta)
		
		var toComputeVertex = resolveInstructionExpression(whileInstruction.toCompute, toComputeMeta)
		createEdge(whileVertex, toComputeVertex, toComputeMeta)
		
		return whileVertex
	}
	
	def private Vertex generateSimpleInstanceInstructionGraphStructures(SimpleInstanceInstruction simpleInstanceInstruction, String label){
		val simpleInstructionVertex = createVertex(simpleInstanceInstruction, simpleInstanceInstructionMeta);
		simpleInstructionVertex.property(VertexProperty.Cardinality.single, "name", simpleInstanceInstructionMeta)
		
		var transitions = simpleInstanceInstruction.toExecute
		
		var iter =  transitions.iterator
		var counter = 0;
		
		while (iter.hasNext){
			var curr = iter.next
			simpleInstructionVertex.property(VertexProperty.Cardinality.single, "toExecute"+counter, curr.name)
			counter++;
		}
		
		
		
		return simpleInstructionVertex
	}
	
	def private Vertex generateIfInstanceInstructionGraphStructures(IfInstanceInstruction ifInstanceInstruction, String label){
		
		var Vertex ifInstructionVertex = createVertex(ifInstanceInstruction, ifInstanceInstructionMeta)
		ifInstructionVertex.property(VertexProperty.Cardinality.single, "name", ifInstanceInstructionMeta)
		
		
		//Create Vertex for testKey
		var resolvableValue = ifInstanceInstruction.testKey
		var testKeyVertex = generateResolvableValueGraphStructures(resolvableValue, label);		
		
		//Create Vertex for testValue
		var testValue = ifInstanceInstruction.testValue
		var testValueVertex = generateTestValueGraphStructures(testValue, label);
		
		//Connect both to ifStatement vertex
		createEdge(ifInstructionVertex, testKeyVertex, testKeyMeta);
		createEdge(ifInstructionVertex, testValueVertex, testValueMeta)
		
		//Create branch verticies
		var ifTrueVertex = resolveInstanceInstructionExpression(ifInstanceInstruction.toComputeIfTrue, toComputeIfTrueMeta)
		createEdge(ifInstructionVertex, ifTrueVertex, toComputeIfTrueMeta)
		
		//If there is an else
		if (ifInstanceInstruction.toComputeIfFalse !== null){
			var ifFalseVertex = resolveInstanceInstructionExpression(ifInstanceInstruction.toComputeIfFalse, toComputeIfFalseMeta)
			createEdge(ifInstructionVertex, ifFalseVertex, toComputeIfFalseMeta)
		}
		
		return ifInstructionVertex
	}
	
	def private Vertex generateWhileInstanceInstructionGraphStructures(WhileInstanceInstruction whileInstanceInstruction, String label){
		var whileVertex = createVertex(whileInstanceInstruction, whileInstanceInstructionMeta)
		whileVertex.property(VertexProperty.Cardinality.single, "name", whileInstructionMeta)
		
		var testKeyVertex = generateResolvableValueGraphStructures(whileInstanceInstruction.testKey, label)
		createEdge(whileVertex, testKeyVertex, testKeyMeta)
		
		var testValueVertex = generateTestValueGraphStructures(whileInstanceInstruction.testValue, label)
		createEdge(whileVertex, testValueVertex, testValueMeta)
		
		var toComputeVertex = resolveInstanceInstructionExpression(whileInstanceInstruction.toCompute, label)
		createEdge(whileVertex, toComputeVertex, toComputeMeta)
		
		return whileVertex
	}
	
	def private resolveSimpleInstructions(){
		
		graph.vertices("match (n:`"+simpleInstructionMeta+"`) return n").forEach[
			instructionVertex|
			
			try{
				var counter = 0
			while(instructionVertex.property("toExecute"+counter).value !== null){
				
				var transition = graph.vertices("match (n:`"+transitionMeta+"` {field:'"+field.name+"', name:'"+instructionVertex.property("toExecute"+counter).value.toString+"'}) return n").head
				createEdge(instructionVertex, transition, "toExecute")
				counter++
			}
			}catch(Exception e){
				logger.info("no property exists with that name")
			}
			
			
		]
		
	}
	
	def private resolveSimpleInstanceInstructions(){
		
		graph.vertices("match (n:`"+simpleInstanceInstructionMeta+"`) return n").forEach[
			instructionVertex|
			
			
			
			try{
				var counter = 0;
				
				while(instructionVertex.property("toExecute"+counter).value !== null){
				//Find the transition
				logger.info("looking for {}", "match (n:`"+transitionInstanceMeta+"` {field:'"+field.name+"', name:'"+instructionVertex.property("toExecute"+counter).value.toString+"'}) return n")
				var transition = graph.vertices("match (n:`"+transitionInstanceMeta+"` {field:'"+field.name+"', name:'"+instructionVertex.property("toExecute"+counter).value.toString+"'}) return n").head
				
				createEdge(instructionVertex, transition, "toExecute")
				counter++
				
				}
			}catch(Exception e){
				logger.info("no property exists with that name")
			}
			
			
			

		]
		
		
		
	}
}
