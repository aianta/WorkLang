package org.worklang.structures;

public class Component {

	private TimeTree timeRoot = new TimeTree();
	private STree sRoot = new STree();
	private DTree dRoot = new DTree();
	
	public Component() {
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
}
