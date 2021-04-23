package com.samuelvazquez.overrideequalhashcode.example3;

public class Main {
	public static void main(String[] args) {
		//although the two instances have exactly the same attribute values, they are stores in different locations.
		//Hence, they are not considered equal as per the default implementation of the method.
		//the same applies for hashCode() - a random unique code is generated for each instance
		Student st1 = new Student(1,"Samuel");
		Student st2 = new Student(1,"Samuel");

		System.out.println("student1 hashCode = " + st1.hashCode());
		System.out.println("student2 hashCode = " + st2.hashCode());
		System.out.println("Checking equality between st1 and st2 = " + st1.equals(st2));
	}
}
