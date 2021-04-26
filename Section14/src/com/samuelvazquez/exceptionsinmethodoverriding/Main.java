package com.samuelvazquez.exceptionsinmethodoverriding;


import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}


class TestExceptionChild extends Parent {
	//If the superclass method does not declare an exception,
	//subclass overridden method cannot declare the checked exception
	//but it can declare unchecked exception.

	//void msg() throws IOException {
	//	System.out.println("TestExceptionChild");
	//}
	public static void main(String[] args) {
		Parent p = new TestExceptionChild();
		p.msg();
	}

}
