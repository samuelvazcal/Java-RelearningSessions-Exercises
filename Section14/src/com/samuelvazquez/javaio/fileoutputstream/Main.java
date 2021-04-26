package com.samuelvazquez.javaio.fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		//write the byte 65 to the example1.txt file, A.
		try {
			FileOutputStream fout = new FileOutputStream("example1.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success");
		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			FileOutputStream fout = new FileOutputStream("example2.txt");
			String s = "Samuel Vazquez";
			byte [] b = s.getBytes(); //converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch(IOException e) {
			System.out.println(e);
		}

		try{
			FileOutputStream fout = new FileOutputStream("example3.txt");
			String s1 = "I can't keep up you're moving too fast";
			byte [] b1 = s1.getBytes();
			fout.write(b1);
			fout.close();
			System.out.println("success!");
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
