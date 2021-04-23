package com.samuelvazquez.overrideequalhashcode.example3;

import java.util.HashSet;


public class Main {
	public static void main(String[] args) {
		//although the two instances have exactly the same attribute values, they are stores in different locations.
		//Hence, they are not considered equal as per the default implementation of the method.
		//the same applies for hashCode() - a random unique code is generated for each instance
		Student st1 = new Student(1,"Samuel");
		Student st2 = new Student(1,"Samuel");

		//And now, after overriding equals method, both student are considered equals because of its id
		//even when they don't have the same hashCode
		System.out.println("student1 hashCode = " + st1.hashCode());
		System.out.println("student2 hashCode = " + st2.hashCode());
		System.out.println("Checking equality between st1 and st2 = " + st1.equals(st2));

		//So, what's the purpose of overriding hashCode()?.
		//What if we want to all students in a HashSet?
		HashSet<Student> students = new HashSet<Student>();
		students.add(st1);
		students.add(st2);

		//contains method will return false, because HashSet still consider the objects as different.
		//HashSet stores its elements in memory buckets. Each bucket is linked to a particular hash code.
		//So, st1 is stored by Java inside a bucket and links it to the value of st.hashCode().
		//So, any time an element with the same hash code is inserted into the set, it will replace st1.
		//However, st2 has a different hash code, and it will be stored in a separate bucket,
		//so, it will be considered a totally different object.
		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet contains Alex = " + students.contains(new Student(1,"Samuel")));

		//That's why is important to override hashCode method, so let's override it in Student
		//and set it to be equal to the ID
		//so, students who have the same ID are stored in the same bucket
		//Now, the two elements are now considered as equal ans stored in the same memory bucket.
		//The same applied for HashMap, HashTable or any data structure that uses a hashing mechanism for storing elements

	}
}
