package com.samuelvazquez.comparable.firstexample;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Student s) {
		//comparing by age
//		if(this.age == s.age)
//			return 0;
//		else
//			return this.age > s.age ? 1 : -1;

		//Comparing by name
//		return this.getName().compareTo(s.getName());

		//Comparing by id
		if(this.getId() == s.getId())
			return 0;
		else
			return this.getId() > s.getId() ? 1 : -1;
	}
}
