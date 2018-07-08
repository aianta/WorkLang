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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Composition {
	
	private static final Logger logger = LoggerFactory.getLogger(Composition.class);
	
	private StateComposition parent;
	private List<CompositionElement> compositionElements = new ArrayList<>();
	private List<ImplicitStateComposition> implicitElements = new ArrayList<>();
	private List<ExplicitStateComposition> explicitElements =  new ArrayList<>();
	private List<Combination> combinations;

	public Composition(StateComposition parent) {
		this.parent = parent;
	}
	
	public void addElement(ImplicitStateComposition element) {
		implicitElements.add(element);
	}
	
	public void addElement(ExplicitStateComposition element) {
		explicitElements.add(element);
	}
	
	public void addElement(CompositionElement element) {
		compositionElements.add(element);
	}
	
	public List<Combination> getCombinations(){
		if (combinations != null) {
			return combinations;
		}else {
			calculateCombinations();
			return combinations;
		}
	}
	/* To calculate all combinations, we calculate the matrix
	 * multiplication for each implicit states's combinations and 
	 * our parent's combinations.
	 * 
	 * Then we matrix multiply the resulting possibilities with
	 * all of our explicit states possibilities, for each explicit
	 * state.
	 */
	
	public void calculateCombinations() {
		
		combinations = new ArrayList<>();
		
		List<Combination>partialCombinations = new ArrayList<>();
		
		List<Combination> parentCombinations = parent.getCombinations();
		
		
		implicitElements.forEach(implicitElement->{
			Combination resultingCombination =  new Combination();
			
			//For every implicit element there will be a list of combinations
			List<Combination> implicitElementCombinations = implicitElement.getCombinations();
			
			/* Now matrix multiply the the implicit element's 
			 * combinations to calculate the parentCombinations to produce
			 * this compositions combinations.
			 */
			implicitElementCombinations.forEach(implicitCombination->{
				
				implicitCombination.get().forEach(implicitCombinationElement->{
					resultingCombination.addElement(implicitCombinationElement);
				});
				
				parentCombinations.forEach(parentCombination->{
					parentCombination.get().forEach(parentCombinationElement->{
						resultingCombination.addElement(parentCombinationElement);
					});
				});
				
			});
			
			partialCombinations.add(resultingCombination);
		});
		
		/* Now matrix multiply the resulting combinations
		 * with all the possibilities from each explicitElement we know of
		 */
		explicitElements.forEach(explicitElementComposition->{
			Combination finalResultingCombination = new Combination();
			List<Combination> explicitElementCombinations = explicitElementComposition.getCombinations();
			
			explicitElementCombinations.forEach(explicitCombination->{
				
				explicitCombination.get().forEach(expilcitCombinationElement->{
					finalResultingCombination.addElement(expilcitCombinationElement);
				});
				
				partialCombinations.forEach(combination->{
					combination.get().forEach(partialCombinationElement->{
						finalResultingCombination.addElement(partialCombinationElement);
					});
				});
				
			});
		}); 
		
	}
	
	
	
	public List<CompositionElement> getCompositionElements() {
		return compositionElements;
	}
}
