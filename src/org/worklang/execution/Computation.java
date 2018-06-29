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
import java.util.List;
import java.util.Stack;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.ext.web.client.WebClient;

public class Computation {
	
	private static final Logger logger = LoggerFactory.getLogger(Computation.class);

	private UUID id = UUID.randomUUID();
	private WebClient client;
	private Stack<SimpleEntry<UUID,ExecutionInstruction>> executionStack = new Stack<>();
	private List<SimpleEntry<UUID,ExecutionInstruction>> executionHistory = new ArrayList<>();
	
	public Computation (WebClient client) {
		this.client = client;
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
	
	public void computeNext() {
		SimpleEntry<UUID,ExecutionInstruction> toCompute = executionStack.pop();
		
		toCompute.getValue().execute();
		
		executionHistory.add(toCompute);
	}

	public Stack<SimpleEntry<UUID, ExecutionInstruction>> getExecutionStack() {
		return executionStack;
	}

	public List<SimpleEntry<UUID, ExecutionInstruction>> getExecutionHistory() {
		return executionHistory;
	}

}
