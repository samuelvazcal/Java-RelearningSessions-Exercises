package com.samuelvazquez.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal aAnimal= new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();
        aAnimal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
