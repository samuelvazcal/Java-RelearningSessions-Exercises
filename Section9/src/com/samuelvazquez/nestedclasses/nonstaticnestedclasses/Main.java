package com.samuelvazquez.nestedclasses.nonstaticnestedclasses;

public class Main {
	public static void main(String[] args) {
		//to access the inner class, create an object of the outer class,
		//and then create an object of the inner class
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.y + outer.x);
		//inner classes (non-static nested classes) can access attributes and methods of the outer class
		//including private members
		System.out.println(inner.myInnerMethod()*10);
	}
}

class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 5;

		public int myInnerMethod() {
			return x;
		}
	}
}



