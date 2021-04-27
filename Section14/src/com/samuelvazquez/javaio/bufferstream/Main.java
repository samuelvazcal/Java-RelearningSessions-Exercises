package com.samuelvazquez.javaio.bufferstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
	public static void main(String[] args) {

		FileOutputStream fout = null;
		//BufferedOutputStream class is used for buffering an output byte stream
		BufferedOutputStream bout = null;

		try {
			//unbuffered stream object (fout) is passed to the constructor for a buffered stream class
			//unbuffered stream ---> buffered stream
			fout = new FileOutputStream("message.txt");
			bout = new BufferedOutputStream(fout);
			String s = "All the things I ever wanted you to know";
			byte [] b = s.getBytes();
			bout.write(b);
			//flushing the buffer
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success!");
		} catch (IOException e) {
			System.out.println(e);
		}


	}
}
