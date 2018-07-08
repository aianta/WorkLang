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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.worklang.work.Instance;
import org.worklang.work.StateDefinition;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class InstanceResolution {
	
	private static final Logger logger = LoggerFactory.getLogger(InstanceResolution.class);
	
	private List<String> jsonObjectKeys;
	
	private StateDefinition arrayDefinition;
	private JsonObject jsonObject;
	private JsonArray jsonArray;
	private Instance resolution;
	
	/* For figuring out who I am given a single json object
	 * 
	 */
	public InstanceResolution (JsonObject json) {
		this.jsonObject = json;
		extractKeys();
	}
	
	/* For figuring out who I am given a json array of myself
	 * 
	 */
	public InstanceResolution (JsonArray json) {
		this.jsonArray = json;
		this.jsonObject = jsonArray.getJsonObject(0);
		extractKeys();
	}
	
	/* For figuring out who I am given a json array of elements 
	 * 
	 */
	public InstanceResolution (StateDefinition definition, JsonArray jsonArray) {
		this.jsonArray = jsonArray;
		this.arrayDefinition = definition;
	}
	
	/* Try to resolve me using a given definition
	 * 
	 */
	public Instance resolveAs(StateDefinition target) {
		
		return null;
	}
	
	/* Try to resolve me using a given target state composition
	 * 
	 */
	public Instance resolveAs(StateComposition target) {
		
		List<CombinationMatcher> possibilityMatchers = target.getPossibilityMatchers(); 
		
		jsonObjectKeys.forEach(key->{
			tryMatch(possibilityMatchers, key);
		});
		
		SortedMap<Integer,CombinationMatcher> validPossibilities = getMatches(possibilityMatchers);
		
		if (validPossibilities.size() > 0) {
			
			CombinationMatcher bestMatch = validPossibilities.get(validPossibilities.firstKey());
			
			/*Create a recursive assemble method that creates the instance
			 *  with all required child instances.
			 *  
			 *  ExtractKeys will have to return the keys rather than void 
			 *  so we can reuse it to assemble children (where the value 
			 *  for a json key is a JsonObject). 
			 */
			
			
		}else {
			logger.info("No possible way to resolve json as {}", target.getName());
			return null;
		}
		

	}
	
	
	/* Try to resolve me from the array and array definition you gave me
	 * 
	 */
	public Instance resolveFromArray() {
		return null;
	}
	
	/* Extract all keys from this json object and any
	 * nested json object.
	 */
	private void extractKeys() {
		
		this.jsonObjectKeys = new ArrayList<>();
		
		jsonObject.forEach(entry->{
			jsonObjectKeys.add(entry.getKey());
			
			if (entry.getValue() instanceof JsonObject) {
				
				((JsonObject)entry.getValue()).fieldNames().forEach(key->{
					jsonObjectKeys.add(key);
				});
			}
			
		});
	}
	
	private void tryMatch(List<CombinationMatcher> matchers, String key) {
		matchers.forEach(matcher->{
			matcher.tryMatch(key);
		});
	}
	
	private SortedMap<Integer, CombinationMatcher> getMatches(List<CombinationMatcher> matchers) {
		List<CombinationMatcher> matches = new ArrayList<>();
		
		matchers.forEach(matcher->{
			if(matcher.isMatch()) {
				matches.add(matcher);
			}
		});
		
		return rankMatches(matches);
	}
	
	private SortedMap<Integer, CombinationMatcher> rankMatches (List<CombinationMatcher> matchers) {
		
		TreeMap<Integer, CombinationMatcher> options = new TreeMap<>();
		
		matchers.forEach(matcher->{
			options.put(matcher.getMatchCount(), matcher);
		});
		
		return options.descendingMap();
	}
	
}
