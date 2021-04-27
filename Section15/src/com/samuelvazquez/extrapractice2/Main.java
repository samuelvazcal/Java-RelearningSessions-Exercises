package com.samuelvazquez.extrapractice2;

public class Main {
	public static void main(String[] args) {
		Table obj = new Table();//only one object
		MyThread1 t1=new MyThread1(obj);
		Thread t2=new Thread(){
			@Override
			public void run() {
				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}
}

class Table {
	//synchronized method
	//acquires the lock for that object (table) and releases it when the thread completes its task
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t){
		this.t=t;
	}

	@Override
	public void run() {
		t.printTable(5);
	}
}

//class MyThread2 extends Thread{
//	Table t;
//	MyThread2(Table t){
//		this.t=t;
//	}
//	public void run(){
//		t.printTable(100);
//	}
//}
