package com.samuelvazquez.overrideequalhashcode.theory;

public class Main {
	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		String s3 = s1;
		//   ==     reference comparison
		//.equals() content comparison
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s3.equals(s2));
	}
}
