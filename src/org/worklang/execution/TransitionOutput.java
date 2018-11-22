package org.worklang.execution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.reactivex.core.buffer.Buffer;

public class TransitionOutput {
	
	private static final Logger log = LoggerFactory.getLogger(TransitionOutput.class);
	
	boolean error = false;
	String errorMsg = "An error has occured";
	Buffer output = null;
	
	public TransitionOutput(Throwable err) {
		log.info("err msg->{}", err.getMessage() );
		this.error = true;
		this.errorMsg = err.getMessage();
	}
	
	public TransitionOutput(Buffer output) {
		this.output = output;
	}
	
	public Buffer value() {
		//If an error occurred, return the error message as the value
		if (error) {
			return Buffer.buffer(errorMsg);
		}else {
		//Otherwise return the value
			return output;
		}
		
	}
	
	public boolean hasFailed() {
		return error;
	}

}
