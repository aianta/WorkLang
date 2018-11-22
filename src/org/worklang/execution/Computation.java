package org.worklang.execution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.Transition;
import org.worklang.work.TransitionInstance;

import io.reactivex.Single;
import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.core.buffer.Buffer;
import io.vertx.reactivex.ext.web.RoutingContext;
import io.vertx.reactivex.ext.web.client.WebClient;


public class Computation {
	
	private static final Logger log = LoggerFactory.getLogger(Computation.class);
	
	List<TransitionExecutor> computation = new ArrayList<>();
	Vertx vertx;
	WebClient client;
	
	Stack<TransitionExecutor> executionStack = new Stack<>();
	
	public Computation(Vertx v, WebClient c, List<TransitionInstance> init) {
		this.vertx = v;
		this.client = c;
		
		for (TransitionInstance ti: init) {
			log.info("creating executor for {}:{}", ti.getHost(), ti.getPort());
			computation.add(new TransitionExecutor(vertx, client, ti));
		}
		
	}
	
	
	public void handler(RoutingContext rc) {
	
		//Build my execution stack
		for (int i = computation.size()-1; i >= 0; i--) {
			executionStack.push(computation.get(i));
		}
		
		log.info("Execution stack loaded (size: {})", executionStack.size());
		
		//Extract input from request body and work through the execution stack 
		Buffer input = rc.getBody();
		computeNext(new TransitionOutput(input), executionStack.pop(), rc);
		
	}

	
	/**	If the input to the next transition is an error from the last transition,
	 * 	return the error as our result instead of proceeding forward.
	 * 
	 * 	Otherwise, if there are still transitions to execute, execute them.
	 * 
	 *  If there are no transitions to execute in the stack, execute the last transition and send it's outputs as our response.
	 */	
	private void computeNext(TransitionOutput input, TransitionExecutor executor, RoutingContext rc) {
		
		if (input.hasFailed()) {
			rc.response().setStatusCode(500).end(input.value());
		}else {
			
			if (executionStack.size() != 0) {
				
				executor.executeTransition(input.value()).subscribe(
						result->{
							
							log.info("computeNext to run with {}:{}{}",
									executionStack.peek().transition.getHost(),
									executionStack.peek().transition.getPort(),
									executionStack.peek().transition.getPath());
							computeNext(result, executionStack.pop(), rc);
						}
					);
			
			}else {
				
				executor.executeTransition(input.value()).subscribe(
						result->{
							
							rc.response().setStatusCode(200).end(result.value());
						}
					);
				
			}
			
		}
		
	}
	
}
