package org.worklang.structures;

public class DTree {

	private TimeTree timeRef = null;
	
	private STree sRef = null;
	private Object value = null;
	private DTree parent = null;
	private DTree child = null;
	
	public DTree create (DTree d, MetaObjectType meta, Object value) {
		
		if (meta == MetaObjectType.DEFINITION) {
			DTree child = new DTree();
			
			TimeTree childTimeRef = timeRef.createByDTree(child);
			STree childSRef = sRef.createByDTree(child, meta);
			
			child.setTimeRef(childTimeRef);
			child.setsRef(childSRef);
			child.setValue(value);
			
			this.child = child;
			
			return child;
		}else {
			//MetaObjectType is VALUE
			DTree parent = new DTree();
			
			TimeTree parentTimeRef = timeRef.createByDTree(parent);
			STree parentSRef = sRef.createByDTree(parent, meta);
			
			parent.setTimeRef(parentTimeRef);
			parent.setsRef(parentSRef);
			parent.setValue(value);
			
			this.parent = parent;
			
			return parent;
		}
		
	}
	
	public DTree createByTime(TimeTree t) {
		
		DTree child =  new DTree();
		child.setTimeRef(t);
		
		this.child = child;
		
		return child;
	}
	
	public DTree createBySTree(STree s, MetaObjectType meta) {
		
		if (meta == MetaObjectType.DEFINITION) {
			DTree child = new DTree();
			child.setsRef(s);
			
			this.child = child;
			
			return child;
		
		}else{
			DTree parent = new DTree();
			parent.setsRef(sRef);
			
			this.parent = parent;
			
			return parent;
		}
	}
	
	public STree getsRef() {
		return sRef;
	}
	public void setsRef(STree sRef) {
		this.sRef = sRef;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public DTree getParent() {
		return parent;
	}
	public void setParent(DTree parent) {
		this.parent = parent;
	}
	public DTree getChild() {
		return child;
	}
	public void setChild(DTree child) {
		this.child = child;
	}
	public TimeTree getTimeRef() {
		return timeRef;
	}
	public void setTimeRef(TimeTree timeRef) {
		this.timeRef = timeRef;
	}
}
