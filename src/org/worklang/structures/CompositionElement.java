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

package org.worklang.structures;

import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.StateDefinition;

import io.vertx.core.json.JsonObject;

public class CompositionElement {
	
	private static final Logger logger = LoggerFactory.getLogger(CompositionElement.class);
	
	private String fieldName;
	private String elementName;
	private StateDefinition elementDefinition;
	private boolean isCollection;
	private Vertex elementVertex;

	
	public CompositionElement (StateDefinition elementDefinition, String elementName, String fieldName, Vertex elementVertex) {
		this.elementDefinition = elementDefinition;
		this.elementName = elementName;
		this.fieldName = fieldName;
		this.elementVertex = elementVertex;
		if (elementDefinition.isList()) {
			this.isCollection = true;
		}
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public StateDefinition getElementDefinition() {
		return elementDefinition;
	}

	public void setElementDefinition(StateDefinition elementDefinition) {
		this.elementDefinition = elementDefinition;
	}

	public boolean isCollection() {
		return isCollection;
	}

	public void setCollection(boolean isCollection) {
		this.isCollection = isCollection;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Vertex getElementVertex() {
		return elementVertex;
	}
	
	


}
