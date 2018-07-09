///* 
// * 	Copyright 2018 Alexandru Ianta
// *
// *	Licensed under the Apache License, Version 2.0 (the "License");
// *	you may not use this file except in compliance with the License.
// *	You may obtain a copy of the License at
// *
// *   http://www.apache.org/licenses/LICENSE-2.0
// *
// * 	Unless required by applicable law or agreed to in writing, software
// *	distributed under the License is distributed on an "AS IS" BASIS,
// *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// *	See the License for the specific language governing permissions and
// *	limitations under the License.
// * 
// */
//
//package org.worklang.structures;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Set;
//import java.util.SortedMap;
//import java.util.TreeMap;
//import java.util.UUID;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.worklang.work.CollectionInstance;
//import org.worklang.work.CompoundStateDefinition;
//import org.worklang.work.Instance;
//import org.worklang.work.PrimitiveStateDefinition;
//import org.worklang.work.SetStatement;
//import org.worklang.work.StateDeclaration;
//import org.worklang.work.StateDefinition;
//import org.worklang.work.StateInstance;
//import org.worklang.work.ToDefinition;
//import org.worklang.work.UseDefinition;
//import org.worklang.work.WorkFactory;
//
//import io.vertx.core.json.JsonArray;
//import io.vertx.core.json.JsonObject;
//
///* TODO - Idea, Instance resolution for transitions, determine what kind of transitions
// * they are automatically based on sample inputs and outputs. Automatically integrate
// * into worknet in the right place. 
// * 
// * In general the concept seems to be do your thing, whether that's thinking/defining 
// * or doing/creating and let the worknet worry about making sure it gets to the right 
// * people and is presented in the right way.
// * 
// */
//
//public class InstanceResolution {
//	
//	private static final Logger logger = LoggerFactory.getLogger(InstanceResolution.class);
//	private static final WorkFactory factory = WorkFactory.eINSTANCE;
//	
//	private List<InstanceResolution> children = new ArrayList<>();
//	private StateComposition comp;
//	
//
//	public InstanceResolution(StateComposition comp) {
//		this.comp = comp;
//	}
//	
//	public Instance tryWith(JsonObject object) {
//		if (comp.isCollection()) {
//			logger.error("Object cannot be {} because {} is a collection.", comp.getName(), comp.getName());
//			return null;
//		}
//		
//		if (comp.getDefinition().getType().equals("primitive")) {
//			
//			try {
//				String value = object.getString(comp.getName());
//				
//				if (value == null) {
//					logger.error("Object cannot be {} because {} is a primitive "
//							+ "and the value could not be found.", comp.getName(), comp.getName());
//					return null;
//				}
//				
//				Instance i = factory.createInstance();
//				
//				
//			}catch(ClassCastException e) {
//				logger.error("Object cannot be {} because {} is a primitive and the "
//						+ "value could not be cast to a string.", comp.getName(), comp.getName());
//				return null;
//			}
//		}
//		
//		if (comp.getDefinition().getType().equals("compound")) {
//			
//			Combination expectedElements = findMyBestMatch(object);
//			
//			if (expectedElements == null) {
//				return null;
//			}
//			
//			
//		}
//		
//	}
//	
//	
//	public Combination findMyBestMatch(JsonObject object) {
//		List<CombinationMatcher> possibilityMatchers = comp.getPossibilityMatchers(); 
//		
//		logger.info("POSSIBILITIES FOR {}", comp.getName());
//		StructuresUtil.printCombinationList(comp.possibilities());
//		
//		
//		object.fieldNames().forEach(key->{
//			tryMatch(possibilityMatchers, key);
//		});
//		
//		SortedMap<Integer,CombinationMatcher> validPossibilities = getMatches(possibilityMatchers);
//		
//		if (validPossibilities.size() > 0) {
//			
//			CombinationMatcher bestMatch = validPossibilities.get(validPossibilities.firstKey());
//			Combination targetCombination = bestMatch.getParent();
//			
//			return targetCombination;
//		}else {
//			logger.error("No possible way to resolve as {}", comp.getName());
//			return null;
//		}
//	}
//	
//
//	
//
//	
//	
//	private Instance assembleStateInstance () {
//		Instance i = factory.createInstance();
//		
//		StateInstance stateInstance = factory.createStateInstance();
//		
//		i.setName(UUID.randomUUID().toString());
//		i.setState(stateInstance);
//		
//	}
//	
//	private void assembleCollectionElementInstance (Instance parentCollection, Instance assemblyTarget, boolean isCollection ) {
//		
//		
//		if (isCollection) {
//			CollectionInstance collectionInstance = factory.createCollectionInstance();
//			String collectionName = "#" + parentCollection.getName() + "#" + parentCollection.getCollection().getElements().size() + "#";
//			assemblyTarget.setName(collectionName);
//			assemblyTarget.setCollection(collectionInstance);
//			assemblyTarget.setIsCollectionElement(true);
//			
//			parentCollection.getCollection().getElements().add(assemblyTarget);
//		}
//		
//		if (!isCollection) {
//			StateInstance stateInstance = factory.createStateInstance();
//			String instanceName = "#"+parentCollection.getName() + "#" + parentCollection.getCollection().getElements().size() + "#";
//			assemblyTarget.setName(instanceName);
//			assemblyTarget.setState(stateInstance);
//			assemblyTarget.setIsCollectionElement(true);
//		}
//		
//		
//		
//	}
//	
//	private void assembleCollectionInstance (StateDefinition definition, Instance assemblyTarget, JsonArray values) {
//		
//		CollectionInstance collectionInstance = factory.createCollectionInstance();
//		String collectionName = UUID.randomUUID().toString();
//		assemblyTarget.setName(collectionName);
//		assemblyTarget.setCollection(collectionInstance);
//		assemblyTarget.setIsCollectionElement(false);
//		
//		
//		
//	}
//	
//	private void assembleSetStatement (StateDefinition primitive, String value, Instance assemblyTarget) {
//		//Create Set Statement
//		SetStatement setStmt = factory.createSetStatement();
//		setStmt.setVariable(primitive);
//		
//		//Create To Definition
//		ToDefinition toDef = factory.createToDefinition();
//		toDef.setValue(value);
//		
//		//Link set with to
//		setStmt.setToDef(toDef);
//		
//		//Link assembly target with set
//		assemblyTarget.getState().getMembers().add(setStmt);
//		
//	}
//	
//	private void assembleUseStatement (Instance value, Instance assemblyTarget) {
//		//Create Use Definition
//		UseDefinition useStmt = factory.createUseDefinition();
//		useStmt.setPredefinedValue(value);
//		
//		//Link to assembly target
//		assemblyTarget.getState().getMembers().add(useStmt);
//	}
//	
//	
//	/* Try to resolve me from the array and array definition you gave me
//	 * 
//	 */
//	public Instance resolveFromArray() {
//		return null;
//	}
//	
//	/* Extract all keys from this json object and any
//	 * nested json object.
//	 */
//	private void extractMyOwnKeys() {
//		
//		object.fieldNames().forEach(key->{
//			jsonObjectKeys.add(key);
//		});
//	
//	}
//	
//	private void tryMatch(List<CombinationMatcher> matchers, String key) {
//		matchers.forEach(matcher->{
//			matcher.tryMatch(key);
//		});
//	}
//	
//	private SortedMap<Integer, CombinationMatcher> getMatches(List<CombinationMatcher> matchers) {
//		List<CombinationMatcher> matches = new ArrayList<>();
//		
//		matchers.forEach(matcher->{
//			if(matcher.isMatch()) {
//				matches.add(matcher);
//			}
//		});
//		
//		return rankMatches(matches);
//	}
//	
//	private SortedMap<Integer, CombinationMatcher> rankMatches (List<CombinationMatcher> matchers) {
//		
//		TreeMap<Integer, CombinationMatcher> options = new TreeMap<>();
//		
//		matchers.forEach(matcher->{
//			options.put(matcher.getMatchCount(), matcher);
//		});
//		
//		return options.descendingMap();
//	}
//
//	public Instance getResolution() {
//		return resolution;
//	}
//	
//}
