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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/* NOTE, combinations are used to describe all possible variations of 
 * combinations as well as specific ones for a state, in a single flat map,
 * so there will be duplicates. 
 * 
 * Combinations retrieved by the possibility methods, may cause trouble if they're used 
 * for direct assembly of object. 
 * 
 * Let's find out.
 * 
 */

public class Combination {
	
	private static final Logger logger = LoggerFactory.getLogger(Combination.class);
	protected List<CompositionElement> combination = new ArrayList<>();

	
	public void addElement(CompositionElement element) {
		combination.add(element);
	}
	
	public List<CompositionElement> get() {
		return combination;
	}
	
	public CombinationMatcher getMatcher() {
		return new CombinationMatcher(this);
	}
	
}
