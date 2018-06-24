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
import org.worklang.execution.ExecutionManager

class RESTVerticle extends AbstractVerticle {
	
	val static logger = LoggerFactory.getLogger(RESTVerticle)
	
	var Interpreter interpreter
	val HttpServerOptions options = new HttpServerOptions
	
	var HttpServer server
	val Router router = Router.router(vertx)
	
	var Route processWorklangDataRoute
	
	var static ExecutionManager exec
	
	override start () throws Exception {
		
		logger.info("REST Verticle starting")
		
		//Start Execution Manager
		logger.info("Initializing Execution Manager")
		exec = new ExecutionManager()
		
		logger.info("Attempting to deploy Execution Manager")
		vertx.deployVerticle(exec)
		
		logger.info("Initializing Worklang Interpreter")
		val injector = new WorkStandaloneSetup().createInjectorAndDoEMFRegistration
		interpreter = injector.getInstance(Interpreter)
		
		options.port = 9000
		
		server = vertx.createHttpServer(options)
	
		router.mountSubRouter("/exec", exec.router)
	
		
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
	
	
}