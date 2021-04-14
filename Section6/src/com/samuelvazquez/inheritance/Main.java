package com.samuelvazquez.inheritance;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("Animal",1,1,5,8);
		Dog dog = new Dog("Yorkie",2,2,2,4,1,24,"short");

		dog.eat();
		dog.walk();
		dog.run();
	}
}
