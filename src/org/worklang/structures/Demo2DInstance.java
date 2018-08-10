package org.worklang.structures;

public class Demo2DInstance {
	
	Demo1DInstance d_value;
	Demo1DInstance d_dividend;
	boolean d_divisible;
	
	public Demo2DInstance evaluate() {
		if (d_value.value() % d_dividend.value() == 0) {
			d_value.positive();
			d_dividend.negative();
			d_divisible = true;
		}else {
			d_value.negative();
			d_dividend.positive();
			d_divisible = false;
		}
		
		Demo2DInstance result = new Demo2DInstance();
		result.d_value = this.d_value;
		result.d_dividend = this.d_dividend;
		result.d_divisible = !this.d_divisible;
		
		return result;
	}
	
	public void positive() {
		d_value.positive();
		d_dividend.negative();
		d_divisible = true;
	}
	
	public void negative() {
		d_value.negative();
		d_dividend.positive();
		d_divisible = false;
	}
	
	public boolean value() {
		return d_divisible;
	}
	
}
