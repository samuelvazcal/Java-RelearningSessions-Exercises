package com.samuelvazquez.keywordthrows;

import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		Testthrows1 obj=new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}

class Testthrows1 {
	//now checked exceptions can be propagated
	void m() throws IOException {
		throw new IOException("device error");//checked exception
	}

	//if you are calling a method that declares an exception, you must either caught or declare the exception
	void n() throws IOException {
		m();
	}

	void p() {
		try
		{
			n();
		}
		catch (Exception e)
		{
			System.out.println("exception handled");
		}
	}
}

