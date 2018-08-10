package org.worklang.structures;

import java.time.Instant;
import java.util.Date;

public class TimeTree {
	
	private int energy = 0;
	private int energyLeft = 0;
	
	private int index = -1;
	private Instant timestamp =  Instant.now();
	private STree sRef = null;
	private DTree dRef = null;
	private TimeTree next = null;
	private TimeTree previous = null;
	
	
	public TimeTree create(TimeTree t) {
		
		index = Problem.CURRENT_TIME;
		
		TimeTree next = new TimeTree();
		
		STree nextSRef = sRef.createByTime(next); 
		DTree nextDRef = dRef.createByTime(next);
		
		nextSRef.setdRef(nextDRef);
		nextDRef.setsRef(nextSRef);
		
		this.next = next;
		
		return next;
	}

	public TimeTree createBySTree(STree s) {
		
		//Initialize next time node
		
		//Create one if necessary
		if (next == null) {
			TimeTree next = new TimeTree();
			this.next = next;
		}
		
		next.setsRef(s);
		next.setIndex(Problem.CURRENT_TIME + 1);
		
		return next;
		
	}

	public TimeTree createByDTree(DTree d) {
		
		//Initialize next time node
		
		//Create one if necessary
		if (next == null) {
			TimeTree next = new TimeTree();
			this.next = next;
		}
		
		next.setdRef(d);
		next.setIndex(Problem.CURRENT_TIME + 1);
		
		
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
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getEnergyLeft() {
		return energyLeft;
	}
}

