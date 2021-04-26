package com.samuelvazquez.trycatchblocks2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main {
	public static void main(String[] args) {
		PrintWriter pw;

		try {
			pw = new PrintWriter("xxx.txt");
			pw.println("saved");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File Saved Successfully");
	}
}
