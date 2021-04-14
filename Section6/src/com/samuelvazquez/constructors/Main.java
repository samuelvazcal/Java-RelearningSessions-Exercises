package com.samuelvazquez.constructors;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		BankAccount samAccount = new BankAccount(1234567, 220,"Samuel","sam@test.com","3332223232");

		System.out.println(samAccount.getBalance());
		System.out.println(samAccount.getEmail());
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
