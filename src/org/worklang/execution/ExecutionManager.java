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

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.Instance;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;

public class ExecutionManager extends AbstractVerticle{
	
	private static Logger logger = LoggerFactory.getLogger(ExecutionManager.class);
	
	private Router router;
	
	private WebClient client;
	private ArrayList<String> transitions = new ArrayList<String>();
	
	
	public void start (Future<Void> future) {
		
		logger.info("Execution Manager works!");
		
		//Set up client for executing REST transitions
		WebClientOptions clientOptions = new WebClientOptions()
				.setUserAgent("Work-Transition-Client/0.1");
			
		client = WebClient.create(vertx, clientOptions);
		
		router = Router.router(vertx);
		
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
		
		Route route = router.route(routePath).handler(rc->{
			
			client.get(9999,"localhost", "/")
			.send(ar->{
		    	if(ar.succeeded()){
		        	HttpResponse response = ar.result();
						
					System.out.println(response.body().toString());
						
					rc.response().end(response.body().toString());
				}
			});
			
		});
		
		transitions.add(routePath);
		
	}
}
