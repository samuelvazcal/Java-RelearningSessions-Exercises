package com.samuelvazquez.anonymousclass.typesanonymousclass.thirdtype;

/*
* Anonymous Inner class that defines inside method/constructor argument
* Defining a thread using anonymous inner class that define inside argument
 */
public class Main {
	public static void main(String[] args) {
		//Using anonymous inner class that define inside arguments,
		//here constructor argument
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Child Thread");
			}
		});

		t.start();

		System.out.println("Main Thread");

	}
}
