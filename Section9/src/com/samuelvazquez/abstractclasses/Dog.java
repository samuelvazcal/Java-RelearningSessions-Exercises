package com.samuelvazquez.abstractclasses;

public class Dog extends Animal{

	public Dog() {
	}

	public Dog(String name) {
		super(name);
	}

	@Override
	public void animalSound() {
		System.out.println("🐶 says: woof woof");
	}

	@Override
	public void animalAge() {
		System.out.println("It's a puppy, don't worry!");
	}


}
