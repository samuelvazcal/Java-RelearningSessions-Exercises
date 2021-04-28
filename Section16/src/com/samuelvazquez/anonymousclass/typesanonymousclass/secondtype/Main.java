package com.samuelvazquez.anonymousclass.typesanonymousclass.secondtype;

/*
* Anonymous inner class that implements an interface
 */
public class Main {
	public static void main(String[] args) {
		//here we are using anonymous inner class
		//that implements a interface i.e.
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("child thread");
			}
		};

		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread");
	}
}
