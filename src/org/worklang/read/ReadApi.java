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

package org.worklang.read;

import java.util.ArrayList;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.metamodel.MetaModelUtils;
import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;

import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;


public class ReadApi extends AbstractVerticle{
	
	private static Logger logger = LoggerFactory.getLogger(ReadApi.class);
	
	private Neo4JGraph graph;
	
	private Router router;
	
	private ArrayList<String> stateInstances = new ArrayList<String>();
	private ArrayList<String> states = new ArrayList<String>();
	private ArrayList<String> fields = new ArrayList<String>();
	
	
	public ReadApi (Neo4JGraph graph) {
		this.graph = graph;
	}
	
	public void start (Future<Void> future) {
		
		logger.info("ReadApi starting up");
		
		router = Router.router(vertx);
		
		Route infoRoute = router.route(HttpMethod.GET,"/").handler(this::info);
		
		future.complete();
	}
	
	public void info (RoutingContext rc) {
		
		HttpServerResponse response = rc.response();
		
		JsonObject data = new JsonObject()
				.put("Service",  "Work Read Api")
				.put("Version", "0.1")
				.put("live-fields", fields.size())
				.put("live-states", states.size())
				.put("live-state-instances", stateInstances.size());
		
		//Compile field manifest
		JsonArray fieldManifest = new JsonArray(fields);
		data.put("fields", fieldManifest);
		
		//Compile state manifest
		JsonArray stateManifest = new JsonArray(states);
		data.put("states", stateManifest);
		
		//Compile state instance manifest
		JsonArray stateInstanceManifest = new JsonArray(stateInstances);
		data.put("state-instances", stateInstanceManifest);
		
		response.end(data.encode());
	}
	
	public Router getRouter() {
		return router;
	}
	
	public void addStateInstance (String fieldName, Instance state) {
		
		String routePath = "/" + fieldName.toLowerCase() + "/" +
		state.getStateDeclaration().getState().getName().toLowerCase() + "/" +
		state.getName().replaceAll("\\s", "").toLowerCase();
		
		logger.info("Registering state instance at {}", routePath);
		
		Route route = router.route(HttpMethod.GET, routePath).handler(rc->{
			
			Vertex stateInstanceVertex = MetaModelUtils.getStateInstanceVertex(fieldName, state.getName());
			
			JsonObject data = MetaModelUtils.stateInstanceVertexToJson(stateInstanceVertex);
			
			rc.response().end(data.encode());
			
		});
		
		stateInstances.add(routePath);
	}
	
	public void addState(String fieldName, StateDefinition state) {
		
		String routePath = "/" + fieldName.toLowerCase() + "/" +
			state.getName().toLowerCase();
		
		logger.info("Registering state at {}", routePath);
		
		Vertex stateVertex = MetaModelUtils.getStateVertex(fieldName, state.getName());
		
		Route route = router.route(HttpMethod.GET, routePath).handler(rc->{
			
			JsonObject data = MetaModelUtils.stateVertexToJson(stateVertex);
			
			rc.response().end(data.encode());
			
		});
		
		Route instances = router.route(HttpMethod.GET, routePath + "/instances").handler(rc->{
			
			JsonObject data = MetaModelUtils.stateVertexInstancesToJson(stateVertex);
			
			rc.response().end(data.encode());
			
		});
		
		states.add(routePath);
	}

	
	public void addField(String fieldName) {
		
		String routePath = "/" + fieldName.toLowerCase();
		
		logger.info("Registering field at {}", routePath);
		
		Vertex fieldVertex = MetaModelUtils.getFieldVertex(fieldName);
		
		Route route = router.route(HttpMethod.GET, routePath).handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexToJson(fieldVertex);
			
			rc.response().end(data.encode());
			
		});
		
		Route definitions = router.route(HttpMethod.GET, routePath + "/definitions").handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexDefinitionsToJson(fieldVertex);
			
			rc.response().end(data.encode());
			
		});
		
		Route stateDefinitions = router.route(HttpMethod.GET, routePath + "/definitions/state").handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexStateDefinitionsToJson(fieldVertex);
			
			rc.response().end(data.encode());
		});
		
		Route transitionDefinitions = router.route(HttpMethod.GET, routePath + "/definitions/transition").handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexTransitionDefinitionsToJson(fieldVertex);
			
			rc.response().end(data.encode());
			
		});
		
		Route instances = router.route(HttpMethod.GET, routePath + "/instances").handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexInstancesToJson(fieldVertex);
			
			rc.response().end(data.encode());
			
		});
		
		Route stateInstances = router.route(HttpMethod.GET, routePath + "/instances/state").handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexStateInstancesToJson(fieldVertex);
			
			rc.response().end(data.encode());
		});
		
		Route transitionInstances = router.route(HttpMethod.GET, routePath + "/instances/transition").handler(rc->{
			
			JsonObject data = MetaModelUtils.fieldVertexTransitionInstancesToJson(fieldVertex);
			
			rc.response().end(data.encode());
		});
		
		fields.add(routePath);
		
	}
	
	//Clears Read Api Info
	public void clear() {
		fields.clear();
		states.clear();
		stateInstances.clear();
	}
}
