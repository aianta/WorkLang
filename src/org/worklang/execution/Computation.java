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

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.interpreter.WorkApi;
import org.worklang.work.Instance;

import io.vertx.core.AsyncResult;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;

public class Computation {
	
	private static final Logger logger = LoggerFactory.getLogger(Computation.class);

	private UUID id = UUID.randomUUID();
	private WebClient client;
	private Stack<SimpleEntry<UUID,ExecutionInstruction>> executionStack = new Stack<>();
	private List<SimpleEntry<UUID,ExecutionInstruction>> executionHistory = new ArrayList<>();
	
	private SimpleEntry<UUID, ExecutionInstruction> lastInstruction;
	
	private Vertx vertx;
	
	//TODO implement START WITH data structure for initializing computation with existing meta model instances
	
	public Computation (Vertx vertx, WebClient client) {
		this.client = client;
		this.vertx = vertx;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public WebClient getClient() {
		return client;
	}
	
	public UUID addInstruction(ExecutionInstruction instruction) {
		
		logger.info("Adding instruction to execution stack");
		
		SimpleEntry<UUID, ExecutionInstruction> entry = 
				new SimpleEntry<>(UUID.randomUUID(), instruction);
		
		executionStack.add(entry);
		
		return entry.getKey();
	}
	
	public ExecutionInstruction run() throws Exception{
		while (!executionStack.empty()) {
			computeNext();
		}
		
		return executionHistory.get(executionHistory.size()-1).getValue();
	}
	
	public SimpleEntry<UUID, ExecutionInstruction> toComputeNext(){
		return executionStack.peek();
	}
	
	public void computeNext() throws Exception{
		SimpleEntry<UUID,ExecutionInstruction> toCompute = executionStack.pop();
		
		if (lastInstruction != null ) {
			
			//Go through any unresolved inputs in toCompute and populate them with output instances from the last instruction
			toCompute.getValue().status().getUnresolvedInputs().forEach(entry->{
				Instance i = lastInstruction.getValue().getOutput(entry.getKey()).getValue().getValue();
				entry.setValue(i);
			});
			
			
			if (toCompute.getValue().isExecutable()) {
				compute(toCompute);
			}else {
				logger.error("Instruction isn't executable!");
				logger.error(toCompute.getValue().status().toString());
				throw new Exception("Attempted to execute unexecutable instruction");
			}
			
		}else {
			if (toCompute.getValue().isExecutable()) {
				compute(toCompute);
			}else {
				logger.error("Instruction isn't executable!");
				logger.error(toCompute.getValue().status().toString());
				throw new Exception("Attempted to execute unexecutable instruction");
			}
			
		}
	}

	@SuppressWarnings("unchecked")
	private void compute(SimpleEntry<UUID, ExecutionInstruction> toCompute) {
		//Execute instruction
		toCompute.getValue().execute().setHandler(result->{
			if (((AsyncResult)result).succeeded()) {
				
				//Update meta model asynchronously 
				vertx.executeBlocking(blocking->{
					
					WorkApi.reprocessActiveResource();
					
					blocking.complete();
					
				}, modelUpdateResult->{
					
					if (modelUpdateResult.succeeded()) {
						toCompute.getValue().executed();
						executionHistory.add(toCompute);
						lastInstruction = toCompute;
						
					}else {
						logger.error("Failed to update meta model after instruction execution!");
					}
					
				});
				
			}else {
				logger.error("Failed to execute instruction");
			}
		});
	}
	
	public Stack<SimpleEntry<UUID, ExecutionInstruction>> getExecutionStack() {
		return executionStack;
	}

	public List<SimpleEntry<UUID, ExecutionInstruction>> getExecutionHistory() {
		return executionHistory;
	}
	
	/* Returns the instruction that would be executed before the method parameter.
	 * Use this to determine if outputs of the previous instructions match inputs 
	 * for the next instruction.
	 */
	public SimpleEntry<UUID, ExecutionInstruction> executionContext(ExecutionInstruction instruction){
		
		Iterator<SimpleEntry<UUID,ExecutionInstruction>> it = executionStack.iterator();
		
		while (it.hasNext()) {
			SimpleEntry<UUID,ExecutionInstruction> curr = it.next();
			
			//If we found the instruction
			if (curr.getKey().equals(instruction.getId())) {
				
				//Return the instruction to be executed before it
				if (it.hasNext()) {
					return it.next();
				}else {
					logger.info("Execution context is empty");
				}
			}
		}
		
		logger.error("Could not find insturction in execution stack!");
		return null;
		
	}

	public Vertx getVertx() {
		return vertx;
	}

}
