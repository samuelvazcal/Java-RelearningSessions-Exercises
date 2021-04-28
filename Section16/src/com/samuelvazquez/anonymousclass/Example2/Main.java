package com.samuelvazquez.anonymousclass.Example2;

public class Main {
	public static void main(String[] args) {
		//MyClass is implementation class of Age interface
		//MyClass obj = new MyClass();
		//calling getAge() method implemented at MyClass
		//obj.getAge();

		Age obj2 = new Age() {
			@Override
			public void getAge() {
				System.out.println("anonymous inner class");
			}
		};

		obj2.getAge();
	}
}


//class MyClass implements Age {
//	@Override
//	public void getAge() {
//		System.out.println("Age is " + x);
//	}
//}

interface Age {
	int x = 21;
	void getAge();
}
