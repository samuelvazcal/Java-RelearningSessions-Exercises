package com.samuelvazquez.generics.iterable;

public class Suit {
	private String codename;
	private int mark;

	public Suit(String codename, int mark) {
		this.codename = codename;
		this.mark = mark;
	}

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String toString() {
		return "Mark: " + mark + ", codename: " + codename;
	}
}
