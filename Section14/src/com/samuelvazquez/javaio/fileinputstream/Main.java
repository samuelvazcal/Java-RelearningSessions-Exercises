package com.samuelvazquez.javaio.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		try{
			FileInputStream fin = new FileInputStream("testout.txt");
			//reads the first byte of data from the file
			int i = fin.read();
			//without casting, it will print the int value for the first character
			System.out.println((char)i);
			fin.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("reading all characters");
		try {
			FileInputStream fin = new FileInputStream("testout.txt");
			int i = 0;
			while((i = fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("again, but now a new file...");
		try {
			FileInputStream fin = new FileInputStream("song.txt");
			System.out.print((char)fin.read());
			int i = 0;
			while((i = fin.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
