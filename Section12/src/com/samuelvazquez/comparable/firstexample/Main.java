package com.samuelvazquez.comparable.firstexample;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(1,"Michael Scott",33);
		Student student2 = new Student(3,"Jim Halpert",28);
		Student student3 = new Student(2,"Dwight Schrute",29);
		Student student4 = new Student(4,"Stanley Hudson",48);
		ArrayList<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);

		Collections.sort(list);
		printCollection(list);

	}

	public static void printCollection(ArrayList<Student> list) {
		for(Student x : list) {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getAge());
		}
	}
}
