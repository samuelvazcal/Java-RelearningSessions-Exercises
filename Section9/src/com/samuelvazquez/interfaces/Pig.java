package com.samuelvazquez.interfaces;

public class Pig implements Animal,Mammal {
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	@Override
	public void sleep() {
		System.out.println("🐷 zzz...");
	}

	@Override
	public int gestationPeriodDays() {
		return 115;
	}

	//public String get
}
