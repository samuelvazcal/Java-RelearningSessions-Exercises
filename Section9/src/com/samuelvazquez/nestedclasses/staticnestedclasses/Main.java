package com.samuelvazquez.nestedclasses.staticnestedclasses;

public class Main {
	public static void main(String[] args) {
		//static inner class, which means that you can access it without creating an object of the outer class
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		//static inner class does not have access to members of the outer class
		System.out.println(myInner.y);
	}
}

class OuterClass {
	int x = 10;

	static class InnerClass {
		int y = 5;
	}
}

