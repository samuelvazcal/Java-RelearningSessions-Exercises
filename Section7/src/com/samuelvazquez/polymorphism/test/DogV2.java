package com.samuelvazquez.polymorphism.test;

public class DogV2 implements AnimalV2{

    @Override
    public void animalSoundV2() {
        System.out.println("barks!");
    }

    @Override
    public void animalWalkV2() {
        System.out.println("using 4 legs!");
    }

    public void dogEat() {
        System.out.println("🐶 eating dog food...");
    }

    @Override
    public void breathing() {

    }

    @Override
    public void breathing2() {

    }
}
