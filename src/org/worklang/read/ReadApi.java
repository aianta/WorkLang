package org.worklang.read;

import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;

import io.vertx.core.Future;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public interface ReadApi {

	void start(Future<Void> future);

	void info(RoutingContext rc);

	Router getRouter();

	void addCollectionInstance(String fieldName, Instance collection);

	void addStateInstance(String fieldName, Instance state);

	void addState(String fieldName, StateDefinition state);

	void addField(String fieldName);

	//Clears Read Api Info
	void clear();

}