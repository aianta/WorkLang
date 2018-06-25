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
		
		JsonObject data = new JsonObject()
				.put("Service", "Work Execution Manager")
				.put("Version", "0.1")
				.put("live-transitions", transitions.size());
				
		
		JsonArray transitionManifest = new JsonArray();
		
		for (String s: transitions) {
			transitionManifest.add(s);
		}
		
		data.put("transitions", transitionManifest);
				
		response.end(data.encode());
	}
	
	public void addTransition(String fieldName, Instance transition) {
		
		String routePath = "/" + fieldName.toLowerCase() + "/" +
		transition.getTransitionDeclaration().getTransition().getName().toLowerCase() + "/" +
		transition.getName().replaceAll("\\s", "").toLowerCase();
		
		logger.info("Registering transition at {}", routePath);
		
		Route route = router.route(routePath).handler(rc->{
			
			String outputInstanceName = rc.request().getParam("produce");
			
			client.get(
					transition.getTransition().getPort(),
					transition.getTransition().getHost(),
					transition.getTransition().getPath())
			.send(ar->{
		    	if(ar.succeeded()){
		    				    		
		        	HttpResponse response = ar.result();
						
					System.out.println(response.body().toString());
					
					JsonObject data = response.bodyAsJsonObject();
					
					WorkFactory factory = WorkFactory.eINSTANCE;
					
					/* We need to create a new instance to persist the result of this transition.
					 * Instances have a State Declaration and a State Instance
					 */
					logger.info("Building new instance!");
					Instance i = factory.createInstance();
					
					StateInstance si = factory.createStateInstance();
					StateDeclaration sd = factory.createStateDeclaration();
					
					
					//Build State Declaration
					logger.info("Building State Declaration");
					logger.info("Finding output state: ");
					logger.info("match (this:`transition instance` {field:'{}', name:'{}' })-[:instanceOf]->(parent:transition)-[:produces]->(:transition)-[:hasParameter]->(outputElement:state) return outputElement",fieldName, transition.getName());
					
					Vertex outputStateVertex = graph.vertices("match (this:`transition instance` {field:'"+fieldName+"', name:'"+transition.getName()+"' })-[:instanceOf]->(parent:transition)-[:produces]->(:transition)-[:hasParameter]->(outputElement:state) return outputElement").next();
					logger.info("outputStateVertex => {}", outputStateVertex);
		
					sd.setState(
							WorklangResourceUtils.
							resolveStateDefinition(
									fieldName,
									outputStateVertex.property("name").value().toString()
								)
							);
					
					logger.info("Built State Declaration");
					
					//Build State Instance
					logger.info("Building State Instance");
					data.forEach(entry->{
						if (entry.getValue() instanceof String) {
							SetStatement set = factory.createSetStatement();
							
							//Use json key as name of state being set
							set.setVariable(WorklangResourceUtils.resolveStateDefinition(fieldName, 
									entry.getKey()
									));
							
							ToDefinition to = factory.createToDefinition();
							to.setValue(entry.getValue().toString());
							
							set.setToDef(to);
							si.getMembers().add(set);
						}
					});
					
					//Assemble State Declaration and State Instance into Instance
					logger.info("Assembling instance");
					i.setStateDeclaration(sd);
					i.setState(si);
					
					if (outputInstanceName != null) {
						i.setName(outputInstanceName);
					}else{
						i.setName(transition.getName() + " output - " + Date.from(Instant.now()).toString());
					}
					
					//Add new instance to active resource
					WorklangResourceUtils.resolveInstanceSpace(fieldName).getInstances().add(i);
					
					//Update meta model
					try {
						Map<String,String> globalWorkspaceSaveOptions = new HashMap<String,String>();
						globalWorkspaceSaveOptions.put("WorkPersistenceType", "globalWorkspace");
						WorkApi.getActiveResource().save(globalWorkspaceSaveOptions);
					}catch(Exception e) {
						logger.info("Failed to update meta model");
						e.printStackTrace();
					}

					
					rc.response().end(data.encode());
				}
			});
			
		});
		
		transitions.add(routePath);
		
	}
	

}
