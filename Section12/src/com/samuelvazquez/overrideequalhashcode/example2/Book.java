package com.samuelvazquez.overrideequalhashcode.example2;

import java.util.Objects;


public class Book {
	private String title;
	private String author;
	private int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return ISBN;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || this.getClass() != o.getClass())
			return false;
		Book book = (Book) o;
		return this.ISBN == book.ISBN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}
}
