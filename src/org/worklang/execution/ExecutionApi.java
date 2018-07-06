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

package org.worklang.execution;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;
import org.eclipse.xtext.resource.XtextResource;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Values;
import org.neo4j.driver.v1.types.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.interpreter.WorkApi;
import org.worklang.metamodel.MetaModelUtils;
import org.worklang.work.Instance;
import org.worklang.work.SetStatement;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateInstance;
import org.worklang.work.ToDefinition;
import org.worklang.work.WorkFactory;

import com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider;
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph;
import com.steelbridgelabs.oss.neo4j.structure.providers.Neo4JNativeElementIdProvider;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;
import io.vertx.ext.web.handler.BodyHandler;

import org.eclipse.emf.ecore.EObject;

public class ExecutionApi extends AbstractVerticle{
	
	private static Logger logger = LoggerFactory.getLogger(ExecutionApi.class);
	
	private Neo4JGraph graph;
	
	private Router router;
	
	private WebClient client;
	private ArrayList<String> transitions = new ArrayList<String>();
	
	
	public ExecutionApi(Neo4JGraph graph) {
		this.graph = graph;
	}
	
	public void start (Future<Void> future) {
		
		logger.info("Execution Manager works!");
		
		//Set up client for executing REST transitions
		WebClientOptions clientOptions = new WebClientOptions()
				.setUserAgent("Work-Transition-Client/0.1");
			
		client = WebClient.create(vertx, clientOptions);
		
		router = Router.router(vertx);
		
		router.route().handler(BodyHandler.create());
		
		Route infoRoute = router.route(HttpMethod.GET, "/").handler(this::info); 
		
		future.complete();
	}
	
	public Router getRouter() {
		return router;
	}

	public void info (RoutingContext rc) {
		HttpServerResponse response = rc.response();
		
		JsonObject data = infoJson();
				
		response.end(data.encode());
	}
	
	public JsonObject infoJson() {
		
		JsonObject data = new JsonObject()
				.put("Service", "Work Execution Api")
				.put("Version", "0.1")
				.put("live-transitions", transitions.size());
				
		
		JsonArray transitionManifest = new JsonArray();
		
		for (String s: transitions) {
			transitionManifest.add(s);
		}
		
		data.put("transitions", transitionManifest);
		
		return data;
		
	}
	
	public boolean routeExists (String routePath) {
		return transitions.contains(routePath);
	}
	
	//Utility method for adding a route for a primitive transition definition
	public void addCompoundTransitionProcessor(String fieldName, Instance transition) {
		
		String routePath = "/" + fieldName.toLowerCase() + "/" +
		transition.getTransitionDeclaration().getTransition().getName().toLowerCase() + "/" +
		transition.getName().replaceAll("\\s", "").toLowerCase();
		
		logger.info("match (n:`transition instance` {field:'"+fieldName+"', name:'"+transition.getName()+"'}) return n");
		Vertex transitionVertex = graph.vertices("match (n:`transition instance` {field:'"+fieldName+"', name:'"+transition.getName()+"'}) return n").next();
		
		CompoundTransitionProcessor processor = new CompoundTransitionProcessor(vertx, client, transitionVertex, fieldName);
		
		logger.info("Registering compound instance transition at {}", routePath);
		
		Route route = router.route(routePath).handler(processor::process);
		
		transitions.add(routePath);
	}
	
	public void addProxyRoute(String fieldName, Instance transition) {
		
		String routePath = "/" + fieldName.toLowerCase() + "/" +
		transition.getTransitionDeclaration().getTransition().getName().toLowerCase() + "/" +
		transition.getName().replaceAll("\\s", "").toLowerCase();
		
		logger.info("Registering transition at {}", routePath);
		
		//If this transition has inputs
		if (transition.getTransitionDeclaration().getTransition().getIn() != null) {
			
			Route route = router.route(HttpMethod.POST,routePath).handler(rc->{
				
				//Compute inputs
				JsonArray inputs = rc.getBodyAsJsonArray();
				
				ArrayList<String> inputInstancesToFetch = new ArrayList<String>();
				
				inputs.forEach(inputInstanceName->{
					inputInstancesToFetch.add(inputInstanceName.toString());
				});
				
				final JsonObject input = new JsonObject();
				
				
				JsonArray inputsToSend = new JsonArray();
					
				for (String s: inputInstancesToFetch) {
					
					Instance i =  WorklangResourceUtils.resolveInstance(fieldName, s);
					
					if (i.getCollection() != null) {
						inputsToSend.add(ExecutionUtils.collectionInstanceToJsonArray(i));
					}
					
					if (i.getState() != null) {
						inputsToSend.add(ExecutionUtils.stateInstanceToJson(i));
					}
					
				}
				
				/* If this transition has only 1 input, simply pass the input instance
				 * as the body of the request.
				 * 
				 * Otherwise send the inputs in a JsonArray
				 */
				
				if (inputsToSend.size() == 1) {
					try {
						input.mergeIn(inputsToSend.getJsonObject(0));
					}catch(ClassCastException e) {
						logger.info("inputsToSend size was 1 but element was not JsonObject, sending array instead");
						input.put("inputs", inputsToSend.getJsonArray(0));
					}
					
				}else {
					input.put("inputs", inputsToSend);
				}
				
				
				//Send POST request
				String outputInstanceName = rc.request().getParam("produce");
				String outputCollection = rc.request().getParam("collection");
				String outputCollectionIndex = rc.request().getParam("collectionIndex");
				
				
				vertx.<Object>executeBlocking(fut->{
					
					client.post(
							transition.getTransition().getPort(),
							transition.getTransition().getHost(),
							transition.getTransition().getPath())
					.sendJsonObject(input, ar->{
				    	if(ar.succeeded()){
				    				    		
				        	HttpResponse response = ar.result();
								
							System.out.println(response.body().toString());
							
							JsonObject data = response.bodyAsJsonObject();
							
							if (data == null) {
								JsonArray dataArray = response.bodyAsJsonArray();
								logger.info("response is a json array!");
								fut.complete(dataArray);
							}
							
							logger.info("response is a json object!");
							fut.complete(data);
						}
					});
					
				}, result->{
					
					if (result.succeeded()) {
						
						Object data = result.result();
						
						//Process the result as JsonObject
						if (data instanceof JsonObject) {
							
							JsonObject jsonObjectData = (JsonObject)data;
							
							logger.info("Adding output json object to work resource!");
							
							//Create Instance from json result
							//If we were invoked to create a collection element do that
							Instance i = null;
							
							if (outputCollection != null && outputCollectionIndex != null){
								i = MetaModelUtils.jsonToCollectionElementStateInstance(jsonObjectData, fieldName, transition, outputCollection, outputCollectionIndex, outputInstanceName == null?"":outputInstanceName); 
							}else {
								//Otherwise create a normal state instance
								i = MetaModelUtils.jsonToStateInstance(jsonObjectData, fieldName, transition, outputInstanceName == null? "UntitledInstance":outputInstanceName);
							}
							
							//Add it to the Active resource
							WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
							
							logger.info("Output json object added to work resource!");
							
							rc.response().end(jsonObjectData.encode());
						}
						
						if (data instanceof JsonArray) {
							
							JsonArray jsonArrayData = (JsonArray)data;
							
							logger.info("Adding output json array to work resource");
							
							Instance i = null;
							i = MetaModelUtils.jsonArrayToCollectionInstance(jsonArrayData, fieldName, transition, outputCollection == null?"UntitledCollection":outputCollection);
							
							//Add it to the active resource
							WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
							
							logger.info("Output json array added to work resource!");
							
							rc.response().end(jsonArrayData.encode());
							
						}
						
						
						
					}else {
						logger.error("Error invoking transition -> {} through GET REST request.",
								transition.getName());
					}
					
				});
				

			});
			
		}
		
		//If this transition has no inputs
		if (transition.getTransitionDeclaration().getTransition().getIn() == null) {
			
			Route route = router.route(HttpMethod.GET, routePath).handler(rc->{
				
				
				String outputInstanceName = rc.request().getParam("produce");
				String outputCollection = rc.request().getParam("collection");
				String outputCollectionIndex = rc.request().getParam("collectionIndex");
				
				vertx.<Object>executeBlocking(fut->{
					
					client.get(
							transition.getTransition().getPort(),
							transition.getTransition().getHost(),
							transition.getTransition().getPath())
					.send(ar->{
				    	if(ar.succeeded()){
				    				    		
				        	HttpResponse response = ar.result();
								
							System.out.println(response.body().toString());
							
							JsonObject data = response.bodyAsJsonObject();
							
							//If the result couldn't be retrieved as a JsonObject try getting it as a JsonArray
							if (data == null) {
								JsonArray dataArray = response.bodyAsJsonArray();
								logger.info("response is a json array!");
								fut.complete(dataArray);
							}
							logger.info("response is a json object!");
							fut.complete(data);
							
						}
					});
					
				}, result->{
					if (result.succeeded()) {
						
						Object data = result.result();
						
						//Process the result as JsonObject
						if (data instanceof JsonObject) {
							
							JsonObject jsonObjectData = (JsonObject)data;
							
							logger.info("Adding output json object to work resource!");
							
							//Create Instance from json result
							//If we were invoked to create a collection element do that
							Instance i = null;
							
							if (outputCollection != null && outputCollectionIndex != null){
								i = MetaModelUtils.jsonToCollectionElementStateInstance(jsonObjectData, fieldName, transition, outputCollection, outputCollectionIndex, outputInstanceName == null?"":outputInstanceName); 
							}else {
								//Otherwise create a normal state instance
								i = MetaModelUtils.jsonToStateInstance(jsonObjectData, fieldName, transition, outputInstanceName == null? "UntitledInstance":outputInstanceName);
							}
							
							//Add it to the Active resource
							WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
							
							logger.info("Output json object added to work resource!");
							
							rc.response().end(jsonObjectData.encode());
						}
						
						if (data instanceof JsonArray) {
							
							JsonArray jsonArrayData = (JsonArray)data;
							
							logger.info("Adding output json array to work resource");
							
							Instance i = null;
							i = MetaModelUtils.jsonArrayToCollectionInstance(jsonArrayData, fieldName, transition, outputCollection == null?"UntitledCollection":outputCollection);
							
							//Add it to the active resource
							WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
							
							logger.info("Output json array added to work resource!");
							
							rc.response().end(jsonArrayData.encode());
							
						}
						
						
						
					}else {
						logger.error("Error invoking transition -> {} through GET REST request.",
								transition.getName());
					}
				});
				

				
			});
		}
		
		
		transitions.add(routePath);
		
	}
	
	//Clears Execution Api Info
	public void clear() {
		transitions.clear();
	}
}
