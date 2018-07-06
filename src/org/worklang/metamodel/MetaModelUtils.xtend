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
import org.worklang.work.WorkFactory
import org.worklang.work.Instance
import org.worklang.work.StateDeclaration
import org.worklang.work.StateInstance
import org.worklang.WorklangResourceUtils
import org.worklang.work.StateDefinition
import java.util.Map.Entry
import java.util.UUID

class MetaModelUtils {
	
	var static logger = LoggerFactory.getLogger(MetaModelUtils)
	val static WorkFactory factory = WorkFactory.eINSTANCE;
	
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
	
	def static Vertex getTransitionVertex(String fieldName, String transitionName){
		var target = WorkApi.graph.vertices("match (n:`transition` {field:'" + fieldName + "', name:'" + transitionName + "'}) return n").head;
	
		return target
	}
	
	def static Vertex getCollectionInstanceVertex(String fieldName, String collectionName){
		
		var graph = WorkApi.graph
		
		var target = graph.vertices("match (n:`collection instance` {field:'"+fieldName+"', name:'"+collectionName+"'}) return n").head
		
		return target
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
	
	def static JsonArray collectionInstanceVertexToJson(Vertex collectionInstance){
		
		val result =  new JsonArray
		
		logger.info("Converting collection instance vertex to JsonArray")
		
		collectionInstance.vertices(Direction.OUT, "index").forEach[element|
			
			logger.info("Processing collection instance element")
			
			var elementInstance = element.vertices(Direction.OUT, "is").head
			
			//Handle case where element instance in collection is a state
			if (elementInstance.property("type").value.toString.equals("state")){
				logger.info("elementInstance -> {} stateType->{}", elementInstance, elementInstance.property("stateType").value.toString )
			
				if (elementInstance.property("stateType").value.equals("primitive")){
					result.add(collectionPrimitiveStateInstanceVertexToJson(elementInstance))
				}
				
				if (elementInstance.property("stateType").value.equals("compound")){
					var myDefinitionVertex = collectionInstance.vertices(Direction.OUT, "instanceOf").next;
					result.add(stateInstanceVertexToJson(elementInstance).getJsonObject(myDefinitionVertex.property("name").value.toString))
				}
			}
			
			//Handle case where element instance in collection is a collection
			if (elementInstance.property("type").value.toString.equals("collection")){
				result.add(collectionInstanceVertexToJson(elementInstance))
			}
			
			
			
		]
		
		return result
		
	}
	
	def static String collectionPrimitiveStateInstanceVertexToJson(Vertex primitiveStateInstance){
		
		var setVertex = primitiveStateInstance.vertices(Direction.OUT, "set").head
		
		return setVertex.property("value").value.toString
		
	}
	
	def static JsonArray collectionElementStateInstanceVertexToJsonArray(Vertex stateInstance){
		logger.info("converting collection element state instance vertex to json array")
		
		var resultArray = new JsonArray
		
		var myDefinitionVertex = stateInstance.vertices(Direction.OUT, "instanceOf").next
		
		resultArray.add(stateInstanceVertexToJson(stateInstance).getJsonObject(myDefinitionVertex.property("name").value.toString))
		
		return resultArray
		
	}
	
	def static JsonObject stateInstanceVertexToJson(Vertex stateInstance){
		
		logger.info("converting state instance vertex to json")
		
		var result = new JsonObject
		
		var graph = WorkApi.graph
		
		var fieldName = stateInstance.property("field").value.toString
		var stateName = stateInstance.property("name").value.toString
		var type = stateInstance.property("type").value.toString
		var stateType = stateInstance.property("stateType").value.toString
		
		logger.info("fieldName ->{} state instance name -> {} type ->{}", fieldName, stateName, type);
		
		//If this instance is a state instance
		if (type.equals("state") && stateType !== null && stateType.equals("compound")){
			
			var myJson = new JsonObject
			
			//Get all set parameters
			var setParams = graph.vertices("match (n:`state instance` {field:'"+fieldName+"', name: '"+stateName+"'})-[:set]->(param:value) return param")
			
			//Iterate through them, adding them to the json 
			while(setParams.hasNext){
				var valueVertex = setParams.next
				myJson.put(
					valueVertex.property("name").value.toString,
					valueVertex.property("value").value.toString
				)
			}
			
			//Get all use state instance parameters
			var useStateInstanceParams = graph.vertices("match (n:`state instance` {field:'"+fieldName+"', name: '"+stateName+"'})-[:use]->(param:`state instance`) return param");
			
			//Iterate through them, adding them to json
			while(useStateInstanceParams.hasNext){
				var useStateInstanceVertex = useStateInstanceParams.next
				
				var useStateDefinitionVertex = useStateInstanceVertex.vertices(Direction.OUT, "instanceOf").next
				
				//If the use statement points to an instance of a primitive state, just add the primitive state name as the key 
				//and the primitive state instance's value as the value. No need to wrap it in it's own JSON
				if (useStateDefinitionVertex.property("type").value.toString.equals("primitive")){
					var primitiveSetVertex = useStateInstanceVertex.vertices(Direction.OUT,"set").next
					myJson.put(
						useStateDefinitionVertex.property("name").value.toString,
						primitiveSetVertex.property("value").value.toString
					)
				}
				
				if (useStateDefinitionVertex.property("type").value.toString.equals("compound")){
					myJson.put(
						useStateDefinitionVertex.property("name").value.toString,
						stateInstanceVertexToJson(useStateInstanceVertex).getJsonObject(useStateDefinitionVertex.property("name").value.toString)
					)
				}
				
				
			}
			
			//Get all use collection instance parameters
			var useCollectionInstanceParams = graph.vertices("match (n:`state instance` {field:'"+fieldName+"', name: '"+stateName+"'})-[:use]->(param:`collection instance`) return param")
			
			//Iterate through them, adding them to the json
			while(useCollectionInstanceParams.hasNext){
				var useCollectionInstanceVertex = useCollectionInstanceParams.next
				
				var useCollectionDefinitionVertex = useCollectionInstanceVertex.vertices(Direction.OUT, "instanceOf").next
				
				myJson.put(
					useCollectionDefinitionVertex.property("name").value.toString,
					collectionInstanceVertexToJson(useCollectionInstanceVertex)
				)
			}
			
			
			//Finally add myJson to result
			var myDefinitionVertex = stateInstance.vertices(Direction.OUT,"instanceOf").next
			result.put(myDefinitionVertex.property("name").value.toString,
				myJson
			)
		}
		
		if (type.equals("state") && stateType !== null && stateType.equals("primitive")){
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
			
		}
		
		//If this instance is a collection instance
		if (type.equals("collection")){
			result.put(stateName, collectionInstanceVertexToJson(stateInstance))
		}

		
		return result
	}
	
	def static Instance jsonArrayToCollectionInstance(JsonArray array, String fieldName, Instance transition, String collectionName){
		logger.info("Building new collection element instance")
		var i = factory.createInstance();
		
		val ci = factory.createCollectionInstance;
		val sd = factory.createStateDeclaration;
		
		var Vertex outputStateVertex = WorkApi.graph.vertices("match (this:`transition instance` {field:'"+fieldName+"', name:'"+transition.getName()+"' })-[:instanceOf]->(parent:transition)-[:produces]->(:transition)-[:hasParameter]->(outputElement:state) return outputElement").head;
		logger.info("outputStateVertex => {}", outputStateVertex);
		
		sd.state = WorklangResourceUtils.resolveStateDefinition(
			fieldName,
			outputStateVertex.property("name").value.toString
		)
		
		var arrayIterator = array.iterator
		var index = 0
		
		while (arrayIterator.hasNext){
			var curr = arrayIterator.next
			/* If the entry is a string, assume it's a 
			 * primitive with the same state definition as the collection that contains it
			 */
			 if (curr instanceof String){
			 	var Instance collectionElement = stringToCollectionElementStateInstance(curr as String, fieldName, sd.state, collectionName, Integer.toString(index))
			 	ci.elements.add(collectionElement)
			 	index++
			 }
			 
			 /* If the entry is a json Object use the collections state definition as definition */
			 
			 if (curr instanceof JsonObject){
			 	var Instance collectionElement = jsonToCollectionElementStateInstance(curr as JsonObject, fieldName, sd.state, collectionName, Integer.toString(index))
			 	ci.elements.add(collectionElement)
			 	index++
			 }
			
			//TODO Support n-dimensional arrays by handling the case where curr is an instanceof JsonArray
		}
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.collection = ci;
		i.isCollectionElement = false
		i.name = collectionName
		
		return i
	}
	
	def static Instance jsonArrayToCollectionInstance(JsonArray array, String fieldName, StateDefinition definition, String collectionName){
		
		logger.info("Building new collection element instance")
		var i = factory.createInstance();
		
		val ci = factory.createCollectionInstance;
		val sd = factory.createStateDeclaration;
		
		sd.state = definition
		
		var arrayIterator = array.iterator
		var index = 0
		
		while (arrayIterator.hasNext){
			var curr = arrayIterator.next
			/* If the entry is a string, assume it's a 
			 * primitive with the same state definition as the collection that contains it
			 */
			 if (curr instanceof String){
			 	var Instance collectionElement = stringToCollectionElementStateInstance(curr as String, fieldName, definition, collectionName, Integer.toString(index))
			 	ci.elements.add(collectionElement)
			 	index++
			 }
			 
			 /* If the entry is a json Object use the collections state definition as definition */
			 
			 if (curr instanceof JsonObject){
			 	var Instance collectionElement = jsonToCollectionElementStateInstance(curr as JsonObject, fieldName, definition, collectionName, Integer.toString(index))
			 	ci.elements.add(collectionElement)
			 	index++
			 }
			
			//TODO Support n-dimensional arrays by handling the case where curr is an instanceof JsonArray
		}
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.collection = ci;
		i.isCollectionElement = false
		i.name = collectionName
		
		
		return i
		
	}
	
	def static Instance stringToCollectionElementStateInstance(String string, String fieldName, StateDefinition definition, String collectionName, String collectionIndex){
		logger.info("Building new collection element instance")
		var i = factory.createInstance();
		
		val si = factory.createStateInstance;
		val sd = factory.createStateDeclaration;
		
		sd.state = definition
		
		var set  = factory.createSetStatement
		set.variable = definition
		var toDef = factory.createToDefinition
		toDef.value = string
		
		si.members.add(set)
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.state = si;
		i.isCollectionElement = true
		i.name = "#"+collectionName+"#"+collectionIndex+"#"
		
		return i
	}
	
	def static Instance jsonToCollectionElementStateInstance(JsonObject json, String fieldName, StateDefinition definition, String collectionName, String collectionIndex){
		logger.info("Building new collection element instance")
		var i = factory.createInstance();
		
		val si = factory.createStateInstance;
		val sd = factory.createStateDeclaration;
		
		sd.state = definition
		
		json.forEach[entry|
			
			if (entry.value instanceof String){
				var set = factory.createSetStatement
				//Use json key as name of state being set
				set.variable = 
					WorklangResourceUtils.resolveStateDefinition(
						fieldName,
						entry.key
					)
				
				var to = factory.createToDefinition
				to.value = entry.value.toString
				
				set.toDef = to
				si.members.add(set)
			}
			
			if (entry.value instanceof JsonObject){
				
				var use  = factory.createUseDefinition
				//Use entry key to resolve state definition of child
				var childDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, entry.key)
				var Instance useValue = jsonToStateInstance(entry.value as JsonObject, fieldName, childDefinition, collectionName+"collectionInstanceElement"+UUID.randomUUID.toString);
				
				use.predefinedValue = useValue
				si.members.add(use)
			}
			
			if (entry.value instanceof JsonArray){
				var use = factory.createUseDefinition
				
				var StateDefinition childDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, entry.key)
				
				var Instance useValue = jsonArrayToCollectionInstance(entry.value as JsonArray, fieldName, childDefinition, collectionName+"collectionStateInstance"+UUID.randomUUID.toString )
				
				use.predefinedValue = useValue
				si.members.add(use)
			}
			
		]
		
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.state = si;
		i.isCollectionElement = true
		i.name = "#"+collectionName+"#"+collectionIndex+"#"
		
		return i
	}
	
	def static jsonToCollectionElementStateInstance(JsonObject json, String fieldName, Instance transition, String collectionName, String collectionIndex, String resultName){
		
		logger.info("Building new collection element instance")
		var i = factory.createInstance();
		
		val si = factory.createStateInstance;
		val sd = factory.createStateDeclaration;
		
		logger.info("Building State Declaration");
		
		var Vertex outputStateVertex = WorkApi.graph.vertices("match (this:`transition instance` {field:'"+fieldName+"', name:'"+transition.getName()+"' })-[:instanceOf]->(parent:transition)-[:produces]->(:transition)-[:hasParameter]->(outputElement:state) return outputElement").head;

		sd.state = WorklangResourceUtils.resolveStateDefinition(
			fieldName,
			outputStateVertex.property("name").value.toString
		)
		
		json.forEach[entry|
			//Handle Set Statements
			if (entry.value instanceof String){
				var set = factory.createSetStatement
				
				//Use json key as name of state being set
				set.variable = 
					WorklangResourceUtils.resolveStateDefinition(
						fieldName,
						entry.key
					)
				
				var to = factory.createToDefinition
				to.value = entry.value.toString
				
				set.toDef = to
				si.members.add(set)
			}
			
			if (entry.value instanceof JsonObject){
				var use  = factory.createUseDefinition
				
				//Resolve state definition for use using entry key
				var StateDefinition definition = WorklangResourceUtils.resolveStateDefinition(fieldName, entry.key);
				
				var Instance useValue = jsonToStateInstance(entry.value as JsonObject, fieldName, definition, resultName+"childStateInstance"+UUID.randomUUID.toString);
				
				use.predefinedValue = useValue
				si.members.add(use)
			}
			
			if (entry.value instanceof JsonArray){
				var use = factory.createUseDefinition
				
				var StateDefinition definition = WorklangResourceUtils.resolveStateDefinition(fieldName, entry.key)
				
				var Instance useValue = jsonArrayToCollectionInstance(entry.value as JsonArray, fieldName, definition, resultName+"collectionStateInstance"+UUID.randomUUID.toString )
				
				use.predefinedValue = useValue
				si.members.add(use)

			}
		]
		
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.state = si;
		i.isCollectionElement = true
		i.name = "#"+collectionName+"#"+collectionIndex+"#"+resultName
		
		return i
		
	}

	def static jsonToStateInstance(JsonObject json, String fieldName, Instance transition, String resultName){
		
		logger.info("Building new instance!");
		var i = factory.createInstance();
						
		val si = factory.createStateInstance();
		val sd = factory.createStateDeclaration();
		
		//Build State Declaration
		logger.info("Building State Declaration");
		logger.info("Finding output state: ");
		logger.info("match (this:`transition instance` {field:'{}', name:'{}' })-[:instanceOf]->(parent:transition)-[:produces]->(:transition)-[:hasParameter]->(outputElement:state) return outputElement",fieldName, transition.getName());
						
		var Vertex outputStateVertex = WorkApi.graph.vertices("match (this:`transition instance` {field:'"+fieldName+"', name:'"+transition.getName()+"' })-[:instanceOf]->(parent:transition)-[:produces]->(:transition)-[:hasParameter]->(outputElement:state) return outputElement").head;
		logger.info("outputStateVertex => {}", outputStateVertex);
		
		sd.state = WorklangResourceUtils.resolveStateDefinition(
			fieldName,
			outputStateVertex.property("name").value.toString
		)
		
		logger.info("Built State Declaration");
		
		//Build State Instance
		logger.info("Building State Instance");
		
		var jsonIterator = json.iterator
		var useStateInstanceCount = 0
		var useCollectionInstanceCount = 0
		
		while (jsonIterator.hasNext){
			var Entry<String,Object> curr = jsonIterator.next
			
						//Handle Set Statements
			if (curr.value instanceof String){
				var set = factory.createSetStatement
				
				//Use json key as name of state being set
				set.variable = 
					WorklangResourceUtils.resolveStateDefinition(
						fieldName,
						curr.key
					)
				
				var to = factory.createToDefinition
				to.value = curr.value.toString
				
				set.toDef = to
				si.members.add(set)
			}
			
			if (curr.value instanceof JsonObject){
				var use  = factory.createUseDefinition
				
				//Resolve state definition for use
				var StateDefinition definition = WorklangResourceUtils.resolveStateDefinition(fieldName, curr.key);
				
				var Instance useValue = jsonToStateInstance(curr.value as JsonObject, fieldName, definition, resultName+"childStateInstance"+UUID.randomUUID.toString);
				
				use.predefinedValue = useValue
				
				useStateInstanceCount++;
				
				si.members.add(use)
			}
			
			if (curr.value instanceof JsonArray){
				var use = factory.createUseDefinition
				
				var StateDefinition definition = WorklangResourceUtils.resolveStateDefinition(fieldName, curr.key)
				
				var Instance useValue = jsonArrayToCollectionInstance(curr.value as JsonArray, fieldName, definition, resultName+"collectionStateInstance"+UUID.randomUUID.toString )
				
				use.predefinedValue = useValue
				useCollectionInstanceCount++
				si.members.add(use)
			}
			
		}
		
		
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.state = si;
		i.isCollectionElement = false
		i.name = resultName
		
		return i
	}
	
	def static Instance jsonToStateInstance(JsonObject json, String fieldName, StateDefinition definition, String resultName ){
		
		logger.info("Building new instance!");
		var i = factory.createInstance();
						
		val si = factory.createStateInstance();
		val sd = factory.createStateDeclaration();
		
		sd.state = definition
		
		logger.info("Built State Declaration");
		
		//Build State Instance
		logger.info("Building State Instance");
		
		var jsonIterator = json.iterator
		var useStateInstanceCount = 0
		var useCollectionInstanceCount = 0
		
		while (jsonIterator.hasNext){
			var Entry<String,Object> curr = jsonIterator.next
			
						//Handle Set Statements
			if (curr.value instanceof String){
				var set = factory.createSetStatement
				
				//Use json key as name of state being set
				set.variable = 
					WorklangResourceUtils.resolveStateDefinition(
						fieldName,
						curr.key
					)
				
				var to = factory.createToDefinition
				to.value = curr.value.toString
				
				set.toDef = to
				si.members.add(set)
			}
			
			if (curr.value instanceof JsonObject){
				var use  = factory.createUseDefinition
				
				//Resolve state definition for use
				var StateDefinition childDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, curr.key);
				
				var Instance useValue = jsonToStateInstance(curr.value as JsonObject, fieldName, childDefinition, resultName+"childStateInstance"+UUID.randomUUID.toString);
				
				use.predefinedValue = useValue
				
				useStateInstanceCount++;
				si.members.add(use)
			}
			
			if (curr.value instanceof JsonArray){
				var use = factory.createUseDefinition
				
				var StateDefinition childDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, curr.key)
				
				var Instance useValue = jsonArrayToCollectionInstance(curr.value as JsonArray, fieldName, childDefinition, resultName+"collectionStateInstance"+UUID.randomUUID.toString )
				
				use.predefinedValue = useValue
				useCollectionInstanceCount++
				si.members.add(use)
			}
			
		}
		
		
		//Assemble State Declaration and State Instance into Instance
		logger.info("Assembling instance");
		i.stateDeclaration = sd
		i.state = si;
		i.isCollectionElement = false
		i.name = resultName
		
		return i
	}	
}