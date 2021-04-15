package com.samuelvazquez.polymorphism.test;

public class Main {
    public static void main(String[] args) {
        AnimalV2 animal = new DogV2();
        animal.animalSoundV2();
        animal.animalWalkV2();

        DogV2 animal2 = new DogV2();
        animal2.dogEat();

        AnimalV2 animal3 = new CatV2();
        animal3.animalWalkV2();

        CatV2 animal4 = new CatV2();
        animal4.catEat();
    }
}
