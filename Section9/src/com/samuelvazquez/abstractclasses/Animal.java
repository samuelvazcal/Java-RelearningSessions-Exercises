package com.samuelvazquez.abstractclasses;

abstract class Animal {

	public String name;

	public Animal() {
		System.out.println("Hello from a constructor");
	}

	public Animal(String name) {
		this.name = name;
	}

	//abstract method
	public abstract void animalSound();
	//abstract method
	public abstract void animalAge();

	public final void animalBreath() {
		System.out.println("Of course breaths!");
	}
	//regular method
	public void sleep() {
		System.out.println("animal Zzz");
	}

}
