package org.worklang.structures;

public class STree {

	private TimeTree timeRef = null;
	private Object value = null;
	private DTree dRef = null;
	private STree parent = null;
	private STree child = null;
	
	public STree create(STree s, MetaObjectType meta, Object value) {
		
		if (meta == MetaObjectType.DEFINITION) {
			STree parent = new STree();
			
			TimeTree parentTimeRef = timeRef.createBySTree(parent);
			DTree parentDRef = dRef.createBySTree(parent, meta);
			
			parent.setTimeRef(parentTimeRef);
			parent.setdRef(parentDRef);
			parent.setValue(value);
			
			this.parent = parent;
			
			return parent;
		}else {
			//MetObjectType is VALUE
			STree child = new STree();
			
			TimeTree childTimeRef = timeRef.createBySTree(child);
			DTree childDRef = dRef.createBySTree(child, meta);
			
			child.setTimeRef(childTimeRef);
			child.setdRef(childDRef);
			child.value = value;
			
			this.child = child;
			
			return child;
		}
		
	}
	
	public STree createByTime(TimeTree t) {
		
		STree child =  new STree();
		child.setTimeRef(t);
		
		this.child = child;
		
		return child;
	}
	
	public STree createByDTree(DTree d, MetaObjectType meta) {
		
		if (meta == MetaObjectType.DEFINITION) {
			STree parent =  new STree();
			parent.setdRef(d);
			
			this.parent = parent;
			
			return parent;
		}else {
			STree child = new STree();
			child.setdRef(d);
			
			this.child = child;
			
			return child;
		}
	}
	
	public TimeTree getTimeRef() {
		return timeRef;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public DTree getdRef() {
		return dRef;
	}
	public void setdRef(DTree dRef) {
		this.dRef = dRef;
	}
	public STree getParent() {
		return parent;
	}
	public void setParent(STree parent) {
		this.parent = parent;
	}
	public STree getChild() {
		return child;
	}
	public void setChild(STree child) {
		this.child = child;
	}
	public void setTimeRef(TimeTree timeRef) {
		this.timeRef = timeRef;
	}
}
