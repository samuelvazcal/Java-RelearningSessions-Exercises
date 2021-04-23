package com.samuelvazquez.overrideequalhashcode.example1;

import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Client cl1 = new Client("Michael Scott","A001",20000);
		Client cl2 = new Client("Jim Halpert","A001",15000);
		Client cl3 = new Client("Dwigh Schrute","A001",19000);
		Client cl4 = new Client("Stanley Hudson","A001",16000);
		Client cl5 = new Client("Andy Bernard","A001",10000);

		Client cl6 = new Client("Stanley Hudson","A001",16000);

//		Set<String> stringTest = new HashSet<>();
//		stringTest.add("AAA");
//		stringTest.add("BBB");
//		stringTest.add("CCC");
//		stringTest.add("AAA");

		Set<Client> appClient = new HashSet<>();
		appClient.add(cl1);
		appClient.add(cl2);
		appClient.add(cl3);
		appClient.add(cl4);
		appClient.add(cl5);
		appClient.add(cl6);


//		for(String x : stringTest) {
//			System.out.println(x);
//		}

		for(Client x :appClient) {
			System.out.println(x.getName() + " " + x.getId() + " " + x.getCredit());
		}


	}
}
