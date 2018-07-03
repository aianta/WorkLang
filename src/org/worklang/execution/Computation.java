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
import org.worklang.execution.structures.StateInfo;
import org.worklang.interpreter.WorkApi;
import org.worklang.work.Instance;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;

public class Computation {
	
	private static final Logger logger = LoggerFactory.getLogger(Computation.class);

	private UUID id = UUID.randomUUID();
	private WebClient client;
	private Stack<ExecutionInstruction> executionStack = new Stack<>();
	private List<ExecutionInstruction> executionHistory = new ArrayList<>();
	
	private ExecutionInstruction lastInstruction; //As in previously executed instruction
		
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
	
	//Adds a new instruction to the computation and assigns it a UUID
	public UUID addInstruction(ExecutionInstruction instruction) {
		
		logger.info("Adding instruction to execution stack");
		
		executionStack.push(instruction);
		
		
		return UUID.randomUUID();
	}
	
	public void run(Future<ExecutionInstruction> resultFuture) throws Exception{
		
		Future<Void> done = Future.future();
		
		done.setHandler(result->{
			
			resultFuture.complete(executionHistory.get(executionHistory.size()-1));
			
		});
		
		computeNext(done);
		
		
		
	}
	
	public ExecutionInstruction toComputeNext(){
		return executionStack.peek();
	}
	
	public void computeNext(Future<Void> done) throws Exception{
		ExecutionInstruction toCompute = executionStack.pop();
		
		logger.info("computing next -> {}", toCompute.toString());
		
		if (lastInstruction != null ) {
			logger.info("last instruction is not null");
			logger.info("instruction -> {}", toCompute.toString());
			
			//Go through any unresolved inputs in toCompute and populate them with output instances from the last instruction
			Iterator<StateInfo> unresolvedInputIterator = toCompute.status().getUnresolvedInputs().iterator();
			
			while (unresolvedInputIterator.hasNext()){
				StateInfo curr = unresolvedInputIterator.next();
				logger.info("Unresolved input entry: UUID->{} Instance ->{} ", curr.getId().toString(), curr.getInstance());
				
				Instance i = lastInstruction.getOutput(curr.getId()).getInstance();
				logger.info("Resolved instance -> {}", i.toString());
				
				ExecutionInstruction inst = toCompute;
				inst.setInputInstance(curr.getId(), i);
				toCompute = inst;
			}

			
			logger.info("resolved instruction -> {}", toCompute.toString());
			
			if (toCompute.isExecutable()) {
				compute(toCompute,done);
				
			}else {
				logger.error("Instruction isn't executable!");
				logger.error(toCompute.status().toString());
				throw new Exception("Attempted to execute unexecutable instruction");
			}
			
		}else {
			logger.info("last instruction is null");
			if (toCompute.isExecutable()) {
				compute(toCompute,done);
				
			}else {
				logger.error("Instruction isn't executable!");
				logger.error(toCompute.status().toString());
				throw new Exception("Attempted to execute unexecutable instruction");
			}
			
		}
	}

	@SuppressWarnings("unchecked")
	private void compute(ExecutionInstruction toCompute, Future<Void> done) {
		
		//Execute instruction
		toCompute.execute().setHandler(result->{
			if (((AsyncResult)result).succeeded()) {
				
				//Update meta model asynchronously 
				vertx.executeBlocking(blocking->{
					
					WorkApi.reprocessActiveResource();
					
					blocking.complete();
					
				}, modelUpdateResult->{
					
					if (modelUpdateResult.succeeded()) {
						toCompute.executed();
						executionHistory.add(toCompute);
						lastInstruction = toCompute;
						
						try {
							
							if (!executionStack.empty()) {
								computeNext(done);
							}else {
								done.complete();
							}
							
							
						} catch (Exception e) {
							logger.error("Error computing next");
							e.printStackTrace();
						}
						
					}else {
						logger.error("Failed to update meta model after instruction execution!");
					}
					
				});
				
			}else {
				logger.error("Failed to execute instruction");
			}
		});
	}
	
	public Stack<ExecutionInstruction> getExecutionStack() {
		return executionStack;
	}

	public List<ExecutionInstruction> getExecutionHistory() {
		return executionHistory;
	}
	
	/* Returns the instruction that would be executed before the method parameter.
	 * Use this to determine if outputs of the previous instructions match inputs 
	 * for the next instruction.
	 */
	public ExecutionInstruction executionContext(ExecutionInstruction instruction){
		
		logger.info("looking for {}", instruction.getId());
		
		Iterator<ExecutionInstruction> it = executionStack.iterator();
		
		logger.info("Iterating through the stack");
		//SimpleEntry<UUID,ExecutionInstruction> last = null;
		while (it.hasNext()) {
			ExecutionInstruction curr = it.next();
			logger.info("Instruction -> {}", curr);
			//If we found the instruction
			if (curr.getId().equals(instruction.getId())) {
				//Return the instruction to be executed before it
				
				//return last;
				if (it.hasNext()) {
					return it.next();
				}else {
					logger.error("Stack is empty, context not found!");
				}
			}
			//last = curr;
		}
		
		logger.error("Could not find insturction in execution stack!");
		return null;
		
	}

	public Vertx getVertx() {
		return vertx;
	}
	
	public String toString() {
		JsonObject data = new JsonObject()
				.put("id", id.toString())
				.put("execution stack - size", executionStack.size())
				.put("execution stack - head [next instruction]", new  JsonObject()
						.put("UUID", executionStack.peek().getId().toString())
						.put("Execution Instruction", executionStack.peek().toJson()));
		
			if (lastInstruction != null) {
				data.put("last instruction", new JsonObject()
						.put("UUID", lastInstruction.getId().toString())
						.put("Execution Instruction", lastInstruction.toJson()));
			}else {
				data.put("last instruction", "null");
			}
				
				
		JsonObject executionHistory = new JsonObject();
		
		this.executionHistory.forEach(entry->{
			executionHistory.put(entry.getId().toString(), entry.toString());
		});
		
		data.put("execution history", executionHistory);
		
		return data.encodePrettily();
	}
	
	public void customizeFinalInstructionOutputId (String id) {
		executionStack.get(0).setLastOutputInstanceId(id);
		executionStack.get(0).setLastInstruction(true);
	}

}
