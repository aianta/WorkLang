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
 
package org.worklang.generator


import io.vertx.core.Vertx
import org.slf4j.LoggerFactory
import org.worklang.interpreter.WorkApi
import org.worklang.execution.ExecutionApi

class Main {
	
	//Logging
	val static logger = LoggerFactory.getLogger(Main)
	
	static Vertx vertx = Vertx.vertx(); 

	def static main(String[] args) {
		
		logger.info("Initializing REST API")
		var WorkApi restapi = new WorkApi()
		 
		logger.info("Attempting to deploy REST API")
		vertx.deployVerticle(restapi)
		
		return
	}

	
}
