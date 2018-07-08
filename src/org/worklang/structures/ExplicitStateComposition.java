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

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.StateDefinition;

public class ExplicitStateComposition extends StateComposition{

	private static final Logger logger = LoggerFactory.getLogger(ExplicitStateComposition.class);
	
	protected StateDefinition explicitStateDefinition;
	protected String explicitStateName;
	protected Vertex explicitStateDefinitionVertex;
	
	public ExplicitStateComposition (StateDefinition explicitStateDefinition, String explicitStateName, Vertex explicitStateDefinitionVertex) {
		this.explicitStateDefinition = explicitStateDefinition;
		this.explicitStateName = explicitStateName;
		this.explicitStateDefinitionVertex = explicitStateDefinitionVertex;
	}
	
}
