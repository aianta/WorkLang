package org.worklang.execution;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;

public class StateInfo {
	
	private static final Logger logger = LoggerFactory.getLogger(StateInfo.class);
	
	private StateDefinition definition = null;
	private UUID id = null;
	private Instance instance = null;
	
	public StateDefinition getDefinition() {
		return definition;
	}
	public void setDefinition(StateDefinition definition) {
		this.definition = definition;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Instance getInstance() {
		return instance;
	}
	public void setInstance(Instance instance) {
		//Verify that instance is a state
		if (instance.getStateDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a state", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a state."
			);
		}
		
		this.instance = instance;
	}

}
