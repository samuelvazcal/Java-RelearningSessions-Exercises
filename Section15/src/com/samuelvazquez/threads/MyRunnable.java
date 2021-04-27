package com.samuelvazquez.threads;

import static com.samuelvazquez.threads.ThreadColor.ANSI_YELLOW;


public class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(ANSI_YELLOW + "Hello from the Runnable interface");
	}
}
