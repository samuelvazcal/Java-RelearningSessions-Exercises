package com.samuelvazquez.extrapractice;

public class Main {
	public static void main(String[] args) {
		//there are two ways to create a thread
		//1. Extending Thread class
		MyThread myThread = new MyThread();
		myThread.start();

		(new MyThread()).start();

		new Thread(){
			@Override
			public void run() {
				System.out.println("anonymous class");
			}
		}.start();

		Thread x = new Thread(){
			@Override
			public void run() {
				System.out.println("anonymous class to an thread reference");
			}
		};
		x.start();

		//2. Implementing Runnable interface
		Thread myNewThread = new Thread(new MyNewRunnable());
		myNewThread.start();

		//(new Thread(new MyNewRunnable())).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("second way now with an anonymous class");
			}
		}).start();

		Thread y = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("anonymous class pointing to an thread reference");
			}
		});

		y.start();
	}
}
