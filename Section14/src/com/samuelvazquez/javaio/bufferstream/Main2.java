package com.samuelvazquez.javaio.bufferstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Main2 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		//BufferedInputStream is used to read information using buffer mechanism to make performance fast
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream("song5.txt");
			//unbuffered stream ---> buffered stream
			bin = new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
