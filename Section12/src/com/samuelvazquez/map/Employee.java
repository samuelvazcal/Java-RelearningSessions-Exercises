package com.samuelvazquez.map;

public class Employee {
	private String name;
	private double salary;

	public Employee(String name) {
		this.name = name;
		this.salary = 2000;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name: " + name + ", salary: " + salary + '}';
	}
}
