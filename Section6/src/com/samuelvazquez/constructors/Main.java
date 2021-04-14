package com.samuelvazquez.constructors;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(100);
		System.out.println(account.getBalance());
		account.withdraw(40);
		System.out.println(account.getBalance());
		account.withdraw(80);
		System.out.println(account.getBalance());
		account.deposit(250);
		System.out.println(account.getBalance());
		account.withdraw(300);
		System.out.println(account.getBalance());
	}
}
