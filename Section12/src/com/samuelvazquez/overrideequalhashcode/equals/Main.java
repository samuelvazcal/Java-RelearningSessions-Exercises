package com.samuelvazquez.overrideequalhashcode.equals;

//Driver class to test the Complex class
public class Main {
	public static void main(String[] args) {
		Complex c1 = new Complex(10,15);
		Complex c2 = new Complex(10,15);
		Complex c3 = c1;
		if(c1 == c2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}

class Complex {
	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
}
