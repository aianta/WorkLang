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
import java.util.Iterator;
import java.util.List;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.WorklangResourceUtils;
import org.worklang.metamodel.MetaModelUtils;
import org.worklang.work.StateDefinition;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class StateComposition {
	
	private static final Logger logger = LoggerFactory.getLogger(StateComposition.class);

	private String fieldName;
	private StateDefinition definition;
	private String stateName;
	private Vertex definitionVertex;
	private boolean isCollection;

	private List<Combination> combinations;
	
	public StateComposition(CompositionElement e) {
		this.definition = e.getElementDefinition();
		this.fieldName = e.getFieldName();
		this.definitionVertex = e.getElementVertex();
		this.stateName = e.getElementName();
		isCollection = definition.isList();
	}
	
	public StateComposition(String fieldName, StateDefinition definition) {
		this.definition = definition;
		this.fieldName = fieldName;
		this.stateName = definition.getName();
		this.definitionVertex = MetaModelUtils.getStateVertex(fieldName, stateName);
		isCollection = definition.isList();
	}

	
	public String getName() {
		return stateName;
	}
	
	public StateDefinition getDefinition() {
		return definition;
	}
	

	public List<CombinationMatcher> getPossibilityMatchers() {
		
		List<CombinationMatcher> matchers =  new ArrayList<>();
		List<Combination> pos = possibilities();
		
		pos.forEach(possibility->{
			matchers.add(possibility.getMatcher());
		});
		
		return matchers;
	}
	
	public List<Combination> possibilities() {
		
		Vertex withVertex = definitionVertex.vertices(Direction.OUT, "composedWith").next();
		
		Vertex rootPredicate = withVertex.vertices(Direction.OUT, "has").next();
		
		
		return explorePredicate(rootPredicate);
	}
	
	public List<Combination> explorePredicate(Vertex predicate) {
		
		/* Cases:
		 * 	State
		 * 	Operation 
		 */
		
		Vertex predicateChild = predicate.vertices(Direction.OUT, "has").next();
		
		//Handle Operations
		if (predicateChild.property("worklangKey").value().toString().equals("org.worklang.work.Operation")) {
			return exploreOperation(predicateChild);
		}
		
		//Handle States
		if (predicateChild.property("worklangKey").value().toString().equals("org.worklang.work.StateDefinition")) {
			
			Vertex composedDefinitionVertex = predicateChild.vertices(Direction.OUT, "is").next();
			
			String elementName = composedDefinitionVertex.property("name").value().toString();
			StateDefinition elementDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, elementName);
			Vertex elementVertex = MetaModelUtils.getStateVertex(fieldName, elementName);
			
			
			CompositionElement element = new CompositionElement(elementDefinition, elementName, fieldName, elementVertex);
			
			Combination c = new Combination();
			c.addElement(element);
			
			List<Combination> listC = new ArrayList<>();
			listC.add(c);
			return listC;
		}
		
		logger.error("explore predicate returned null");
		return null;
	}
	
	public List<Combination> exploreOperation(Vertex operation) {
		
		Vertex leftOperatorVertex = operation.vertices(Direction.OUT, "leftOperator").next();
		Vertex rightOperatorVertex = operation.vertices(Direction.OUT, "rightOperator").next();
		
		/* Cases for leftOperator and rightOperator:
		 * 	State
		 * 	Operation
		 * 	Predicate	
		 */
		
		//Handle AND operation
		if (operation.property("name").value().toString().equals("AND")) {
			List<Combination> a = exploreAndOperator(leftOperatorVertex);
			List<Combination> b = exploreAndOperator(rightOperatorVertex);
			
			Combination c =  new Combination();
			
			a.forEach(combination ->{
				combination.combination.forEach(element->{
					c.addElement(element);
				});
			});
			
			b.forEach(combination->{
				combination.combination.forEach(element->{
					c.addElement(element);
				});
			});
			
			
			List<Combination> listC = new ArrayList<>();
			listC.add(c);
			return listC;
		}
		
		//Handle OR operation
		if (operation.property("name").value().toString().equals("OR")) {
			List<Combination> a = exploreOrOperator(leftOperatorVertex);
			List<Combination> b = exploreOrOperator(rightOperatorVertex);
			
			Combination c = new Combination();
			Combination d = new Combination();
			Combination e = new Combination();
			
			a.forEach(combination ->{
				combination.combination.forEach(element->{
					c.addElement(element);
					d.addElement(element);
				});
			});
			
			b.forEach(combination->{
				combination.combination.forEach(element->{
					c.addElement(element);
					e.addElement(element);
				});
			});
			
			List<Combination> listC = new ArrayList<>();
			listC.add(c);
			listC.add(d);
			listC.add(e);
			return listC;
		}
		
		logger.error("explore operation returned null");
		return null;
	}
	
	public List<Combination> exploreAndOperator(Vertex operator) {
		
	
		//Handle AND operator state
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.StateDefinition")) {
			
			Vertex composedDefinitionVertex = operator.vertices(Direction.OUT, "is").next();
			
			String elementName = composedDefinitionVertex.property("name").value().toString();
			logger.info("ExploreANDOperator: elementName -> {} fieldName->{}", elementName, fieldName);
			
			StateDefinition elementDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, elementName);
			Vertex elementVertex = MetaModelUtils.getStateVertex(fieldName, elementName);
			
			CompositionElement element = new CompositionElement(elementDefinition, elementName, fieldName, elementVertex);
			
			
			Combination a = new Combination();
			a.addElement(element);
			
			List<Combination> listC = new ArrayList<>();
			listC.add(a);
			return listC;
		}
		
		//Handle AND operator operation
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Operation")) {
			

			if (operator.property("name").value().toString().equals("AND")){
				return exploreOperation(operator);
			}
			

			if (operator.property("name").value().toString().equals("OR")) {
				return exploreOperation(operator);
			}
			
		}
		

		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Predicate")) {
			return explorePredicate(operator);
		}
		
		logger.error("explore and operator returned null");
		return null;
	}
	
	public List<Combination> exploreOrOperator(Vertex operator) {

		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.StateDefinition")) {

			
			Vertex composedDefinitionVertex = operator.vertices(Direction.OUT, "is").next();
			
			String elementName = composedDefinitionVertex.property("name").value().toString();
			StateDefinition elementDefinition = WorklangResourceUtils.resolveStateDefinition(fieldName, elementName);
			Vertex elementVertex = MetaModelUtils.getStateVertex(fieldName, elementName);
			
			CompositionElement element = new CompositionElement(elementDefinition, elementName, fieldName, elementVertex);

			Combination c = new Combination();
			c.addElement(element);

			List<Combination> listC = new ArrayList<>();
			listC.add(c);
			return listC;
		}
		
		//Handle OR operator operation
		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Operation")) {
			

			if (operator.property("name").value().toString().equals("AND")){
				return exploreOperation(operator);
			}
			

			if (operator.property("name").value().toString().equals("OR")) {
				return exploreOperation(operator);
			}
			
		}
		

		if (operator.property("worklangKey").value().toString().equals("org.worklang.work.Predicate")) {
			return explorePredicate(operator);
		}
		
		logger.error("explore or operator returned null");
		return null;
	}

	public boolean isCollection() {
		return isCollection;
	}	

}
