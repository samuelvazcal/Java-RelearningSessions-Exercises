package com.samuelvazquez.propagation;

public class Main {
	public static void main(String[] args) {
		//by default unchecked exceptions are propagated
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow");
	}
}


class TestExceptionPropagation1 {
	//exception occurred here, but it is not handled
	//so, it is propagated to previous method
	void m() {
		int data = 50/0;
	}

	void n(){
		m();
	}

	void p() {
		try {
			n();
		} catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}
