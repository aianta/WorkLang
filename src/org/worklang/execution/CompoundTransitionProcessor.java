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

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.work.CompoundTransitionInstance;
import org.worklang.work.Instance;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionInstance;

import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.client.WebClient;

/**	Compound Transition Processor
 *  @author Alex Ianta
 *	
 *	Creates 
 */

public class CompoundTransitionProcessor {

	private static Logger logger = LoggerFactory.getLogger(CompoundTransitionProcessor.class);

	private Computation computation;
	private Vertex transition;
	private String fieldName;
	
	public CompoundTransitionProcessor (WebClient client, Vertex transition, String fieldName) {
		
		this.transition = transition;
		this.fieldName = fieldName;
		computation = new Computation(client);
		
	}
	
	public void process(RoutingContext rc) {
		
		Vertex expressionVertex = transition.vertices(Direction.OUT, "expression").next();
		
		
	
		
	
	}
	
	public void processExecutionResult(Vertex expressionVertex) {
		
		Vertex computeFirst = expressionVertex.vertices(Direction.OUT, "computeFirst").next();
		Vertex computeFirstInstance = computeFirst.vertices(Direction.OUT, "instanceOf").next();
		
		ExecutionInstruction instruction =
				new ExecutionInstruction(computation, fieldName);
		
		Instance transitionInstance = 
			WorklangResourceUtils.resolveTransitionInstance(
				computeFirstInstance.property("field").value().toString(),
				computeFirstInstance.property("name").value().toString());
		
		TransitionDefinition transitionDefinition = 
				WorklangResourceUtils.resolveTransition(
						computeFirstInstance.property("field").value().toString(),
						transitionInstance
							.getTransitionDeclaration()
							.getTransition()
							.getName());
		
		instruction.setTransition(transitionDefinition, transitionInstance);
	}
	
}
