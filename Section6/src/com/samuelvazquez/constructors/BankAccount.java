package com.samuelvazquez.constructors;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		System.out.println("The empty one!");
	}

	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Constructor with parameters");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public double deposit(double deposit) {
		balance += deposit;
		return balance;
	}

	public double withdraw(double withdraw) {
		if(balance < withdraw) {
			System.out.println("Insufficient funds!");
			return balance;
		} else {
			balance -= withdraw;
			return balance;
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
