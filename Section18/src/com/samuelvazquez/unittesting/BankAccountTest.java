package com.samuelvazquez.unittesting;

import static junit.framework.TestCase.*;

/**
 *
 */
public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Samuel","Vazquez",1000.00,BankAccount.CHECKING);
        double balance = account.deposit(200.0,true);
        assertEquals(1200.00,balance,0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount account = new BankAccount("Samuel","Vazquez",1000.00,BankAccount.CHECKING);
        double balance = account.withdraw(100.00,false);
        assertEquals(900.00,balance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Samuel","Vazquez",1000.00,BankAccount.CHECKING);
        account.deposit(200.0,true);
        assertEquals(1200.00,account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Samuel","Vazquez",1000.00,BankAccount.CHECKING);
        account.withdraw(200.0,true);
        assertEquals(800.00,account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Samuel","Vazquez",1000.00,BankAccount.CHECKING);
        assertTrue("The account is NOT a checking account", account.isChecking());
    }

}
