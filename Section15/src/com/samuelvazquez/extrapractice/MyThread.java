package com.samuelvazquez.extrapractice;

import static com.samuelvazquez.threads.ThreadColor.ANSI_GREEN;


public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(ANSI_GREEN + "First way to create a thread");
	}
}
