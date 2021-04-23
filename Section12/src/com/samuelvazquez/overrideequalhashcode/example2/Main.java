package com.samuelvazquez.overrideequalhashcode.example2;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("Song of Ice and Fire I","George R. R. Martin",99992021);
		Book book2 = new Book("Song of Ice and Fire I","George R. R. Martin",99992021);


		if(book1.equals(book2)) {
			System.out.println("It's the same book");
			System.out.println("book1 hashcode: " + book1.hashCode());
			System.out.println("book2 hashcode: " + book2.hashCode());
		} else {
			System.out.println("It's not the same book");
			System.out.println("book1 hashcode: " + book1.hashCode());
			System.out.println("book2 hashcode: " + book2.hashCode());
		}
	}
}
