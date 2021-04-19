package com.samuelvazquez.generics.iterable;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		Armoury armoury = new Armoury();
		// Instead of manually writing .hasNext() and .next() methods to iterate through
		// our collection we can simply use the advanced forloop
		for (Suit s : armoury) {
			System.out.println(s);
		}
	}
}
