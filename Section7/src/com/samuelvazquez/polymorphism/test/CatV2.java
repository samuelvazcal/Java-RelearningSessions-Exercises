package com.samuelvazquez.polymorphism.test;

public class CatV2 implements AnimalV2 {
    @Override
    public void animalSoundV2() {
        System.out.println("meow meow");
    }

    @Override
    public void animalWalkV2() {
        System.out.println("using its four legs");
    }

    public void catEat() {
        System.out.println("🐱 eating cat food!");
    }

    @Override
    public void breathing() {

    }

    @Override
    public void breathing2() {

    }
}
