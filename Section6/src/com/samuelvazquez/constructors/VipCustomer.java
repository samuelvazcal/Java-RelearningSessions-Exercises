package com.samuelvazquez.constructors;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;

	public VipCustomer() {
		this("Default Name",0.00,"defaultvalue@mail.com");
	}

	public VipCustomer(double creditLimit, String email) {
		this("Default Name C2",creditLimit,email);
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
}
