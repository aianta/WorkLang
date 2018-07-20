package org.worklang.execution;

import java.util.ArrayList;

import io.vertx.core.json.JsonObject;

public interface ExecutionInstructionState {

	/**
	 *  Inspect instruction and determine its state
	 */

	void update();

	void clear();

	//Getters and Setters
	boolean isInputResolved();

	boolean isOutputResolved();

	boolean areTransitionsResolved();

	ArrayList<StateInfo> getUnresolvedInputs();

	ArrayList<StateInfo> getUnresolvedOutputs();

	ArrayList<TransitionInfo> getUnresolvedTransition();

	String toString();

	JsonObject toJson();

}