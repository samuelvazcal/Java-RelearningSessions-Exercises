package com.samuelvazquez.exceptionsinmethodoverriding;

import java.io.IOException;


class Parent2 {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild2 extends Parent2 {
	//If the superclass method does not declare an exception,
	//subclass overridden method cannot declare the checked exception
	//but can declare unchecked exception.
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String[] args) {
		Parent2 p = new TestExceptionChild2();
		p.msg();
	}

}
