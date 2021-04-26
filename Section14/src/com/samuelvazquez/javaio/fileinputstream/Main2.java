package com.samuelvazquez.javaio.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//working with the the two basic stream classes
public class Main2 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("song2.txt");
			out = new FileOutputStream("example4.txt");
			//System.out.print((char)in.read() + " ");
			out.write((char)in.read());
			int i;
			while((i = in.read())!=-1) {
				//System.out.print((char)i);
				out.write(i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

}
