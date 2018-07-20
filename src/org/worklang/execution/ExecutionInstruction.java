package org.worklang.execution;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;
import org.worklang.work.TransitionDefinition;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

public interface ExecutionInstruction {

	//Add new input for this execution instruction
	void addInput(StateDefinition definition, Instance instance);

	//Add new input stub for this execution instruction
	void addInput(StateDefinition definition);

	//Add a new input to be resolved with a specified UUID from the previous executionContext
	void addInput(StateDefinition definition, UUID id);

	//Add new output for this execution instruction
	void addOutput(StateDefinition definition, Instance instance);

	//Add an output stub for this execution instance
	void addOutput(StateDefinition definition);

	//Set a transition definition stub
	void addTransition(TransitionDefinition transition);

	void addTransition(TransitionDefinition transition, UUID id);

	void addTransition(TransitionDefinition definition, Instance instance);

	ExecutionInstructionState status();

	void setInputInstance(UUID id, Instance i);

	ArrayList<StateInfo> getInputs();

	ArrayList<StateInfo> getOutputs();

	ArrayList<TransitionInfo> getTransitions();

	UUID getId();

	StateInfo getOutput(UUID id);

	Instance getOutputInstance(StateDefinition state);

	List<Instance> getOutputInstances();

	UUID getOutputId(StateDefinition state);

	ExecutionInstruction executionContext();

	//Determines if this instruction is executable by checking its status
	boolean isExecutable();

	void executed();

	boolean wasExecuted();

	Future execute();

	String toString();

	JsonObject toJson();

	boolean isLastInstruction();

	void setLastInstruction(boolean isLastInstruction);

	String getLastOutputInstanceId();

	void setLastOutputInstanceId(String lastOutputInstanceId);

}