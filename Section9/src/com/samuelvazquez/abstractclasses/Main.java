package com.samuelvazquez.abstractclasses;

public class Main {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.animalSound();
		dog.sleep();
		dog.animalAge();
		dog.animalBreath();
		Animal dog2 = new Dog("Lula");
		System.out.println(dog2.name);
	}
}
