package org.worklang.structures;

public class Problem {

	public static int CURRENT_TIME = 0;
	public static int START_TIME = 0;
	public static int END_TIME = 45;
	
	private TimeTree timeRoot = new TimeTree();
	private STree sRoot = new STree();
	private DTree dRoot = new DTree();
	
	public Problem() {
		/* Intertwine time, s-tree, and d-tree to
		 * create a new component.
		 */
		timeRoot.setdRef(dRoot);
		timeRoot.setsRef(sRoot);
		
		sRoot.setTimeRef(timeRoot);
		sRoot.setdRef(dRoot);
		sRoot.setValue(this);
		
		dRoot.setTimeRef(timeRoot);
		dRoot.setsRef(sRoot);
		dRoot.setValue(this);
	}
	
	public int currentEnergy() {
		return END_TIME - CURRENT_TIME;
	}
}
