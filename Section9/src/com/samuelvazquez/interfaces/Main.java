package com.samuelvazquez.interfaces;

public class Main {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		int gestationDays = myPig.gestationPeriodDays();
		System.out.println(myPig.getClass().getSimpleName() + " gestation days are: " + gestationDays);
	}
}
