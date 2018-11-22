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

import io.vertx.reactivex.core.AbstractVerticle
import io.vertx.core.http.HttpServerOptions
import io.vertx.reactivex.core.http.HttpServer
import io.vertx.reactivex.ext.web.Router
import io.vertx.reactivex.ext.web.Route
import io.vertx.reactivex.ext.web.RoutingContext
import io.vertx.reactivex.ext.web.handler.BodyHandler
import io.vertx.core.http.HttpMethod
import org.worklang.WorkStandaloneSetup
import org.slf4j.LoggerFactory
import org.neo4j.driver.v1.Driver
import org.neo4j.driver.v1.GraphDatabase
import com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import com.steelbridgelabs.oss.neo4j.structure.providers.Neo4JNativeElementIdProvider
import org.neo4j.driver.v1.AuthTokens
import org.eclipse.xtext.resource.XtextResource
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.__;
import org.apache.tinkerpop.gremlin.structure.Element
import org.apache.tinkerpop.gremlin.process.traversal.Traversal
import org.worklang.work.Domain
import org.worklang.work.TransitionInstance
import org.worklang.work.Instance
import org.apache.tinkerpop.gremlin.structure.Edge
import java.util.ArrayList
import org.worklang.execution.Computation
import io.vertx.reactivex.ext.web.client.WebClient
import org.worklang.work.Transition
import java.util.Date
import java.time.Instant
import org.worklang.work.WorkFactory
import org.worklang.work.State
import java.util.UUID

class WorkApi extends AbstractVerticle {
	
	val static logger = LoggerFactory.getLogger(WorkApi)
	

	//Neo4j DB 
	private Driver graphDbDriver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "admin"));
	
	private Neo4JElementIdProvider vertexIdProvider = new Neo4JNativeElementIdProvider();
	private Neo4JElementIdProvider edgeIdProvider = new Neo4JNativeElementIdProvider();
	
	val factory = WorkFactory.eINSTANCE
	
	var static Neo4JGraph graph;
	var static XtextResource activeResource;
	 
	var Interpreter interpreter
	val HttpServerOptions options = new HttpServerOptions
	var static HttpServer server
	var Router router
	var Route processWorklangDataRoute
	
	
	var String genRoutePrefix = "/gen/"
	var WebClient client;
	
	new (){
		try {
			//Setup connection to meta model 
			graph = new Neo4JGraph(graphDbDriver, vertexIdProvider, edgeIdProvider);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	override start () throws Exception {
		
		 router = Router.router(vertx)
		
		logger.info("REST Verticle starting")
		client = WebClient.create(vertx);
		
		
		logger.info("Initializing Worklang Interpreter")
		val injector = new WorkStandaloneSetup().createInjectorAndDoEMFRegistration
		interpreter = injector.getInstance(Interpreter)
		
		options.port = 9000
		
		server = vertx.createHttpServer(options)
		
		router.route(HttpMethod.POST, "/*").handler(BodyHandler.create)
		router.route(HttpMethod.GET, "/compute").handler[rc|computeApplication(rc)]
		
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
	
	def computeApplication(RoutingContext rc){
		
		var request = rc.request
		var response = rc.response
		
		var startVertexName = rc.request.getParam("start")
		var endVertexName = rc.request.getParam("end")
		var genName = rc.request.getParam("name")
		
		var startVertex = graph.vertices("match (s:State {name:'" + startVertexName + "'}) return s").head
 		var endVertex = graph.vertices("match (s:State {name:'" + endVertexName + "'}) return s").head
 		
 		
 		var path =  graph.traversal.V(startVertex.id).repeat(__.outE().inV.simplePath()).until(__.hasId(endVertex.id)).path.limit(1)
 		
 		val transitionList = new ArrayList<TransitionInstance>()
 		
 		path.next.forEach[pathElement|
 			logger.info("path element: {}", pathElement)
 			
 			var graphElement = pathElement as Element
 			
 			logger.info("name = {}", graphElement.property("name").value.toString)
 			
 			if (pathElement instanceof Edge){
 				transitionList.add(instanceResolver(graphElement.property("name").value.toString))
 			}
 			
 		]
 		
 		var result = genRoutePrefix+genName
 		
 		var Route r = router.route(HttpMethod.POST, result)
 		
		val computation =  new Computation(vertx, client, transitionList)
		
		r.handler[computationRoutingContext|
			computation.handler(computationRoutingContext)
		] 		
 		
 		rc.response.statusCode = 200
 		rc.response.end(result)
		
		//Create new transition definition
		var newTransition = factory.createTransition
 		newTransition.input = stateResolver(startVertexName)
 		newTransition.output = stateResolver(endVertexName)
 		newTransition.name = genName
 		
 		getDomain.definitionSpace.transitions.add(newTransition)
 		
 		//Create new transition instance 
 		
 		var newTransitionInstance = factory.createTransitionInstance
 		newTransitionInstance.host = "localhost"
 		newTransitionInstance.port = getServer.actualPort
 		newTransitionInstance.path = result
 		
 		var newInstance = factory.createInstance
 		newInstance.conceptualTransition = newTransition
 		newInstance.name = UUID.randomUUID.toString
 		newInstance.transition = newTransitionInstance
 		
 		getDomain.instanceSpace.instances.add(newInstance)
 		
		
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
	
	def static getServer(){
		return server;
	}
	
	def static instanceResolver(String name){
		
		(activeResource.allContents.findFirst[element|
			element instanceof Instance && (element as Instance).conceptualTransition.name.equals(name)
		] as Instance).transition
		
	}
	
	def static stateResolver(String name){
		(activeResource.allContents.findFirst[element|
			element instanceof State && (element as State).name.equals(name)
		]) as State
	}
	
	def static getDomain(){
		(activeResource.allContents.findFirst[element|
			element instanceof Domain
		]) as Domain
	}
	
	def static generateTransitionModel(Transition t){
		
		var tx = graph.tx 
		
		var inputVertex = graph.vertices("match (n:State {name:'" + t.input.name + "'}) return n").head
		var outputVertex = graph.vertices("match (n:State {name:'" + t.output.name + "'}) return n").head
		
		inputVertex.addEdge("transition", outputVertex,
			"name", t.name,
			"worklangKey", t.eClass.instanceTypeName,
			"created", Date.from(Instant.now).toString
		)
		
		tx.commit
	}
	
}