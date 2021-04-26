package com.samuelvazquez.propagation;

import java.io.IOException;


public class Main2 {
	public static void main(String[] args) {
		//by default checked exceptions are not propagated
		TestExceptionPropagation2 obj=new TestExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}
}

class TestExceptionPropagation2 {
	void m() {
		throw new IOException("device error");//checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}
}
