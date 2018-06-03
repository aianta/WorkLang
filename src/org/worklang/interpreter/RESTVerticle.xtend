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

class RESTVerticle extends AbstractVerticle {
	
	var Interpreter interpreter
	val HttpServerOptions options = new HttpServerOptions
	
	var HttpServer server
	val Router router = Router.router(vertx)
	
	var Route processWorklangDataRoute
	
	override start () throws Exception {
		
		println("REST Verticle starting")
		
		println("Initializing Worklang Interpreter")
		val injector = new WorkStandaloneSetup().createInjectorAndDoEMFRegistration
		interpreter = injector.getInstance(Interpreter)
		
		options.port = 9000
		
		server = vertx.createHttpServer(options)
	
		
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
	
}