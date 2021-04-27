package com.samuelvazquez.javaio.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		FileReader input = null;
		FileWriter output = null;

		try {
			input = new FileReader("song4.txt");
			output = new FileWriter("atlantic.txt");
			int i;
			while((i=input.read())!=-1) {
				output.write(i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
