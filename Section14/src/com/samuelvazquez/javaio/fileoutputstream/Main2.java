package com.samuelvazquez.javaio.fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main2 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("song3.txt");
			out = new FileOutputStream("fly_to_me.txt");
			int i;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
				out.write(i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				in.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
