package org.worklang.execution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.TransitionInstance;

import io.reactivex.Single;
import io.vertx.reactivex.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.reactivex.core.Future;
import io.vertx.reactivex.core.buffer.Buffer;
import io.vertx.reactivex.ext.web.client.HttpRequest;
import io.vertx.reactivex.ext.web.client.WebClient;


public class TransitionExecutor {
	
	private static final Logger log = LoggerFactory.getLogger(Computation.class);
	
	Vertx vertx = null;
	WebClient client = null;
	TransitionInstance transition = null;
	
	public TransitionExecutor(Vertx v, WebClient c, TransitionInstance i) {
		this.vertx = v;
		this.client = c;
		this.transition = i;
	}
	
	public Single<TransitionOutput> executeTransition(Buffer input) {
		
		//Create a future for our result
		Future<TransitionOutput> f = Future.future();
		
		HttpRequest<Buffer> request = client.post(transition.getPort(), transition.getHost(), transition.getPath());
		
		log.info("Sending request to {}:{}{}", transition.getHost(), transition.getPort(), transition.getPath());
		
		request.rxSendBuffer(input).subscribe(
				success->{
					f.complete(new TransitionOutput(success.bodyAsBuffer()));
				},
				err->{
					err.printStackTrace();
					f.complete(new TransitionOutput(err));
				}
			);
		
		return f.rxSetHandler();
		
	}

	
	
}
