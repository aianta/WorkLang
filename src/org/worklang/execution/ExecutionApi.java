package org.worklang.execution;

import org.worklang.work.Instance;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.Verticle;

public interface ExecutionApi extends Verticle{

	void start(Future<Void> future);

	Router getRouter();

	void info(RoutingContext rc);

	JsonObject infoJson();

	boolean routeExists(String routePath);

	//Utility method for adding a route for a primitive transition definition
	void addCompoundTransitionProcessor(String fieldName, Instance transition);

	void addProxyRoute(String fieldName, Instance transition);

	//Clears Execution Api Info
	void clear();

}