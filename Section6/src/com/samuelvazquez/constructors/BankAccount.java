package com.samuelvazquez.constructors;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private int customerName;
	private String email;
	private String phoneNumber;

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

	public int getCustomerName() {
		return customerName;
	}

	public void setCustomerName(int customerName) {
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
