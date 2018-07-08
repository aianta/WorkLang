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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombinationMatcher{
	
	private static final Logger logger = LoggerFactory.getLogger(CombinationMatcher.class);
	
	private Combination parent;
	private List<CompositionElement> combination;
	private List<CompositionElement> unmatched = new ArrayList<>();
	private List<CompositionElement> matched = new ArrayList<>();
	private int matchCount = 0;
	
	public CombinationMatcher (Combination combination) {
		this.parent = combination;
		this.combination = combination.get();
		this.combination.forEach(element->{
			unmatched.add(element);
		});
	}
	
	public boolean tryMatch(String elementName) {
		Iterator<CompositionElement> it = unmatched.iterator();
		
		while (it.hasNext()) {
			CompositionElement curr = it.next();
			if (curr.getElementName().equals(elementName)) {
				matchCount++;
				matched.add(curr);
				it.remove();
				return true;
			}
		}
		
		return false;
	}

	public boolean isMatch() {
		if(matchCount == combination.size()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getMatchCount() {
		return matchCount;
	}

	public Combination getParent() {
		return parent;
	}

}
