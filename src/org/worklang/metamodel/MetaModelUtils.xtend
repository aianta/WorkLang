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

import org.worklang.interpreter.WorkApi
import org.apache.tinkerpop.gremlin.structure.Vertex
import io.vertx.core.json.JsonObject
import org.apache.tinkerpop.gremlin.structure.Direction
import org.slf4j.LoggerFactory
import io.vertx.core.json.JsonArray

class MetaModelUtils {
	
	var static logger = LoggerFactory.getLogger(MetaModelUtils)
	
	//Utility method for retrieving a field vertex given its name
	def static Vertex getFieldVertex(String fieldName){
	
		var graph = WorkApi.graph
		
		var fieldVertex = graph.vertices("match (n:`"+fieldName+"` {field:'"+fieldName+"',name:'"+fieldName+"'}) return n").head
		
		return fieldVertex
	}
	
	def static fieldVertexToJson(Vertex field){
		var result = new JsonObject
		
		result.put("name", field.property("name").value.toString)
		result.put("created", field.property("created").value.toString)
		result.put("worklangKey",  field.property("worklangKey").value.toString)
		
		return result
	}
	
	def static JsonObject fieldVertexTransitionInstancesToJson(Vertex field){
		var result = new JsonObject
		val resultArray = new JsonArray
		
		var fieldName = field.property("name").value.toString
		
		var transitionInstances = WorkApi.graph.vertices("match (inst:`"+fieldName+"` {name:'instance space'})-[:definesInstance]->(n:`transition instance`) return n")
		
		transitionInstances.forEach[transitionInstance|
			resultArray.add(transitionInstanceVertexToJson(transitionInstance))
		]
		
		result.put("transitionInstances", resultArray);
		return result
	}
	
	def static JsonObject fieldVertexStateInstancesToJson(Vertex field){
		var result = new JsonObject
		val resultArray = new JsonArray
		
		var fieldName = field.property("name").value.toString
		
		var stateInstances = WorkApi.graph.vertices("match (inst:`"+fieldName+"` {name:'instance space'})-[:definesInstance]->(n:`state instance`) return n")
		
		stateInstances.forEach[stateInstance|
			resultArray.add(stateInstanceVertexToJson(stateInstance))
		]
		
		result.put("stateInstances", resultArray)
		
		return result
	}
	
	def static JsonObject fieldVertexInstancesToJson(Vertex field){
		
		var result = new JsonObject
		val resultArray = new JsonArray
		
		var fieldName = field.property("name").value.toString
		
		var instances = WorkApi.graph.vertices("match (inst:`"+fieldName+"` {name:'instance space'})-[:definesInstance]->(n) return n")
		
		instances.forEach[instance|
			
			if (instance.property("type").value.toString.equals("state")){
				resultArray.add(stateInstanceVertexToJson(instance))
			}
			
			if (instance.property("type").value.toString.equals("transition")){
				resultArray.add(transitionInstanceVertexToJson(instance))
			}
			
		]
		
		result.put("instances", resultArray)
		
		return result
	}
	
	def static fieldVertexDefinitionsToJson(Vertex field){
		
		var result = new JsonObject
		val resultArray = new JsonArray
		
		var definitionsVertex = field.vertices(Direction.OUT, "definitionSpace").head;
		
		var states = definitionsVertex.vertices(Direction.OUT, "state")
		
		states.forEach[stateVertex|
			resultArray.add(stateVertexToJson(stateVertex))
		]
		
		var transitions = definitionsVertex.vertices(Direction.OUT, "transition")
		
		transitions.forEach[transitionVertex|
			resultArray.add(transitionVertexToJson(transitionVertex))
		]
		
		result.put("definitions", resultArray)
		
		return result
	}
	
	def static JsonObject fieldVertexStateDefinitionsToJson(Vertex field){
		
		var result = new JsonObject
		val resultArray = new JsonArray
		
		var definitionsVertex = field.vertices(Direction.OUT, "definitionSpace").head;
		
		var states = definitionsVertex.vertices(Direction.OUT, "state")
		
		states.forEach[stateVertex|
			resultArray.add(stateVertexToJson(stateVertex))
		]
		
		result.put("states", resultArray)
		
		return result
	}
	
	def static JsonObject fieldVertexTransitionDefinitionsToJson(Vertex field){
		
		var result = new JsonObject
		val resultArray = new JsonArray
		
		var definitionsVertex = field.vertices(Direction.OUT, "definitionSpace").head;
		
		var transitions = definitionsVertex.vertices(Direction.OUT, "transition")
		
		transitions.forEach[transitionVertex|
			resultArray.add(transitionVertexToJson(transitionVertex))
		]
		
		result.put("transitions", resultArray)
		
		return result
	}
	
	
	def static Vertex getStateVertex(String fieldName, String stateName){
		
		var graph = WorkApi.graph
		
		var target = graph.vertices("match (n:`state` {field:'"+fieldName+"', name: '"+stateName+"'}) return n").head
		
		return target
	}
	
	//Utility method for producing a json with all instances of the given state
	def static JsonObject stateVertexInstancesToJson(Vertex state){
		var result = new JsonObject
		var resultArray = new JsonArray
		
		var stateInstances = WorkApi.graph.vertices("match (inst:`state instance`)-[:instanceOf]->(n:state {field:'"+state.property("field").value.toString+"', name:'"+state.property("name").value.toString +"'}) return inst")
		
		while (stateInstances.hasNext){
			resultArray.add(stateInstanceVertexToJson(stateInstances.next))
		}
		
		result.put("instances", resultArray)
		
		return result
	}
	
	def static transitionVertexToJson(Vertex transition){
		var result = new JsonObject
		
		result.put("name", transition.property("name").value.toString)
		result.put("field", transition.property("field").value.toString)
		result.put("type", transition.property("type").value.toString)
		result.put("hasInput", transition.property("hasInput").value.toString)
		result.put("hasOutput", transition.property("hasOutput").value.toString)
		result.put("created", transition.property("created").value.toString)
		
		return result
	}
	
	def static stateVertexToJson(Vertex state){
		
		var result = new JsonObject
		
		var graph = WorkApi.graph
		
		var fieldName = state.property("field").value.toString
		var stateName = state.property("name").value.toString
		
		result.put("name", state.property("name").value.toString)
		result.put("field", state.property("field").value.toString)
		result.put("type", state.property("type").value.toString)
		result.put("created", state.property("created").value.toString)
		result.put("worklangKey", state.property("worklangKey").value.toString)
		
		//If this is a compound state it will have a with vertex
		var withVertex = graph.vertices("match (n:`state` {field:'"+fieldName+"', name: '"+stateName+"'})-[:composedWith]->(w:`state composition logic`) return w").head
		
		if (withVertex !== null){
			result.put("with", stateWithVertexToJson(withVertex))
		}
	
		return result
	}
	
	//Utility method for converting with vertices to json
	def private static JsonObject stateWithVertexToJson (Vertex with){
		var result = new JsonObject
		
		var predicateVertex = with.vertices(Direction.OUT, "has").head
		
		result.put("predicate", predicateVertexToJson(predicateVertex));
		
		return result
	}
	
	//Utility method for converting predicate vertices to json
	def private static JsonObject predicateVertexToJson(Vertex predicate){
		var result = new JsonObject
		
		// Two cases, composed States or Operations 
		var childVertex = predicate.vertices(Direction.OUT, "has").head
		
		if (childVertex.property("worklangKey").value.toString.equals("org.worklang.work.Operation")){
			result.put(
				"operation",
				operationVertexToJson(childVertex)
			)
		}
		
		if (childVertex.property("worklangKey").value.toString.equals("org.worklang.work.StateDefinition")){
			result.put(
				"composedState",
				composedStateVertexToJson(childVertex)
			)
		}
	
		return result
		 
	}
	
	//Utility method for converting operation vertices to json
	def private static JsonObject operationVertexToJson(Vertex operation){
		
		var wrapper = new JsonObject
		var result = new JsonObject
		
		//logger.info("Jsonify Operation {}", operation.property("name").value.toString);
		
		var rightOperatorVertex = operation.vertices(Direction.OUT, "rightOperator").head
		var leftOperatorVertex = operation.vertices(Direction.OUT, "leftOperator").head
		
		//logger.info("rightOperatorVertex => {}", rightOperatorVertex)
		//logger.info("leftOperatorVertex => {}", leftOperatorVertex)
		
		//Three cases for each operator, operation or composed state or predicate 
		
		//Handle cases for right operator
		var it = rightOperatorVertex.property("worklangKey").value.toString
		
		//logger.info("switching through rightOp OpToJson. worklangKey => {}", it)
		
		switch (it){
			case it.equals("org.worklang.work.Operation"): //Handle operations
				result.put(
					"rightOperator",
					operationVertexToJson(rightOperatorVertex)
				)
			case it.equals("org.worklang.work.StateDefinition"): //Handle composed states
				result.put(
					"rightOperator",
					composedStateVertexToJson(rightOperatorVertex)
				)
			case it.equals("org.worklang.work.Predicate"): //Handle predicates
				result.put(
					"rightOperator",
					predicateVertexToJson(rightOperatorVertex)
				)
		}
		
		//Handle cases for left operator
		it = leftOperatorVertex.property("worklangKey").value.toString
		
		//logger.info("switching through leftOp OpToJson. worklangKey => {}", it)
		
		switch (it){
			case it.equals("org.worklang.work.Operation"): //Handle operations
				result.put(
					"leftOperator",
					operationVertexToJson(leftOperatorVertex)
				)
			case it.equals("org.worklang.work.StateDefinition"): //Handle composed states
				result.put(
					"leftOperator",
					composedStateVertexToJson(leftOperatorVertex)
				)
			case it.equals("org.worklang.work.Predicate"): //Handle predicates
				result.put(
					"leftOperator",
					predicateVertexToJson(leftOperatorVertex)
				)
		}
		
		wrapper.put(operation.property("name").value.toString, result)
		
		return wrapper
	}
	
	def private static JsonObject composedStateVertexToJson(Vertex composedState){
		
		var wrapper = new JsonObject
		var result = new JsonObject
		
		//Two cases, either the composed state is some state or it's a setOf some state
		var isVertex = composedState.vertices(Direction.OUT, "is").head
		var setOfVertex = composedState.vertices(Direction.OUT, "setOf").head
		
		//Handle is case
		if (isVertex !== null){
			var isData = new JsonObject
			
			isData
				.put("name", isVertex.property("name").value.toString)
				.put("field", isVertex.property("field").value.toString)
				.put("created", isVertex.property("created").value.toString)
				.put("type", isVertex.property("type").value.toString)
				.put("worklangKey", isVertex.property("worklangKey").value.toString)
			
			result.put("is", isData)
		}
		
		if (setOfVertex !== null){
			
			var setOfData = new JsonObject
			
			setOfData
				.put("name", setOfVertex.property("name").value.toString)
				.put("field", setOfVertex.property("field").value.toString)
				.put("created", setOfVertex.property("created").value.toString)
				.put("type", setOfVertex.property("type").value.toString)
				.put("worklangKey", setOfVertex.property("worklangKey").value.toString)
			
			result.put("setOf", setOfData)
		}
		
		wrapper.put(composedState.property("name").value.toString, result)
		
		return wrapper
		
	}
	
	def static Vertex getStateInstanceVertex(String fieldName, String stateName){
		
		var graph = WorkApi.graph
		
		var target = graph.vertices("match (n:`state instance` {field:'"+fieldName+"', name: '"+stateName+"'}) return n").head 
		
		return target
	}
	
	def static JsonObject transitionInstanceVertexToJson(Vertex transitionInstance){
		var result = new JsonObject
		
		result
			.put("name", transitionInstance.property("name").value.toString)
			.put("field", transitionInstance.property("field").value.toString)
			.put("type", transitionInstance.property("type").value.toString)
			.put("host", transitionInstance.property("host").value.toString)
			.put("path", transitionInstance.property("path").value.toString)
			.put("port", transitionInstance.property("port").value.toString)
			.put("created", transitionInstance.property("created").value.toString)
		
		return result
	}
	
	def static JsonObject stateInstanceVertexToJson(Vertex stateInstance){
		
		var result = new JsonObject
		
		var graph = WorkApi.graph
		
		var fieldName = stateInstance.property("field").value.toString
		var stateName = stateInstance.property("name").value.toString
		
		//Get all set parameters
		var setParams = graph.vertices("match (n:`state instance` {field:'"+fieldName+"', name: '"+stateName+"'})-[:set]->(param:value) return param")
		
		//Iterate through them, adding them to the json 
		while(setParams.hasNext){
			var valueVertex = setParams.next
			result.put(
				valueVertex.property("name").value.toString,
				valueVertex.property("value").value.toString
			)
		}
		
		//Get all use parameters
		var useParams = graph.vertices("match (n:`state instance` {field:'"+fieldName+"', name: '"+stateName+"'})-[:use]->(param:`state instance`) return param");
		
		//Iterate through them, adding them to json
		while(useParams.hasNext){
			var useStateInstanceVertex = useParams.next
			result.put(
				useStateInstanceVertex.property("name").value.toString,
				stateInstanceVertexToJson(useStateInstanceVertex)
			)
		}
		
		return result
	}
	
}