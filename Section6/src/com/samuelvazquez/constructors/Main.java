package com.samuelvazquez.constructors;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		BankAccount samAccount = new BankAccount(1234567, 220,"Samuel","sam@test.com","3332223232");

		VipCustomer sofAccount1 = new VipCustomer();
		System.out.println(sofAccount1.getName() + ", " + sofAccount1.getCreditLimit() + ", " + sofAccount1.getEmail());
		VipCustomer sofAccount2 = new VipCustomer(1000.0,"sof@email.com");
		System.out.println(sofAccount2.getName());
		VipCustomer sofAccount3 = new VipCustomer("Sofia",5000.0,"sofia_fancy@gmail.com");
		System.out.println(sofAccount3.getName() + ", " + sofAccount3.getCreditLimit() + ", " + sofAccount3.getEmail());

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
