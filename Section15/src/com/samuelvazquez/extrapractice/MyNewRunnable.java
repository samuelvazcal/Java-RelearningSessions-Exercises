package com.samuelvazquez.extrapractice;

import static com.samuelvazquez.threads.ThreadColor.ANSI_BLUE;


public class MyNewRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(ANSI_BLUE + "Second way to create a thread");
	}
}
