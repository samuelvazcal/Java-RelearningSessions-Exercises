package com.samuelvazquez.overrideequalhashcode.example3;

import java.util.Objects;


public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	//for business purposes, we consider that two students are equal if they have the same ID,
	//so we override the equals() method and provide our own implementation as the following:
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || this.getClass() != o.getClass()) return false;
		Student s = (Student) o;
		return this.id == s.id;
		//above implementation two students are equal if and only if they are stored in the same address
		//OR they have the same ID.
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
