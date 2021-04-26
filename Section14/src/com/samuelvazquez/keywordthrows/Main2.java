package com.samuelvazquez.keywordthrows;

import java.io.IOException;


public class Main2 {
	//In case you declare the exception, if exception does not occur, the code will be executed fine
	public static void main(String[] args) throws IOException{
		M m  = new M();
		m.method();
		System.out.println("normal flow");
	}
}

class M{
	void method()throws IOException {
		System.out.println("device operation performed");
	}
}
