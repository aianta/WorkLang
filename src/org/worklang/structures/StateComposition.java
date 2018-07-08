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

import java.util.ArrayList;
import java.util.List;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.metamodel.MetaModelUtils;
import org.worklang.work.StateDefinition;

public class StateComposition {
	
	private static final Logger logger = LoggerFactory.getLogger(StateComposition.class);

	protected String fieldName;
	private StateDefinition definition;
	private String stateName;
	private Vertex definitionVertex;
	protected List<Composition> compositions =  new ArrayList<>();
	protected List<Combination> combinations;
	protected List<Combination> possibilities;
	private boolean isImplicit = false;
	
	
	public StateComposition(String fieldName, StateDefinition definition) {
		this.definition = definition;
		this.fieldName = fieldName;
		this.stateName = definition.getName();
		this.definitionVertex = MetaModelUtils.getStateVertex(fieldName, stateName);
	}
	
	public StateComposition() {
		isImplicit = true;
	}
	
	public List<Combination> getPossibilities() {
		if (possibilities != null) {
			return possibilities;
		}else {
			calculatePossibilities();
			return possibilities;
		}
	}
	
	public String getName() {
		return stateName;
	}
	
	public void calculatePossibilities() {
		possibilities = new ArrayList<>();
		/* To calculate possibilities we need to calculate combinations 
		 * for all compositions.
		 */
		compositions.forEach(composition->{
			List<Combination> combinations = composition.getCombinations();
			combinations.forEach(combination->{
				possibilities.add(combination);
			});
		});
	}
	
	public List<Combination> getCombinations() {
		if (combinations != null) {
			return combinations;
		}else {
			calculateCombinations();
			return combinations;
		}
	}
	
	public void calculateCombinations() {
		combinations = new ArrayList<>();
		
		compositions.forEach(composition->{
			
			//Get my compositionElements and create a new combination from them
			List<CompositionElement> elements = composition.getCompositionElements();
			Combination c =  new Combination();
			
			elements.forEach(element->{
				c.addElement(element);
			});
			
			combinations.add(c);
		});
	}
	
	public List<CombinationMatcher> getPossibilityMatchers() {
		
		List<CombinationMatcher> matchers =  new ArrayList<>();
		List<Combination> pos = getPossibilities();
		
		pos.forEach(possibility->{
			matchers.add(possibility.getMatcher());
		});
		
		return matchers;
	}
	
	public void explorePossibilities () {
		
		Vertex withVertex = definitionVertex.vertices(Direction.OUT, "composedWith").next();
		
		Vertex rootPredicate = withVertex.vertices(Direction.OUT, "has").next();
		
		Composition composition = new Composition(this);
		compositions.add(composition);
		
		explorePredicate(rootPredicate, composition);
	}
	
	public void explorePredicate(Vertex predicate, Composition composition) {
		
		/* Cases:
		 * 	State
		 * 	Operation 
		 */
		
		Vertex predicateChild = predicate.vertices(Direction.OUT, "has").next();
		
		//Handle Operations
		if (predicateChild.property("worklangKey").value().toString().equals("org.worklang.work.Operation")) {
			exploreOperation(predicateChild, composition);
		}
		
		//Handle States
		if (predicateChild.property("worklangKey").value().toString().equals("org.worklang.work.StateDefinition")) {
			
			String elementName = predicateChild.property("name").value().toString();
			
			StateDefinition elementDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, elementName);
			
			CompositionElement element = new CompositionElement(elementDefinition, elementName, fieldName);
			
			composition.addElement(element);
			
			//Create an explicit state composition for this state
			Vertex elementVertex = MetaModelUtils.getStateVertex(fieldName, elementName);
		
			if (elementDefinition.getType().equals("primitive")) {
				PrimitiveExplicitStateComposition explicitPrimitive = new PrimitiveExplicitStateComposition(elementDefinition, elementName, elementVertex );
				composition.addElement(explicitPrimitive);
			}
			
			if (elementDefinition.getType().equals("compound")) {
				CompoundExplicitStateComposition explicitCompound = new CompoundExplicitStateComposition(elementDefinition, elementName, elementVertex);
				composition.addElement(explicitCompound);
			}
		}
	}
	
	public void exploreOperation(Vertex operation, Composition composition) {
		
		Vertex leftOperatorVertex = operation.vertices(Direction.OUT, "leftOperator").next();
		Vertex rightOperatorVertex = operation.vertices(Direction.OUT, "rightOperator").next();
		
		/* Cases for leftOperator and rightOperator:
		 * 	State
		 * 	Operation
		 * 	Predicate	
		 */
		
		//Handle AND operation
		if (operation.property("name").value().toString().equals("AND")) {
			exploreAndOperator(leftOperatorVertex, composition);
			exploreAndOperator(rightOperatorVertex, composition);
		}
		
		//Handle OR operation
		if (operation.property("name").value().toString().equals("OR")) {
			
		}
		
	}
	
	public void exploreAndOperator(Vertex operator, Composition composition) {
		//Handle AND operator state
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.StateDefinition")) {
			
			String elementName = operator.property("name").value().toString();
			StateDefinition elementDefinition = WorklangResourceUtils.resolveStateDefinition(elementName, elementName);
			CompositionElement element = new CompositionElement(elementDefinition, elementName, fieldName);
			composition.addElement(element);
			
			Vertex elementVertex = MetaModelUtils.getStateVertex(fieldName, elementName);
			
			if (elementDefinition.getType().equals("primitive")) {
				PrimitiveExplicitStateComposition explicitPrimitive =  new PrimitiveExplicitStateComposition(elementDefinition, elementName, elementVertex);
				composition.addElement(explicitPrimitive);
			}
			
			if (elementDefinition.getType().equals("compound")) {
				CompoundExplicitStateComposition explicitCompound = new CompoundExplicitStateComposition(elementDefinition, elementName, elementVertex);
				composition.addElement(explicitCompound);
			}
		}
		
		//Handle AND operator operation
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Operation")) {
			
			/* If the operation is an AND operation, then call 
			 * ourselves again with the same composition. 
			 */
			if (operator.property("name").value().toString().equals("AND")){
				exploreOperation(operator, composition);
			}
			
			/* If the operation is an OR operation, then call ourselves
			 * again with a new composition.
			 */
			if (operator.property("name").value().toString().equals("OR")) {
				Composition newComposition = new Composition(this);
				exploreOperation(operator, newComposition);
			}
			
		}
		
		/* Handle AND operator predicate
		 *  A new predicate is basically defining a new state composition, so we
		 *  create an implicit state composition and instruct it to explore its own
		 *  possibilities.
		 */
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Predicate")) {
			Composition newComposition = new Composition(this);
			ImplicitStateComposition implicitState = new ImplicitStateComposition(newComposition);
			implicitState.explorePossibilities();
		}
	}
	
	public void exploreOrOperator(Vertex operator, Composition composition) {
		/* Handle OR operator state
		 * When an OR operator is a state we need to create a new composition in this
		 * state composition and add the state to that composition
		 */
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.StateDefinition")) {
			Composition newComposition = new Composition(this);
			compositions.add(newComposition);
			
			String elementName = operator.property("name").value().toString();
			StateDefinition elementDefinition = WorklangResourceUtils.resolveStateDefinition(elementName, elementName);
			CompositionElement element = new CompositionElement(elementDefinition, elementName, fieldName);
			newComposition.addElement(element);	
			
			Vertex elementVertex = MetaModelUtils.getStateVertex(fieldName, elementName);
			
			if (elementDefinition.getType().equals("primitive")) {
				PrimitiveExplicitStateComposition explicitPrimitive =  new PrimitiveExplicitStateComposition(elementDefinition, elementName, elementVertex);
				newComposition.addElement(explicitPrimitive);
			}
			
			if (elementDefinition.getType().equals("compound")) {
				CompoundExplicitStateComposition explicitCompound =  new CompoundExplicitStateComposition(elementDefinition, elementName, elementVertex);
				newComposition.addElement(explicitCompound);
			}
		}
		
		//Handle OR operator operation
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Operation")) {
			
			/* If the operation is an AND operation, then call 
			 * ourselves again with the same composition. 
			 */
			if (operator.property("name").value().toString().equals("AND")){
				exploreOperation(operator, composition);
			}
			
			/* If the operation is an OR operation, then call ourselves
			 * again with a new composition.
			 */
			if (operator.property("name").value().toString().equals("OR")) {
				Composition newComposition = new Composition(this);
				exploreOperation(operator, newComposition);
			}
			
		}
		
		/* Handle OR operator predicate
 		 *	A new predicate is basically defining a new state composition, so we
		 *  create an implicit state composition and instruct it to explore its own
		 *  possibilities.
		 */
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Predicate")) {
			Composition newComposition = new Composition(this);
			ImplicitStateComposition implicitState = new ImplicitStateComposition(newComposition);
			implicitState.explorePossibilities();
		}
	}
}
