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
import org.worklang.work.StateDefinition;

public class CompoundExplicitStateComposition extends ExplicitStateComposition{
	
	public CompoundExplicitStateComposition(StateDefinition explicitStateDefinition, String explicitStateName,
			Vertex explicitStateDefinitionVertex) {
		super(explicitStateDefinition, explicitStateName, explicitStateDefinitionVertex);
	}

	public void explorePossibilities () {
		
		Vertex withVertex = explicitStateDefinitionVertex.vertices(Direction.OUT, "composedWith").next();
		
		Vertex rootPredicate = withVertex.vertices(Direction.OUT, "has").next();
		
		Composition composition = new Composition(this);
		compositions.add(composition);
		
		explorePredicate(rootPredicate, composition);
	}

}
