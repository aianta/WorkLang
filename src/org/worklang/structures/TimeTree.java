package org.worklang.structures;

import java.time.Instant;
import java.util.Date;

public class TimeTree {
	
	private Instant timestamp =  Instant.now();
	private STree sRef = null;
	private DTree dRef = null;
	private TimeTree next = null;
	private TimeTree previous = null;
	
	
	public TimeTree create(TimeTree t) {
		
		TimeTree next = new TimeTree();
		
		STree nextSRef = sRef.createByTime(next); 
		DTree nextDRef = dRef.createByTime(next);
		
		nextSRef.setdRef(nextDRef);
		nextDRef.setsRef(nextSRef);
		
		this.next = next;
		
		return next;
	}
	
	public TimeTree createBySTree(STree s) {
		
		TimeTree next = new TimeTree();
		next.setsRef(s);
		
		this.next = next;
		
		return next;
		
	}
	
	public TimeTree createByDTree(DTree d) {
		
		TimeTree next = new TimeTree();
		next.setdRef(d);
		
		this.next = next;
		
		return next;
	}
	
	public STree getsRef() {
		return sRef;
	}
	public void setsRef(STree sRef) {
		this.sRef = sRef;
	}
	public DTree getdRef() {
		return dRef;
	}
	public void setdRef(DTree dRef) {
		this.dRef = dRef;
	}
	public TimeTree getNext() {
		return next;
	}
	public void setNext(TimeTree next) {
		this.next = next;
	}
	public TimeTree getPrevious() {
		return previous;
	}
	public void setPrevious(TimeTree previous) {
		this.previous = previous;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
}

