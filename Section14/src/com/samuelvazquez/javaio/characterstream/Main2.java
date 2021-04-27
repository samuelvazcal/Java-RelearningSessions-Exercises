package com.samuelvazquez.javaio.characterstream;

import java.io.*;


public class Main2 {
	public static void main(String[] args) {
		BufferedReader input = null;
		PrintWriter output = null;

		try
		{
			input = new BufferedReader(new FileReader("song4.txt"));
			output = new PrintWriter(new FileWriter("atlantic.txt"));
			int i;
			while ((i = input.read()) != -1)
			{
				System.out.print((char) i);
				output.write(i);
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				input.close();
				output.close();
			}
			catch (IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
