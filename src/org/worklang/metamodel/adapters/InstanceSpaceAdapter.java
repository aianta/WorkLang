/* 
 * 	Copyright 2018 Alexandru Ianta
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 * 
 */

package org.worklang.metamodel.adapters;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.metamodel.FieldModelFactory;
import org.worklang.work.FieldDefinition;
import org.worklang.work.Instance;
import org.worklang.work.InstanceSpace;
import org.worklang.interpreter.WorkApi;

public class InstanceSpaceAdapter extends EContentAdapter {

	private static final Logger logger = LoggerFactory.getLogger(InstanceSpaceAdapter.class);
	
	Map<String, FieldModelFactory> modelFactories = new HashMap<>();
	
	public void notifyChanged(Notification notification) {
		
		logger.info("InstanceSpace changed!");
		
		//If an instance has been added
		if (!notification.isTouch()) {
			logger.info("Something has been added!");
			logger.info("Notifier newValue -> {}", notification.getNewValue());
			
			
			if (notification.getNewValue() instanceof Instance) {
				logger.info("That something is an instance!");
				Instance i = (Instance)notification.getNewValue();
				
				if (i.getStateDeclaration() != null) {
					logger.info("That instance is a state!");
					
					logger.info("Updating meta model");
					FieldDefinition field = (FieldDefinition)i.eContainer().eContainer();
					
					//Update meta model
					modelFactories.get(field.getName()).generateStateInstance(i);
					
					
					logger.info("Updating Read Api");
					//Update read api
					WorkApi.getReadApi().addStateInstance(field.getName(), i);
				}
				
				
			}
			
			
		}
		
	}
	
	public void addFieldModelFactory (FieldModelFactory factory) {
		modelFactories.put(factory.getFieldName(), factory);
	}
}
