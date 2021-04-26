package com.samuelvazquez.keywordthrows;

import java.io.IOException;


public class Main3 {
	//In case you declare the exception if exception occurs,
	//an exception will be thrown at runtime because throws does not handle the exception.
	public static void main(String[] args) throws IOException {
		M2 m  = new M2();
		m.method();
		System.out.println("normal flow");
	}
}

class M2{
	void method()throws IOException {
		throw new IOException("device error");
	}
}
