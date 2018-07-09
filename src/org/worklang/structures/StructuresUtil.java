package org.worklang.structures;

import java.util.Iterator;
import java.util.List;

public class StructuresUtil {
	
	public static void printCombinationList(List<Combination> possibilities) {
		possibilities.forEach(possibility->{
			printCombination(possibility);
		});
	}
	
	public static void printCombination(Combination possibility) {
		String result = new String();
		
		Iterator<CompositionElement> it = possibility.get().iterator();
		
		while (it.hasNext()) {
			CompositionElement curr = it.next();
			
			result += curr.getElementName() + " ";
		}
		
		System.out.println(result);
	}
	

}
