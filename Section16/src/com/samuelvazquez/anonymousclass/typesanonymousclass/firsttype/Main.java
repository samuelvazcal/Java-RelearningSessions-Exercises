package com.samuelvazquez.anonymousclass.typesanonymousclass.firsttype;

/*
* Anonymous Inner class that extends a class
* Creating an immediate thread using anonymous inner class that extends a class
 */
public class Main {
	public static void main(String[] args) {
		//using anonymous inner class
		//that extends a class
		Thread t = new Thread(){
			@Override
			public void run() {
				System.out.println("Child thread");
			}
		};

		t.start();
		System.out.println("Main Thread");
	}
}
