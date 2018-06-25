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

package org.worklang.interpreter

import io.vertx.core.AbstractVerticle
import io.vertx.core.http.HttpServerOptions
import io.vertx.core.http.HttpServer
import io.vertx.ext.web.Router
import io.vertx.ext.web.Route
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.core.http.HttpMethod
import org.worklang.WorkStandaloneSetup
import org.slf4j.LoggerFactory
import org.worklang.execution.ExecutionApi
import org.neo4j.driver.v1.Driver
import org.neo4j.driver.v1.GraphDatabase
import com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import com.steelbridgelabs.oss.neo4j.structure.providers.Neo4JNativeElementIdProvider
import org.neo4j.driver.v1.AuthTokens
import org.eclipse.xtext.resource.XtextResource

class WorkApi extends AbstractVerticle {
	
	val static logger = LoggerFactory.getLogger(WorkApi)
	

	//Neo4j DB 
	private Driver graphDbDriver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "admin"));
	
	private Neo4JElementIdProvider vertexIdProvider = new Neo4JNativeElementIdProvider();
	private Neo4JElementIdProvider edgeIdProvider = new Neo4JNativeElementIdProvider();
	
	var static Neo4JGraph graph;
	var static XtextResource activeResource;
	 
	var Interpreter interpreter
	val HttpServerOptions options = new HttpServerOptions
	var HttpServer server
	val Router router = Router.router(vertx)
	var Route processWorklangDataRoute
	
	var static ExecutionApi exec
	
	new (){
		try {
			//Setup connection to meta model 
			graph = new Neo4JGraph(graphDbDriver, vertexIdProvider, edgeIdProvider);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	override start () throws Exception {
		
		logger.info("REST Verticle starting")
		
		//Start Execution Manager
		logger.info("Initializing Execution Manager")
		exec = new ExecutionApi(graph)
		
		logger.info("Attempting to deploy Execution Manager")
		vertx.deployVerticle(exec)
		
		logger.info("Initializing Worklang Interpreter")
		val injector = new WorkStandaloneSetup().createInjectorAndDoEMFRegistration
		interpreter = injector.getInstance(Interpreter)
		
		options.port = 9000
		
		server = vertx.createHttpServer(options)
	
		router.mountSubRouter("/exec", exec.getRouter)
	
		
		router.route(HttpMethod.POST, "/").handler(BodyHandler.create)
		
		processWorklangDataRoute = router.route(HttpMethod.POST ,"/")
			.consumes("application/octet-stream")
		
		processWorklangDataRoute.handler[rc|processWorkFile(rc)]
		
		server.requestHandler[r|router.accept(r)].listen
		
	}
	
	def  processWorkFile (RoutingContext rc){
		var request = rc.request	
		val response = rc.response
		
		val String worklangData = rc.bodyAsString
		
		println("Got request: " + request.uri)
		
		println(worklangData)
		
		println("Interpreting!")
		
		
		interpreter.runGenerator(worklangData)
		
		
				
		response.end("Done!")
	}
	
	def static getExecutionManager(){
		exec
	}
	
	def static getGraph(){
		graph
	}
	
	def static getActiveResource(){
		activeResource
	}
	
	def static setActiveResource(XtextResource resource){
		activeResource = resource
	}
	
}