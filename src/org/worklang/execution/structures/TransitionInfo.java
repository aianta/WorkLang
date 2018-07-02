package org.worklang.execution.structures;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.Instance;
import org.worklang.work.TransitionDefinition;

public class TransitionInfo {
	
	private static final Logger logger = LoggerFactory.getLogger(TransitionInfo.class);
	
	private TransitionDefinition definition = null;
	private UUID id = null;
	private Instance instance = null;
			
	public TransitionDefinition getDefinition() {
		return definition;
	}
	public void setDefinition(TransitionDefinition definition) {
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
		//Verify that instance is a transition
		if (instance.getTransitionDeclaration() == null) {
			logger.error("Cannot create execution instruction input from instance: {} Instance is not a transition.", instance.getName());
			throw new IllegalArgumentException("Cannot create execution instruction input from instance: " + 
					instance.getName() + ". "+
					"Instance is not a transition."
			);
		}
		
		this.instance = instance;
	}
}
