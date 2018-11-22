package org.worklang.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.interpreter.WorkApi;
import org.worklang.work.Instance;
import org.worklang.work.Transition;

public class DefinitionSpaceAdapter extends EContentAdapter {
	
	private static final Logger log = LoggerFactory.getLogger(DefinitionSpaceAdapter.class);
	
	public void notifyChanged(Notification notification) {
		
		log.info("DefinitionSpace Changed!");
		
		//If an instance has been added
		if(!notification.isTouch()) {
			
			if (notification.getNewValue() instanceof Transition) {
				Transition t = (Transition)notification.getNewValue();
				
				//Update graph model
				WorkApi.generateTransitionModel(t);
				
			}
			
		}
		
	}

}
