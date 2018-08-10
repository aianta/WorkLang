package org.worklang.structures;

public class Demo1DInstance {

	int d_integer = 0;
	boolean d_boolean = false;
	
	public Demo1DInstance evaluate() {
		
		Demo1DInstance result = new Demo1DInstance();
		result.d_integer = this.d_integer + 1;
		result.d_boolean = !this.d_boolean;
		
		return result;
	}
	
	public void positive() {
		d_boolean = true;
	}
	
	public void negative() {
		d_boolean = false;
	}
	
	public int value() {
		return d_integer;
	}
	
}
