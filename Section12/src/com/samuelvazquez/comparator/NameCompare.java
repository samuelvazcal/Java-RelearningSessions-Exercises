package com.samuelvazquez.comparator;

import java.util.Comparator;


public class NameCompare implements Comparator<Pokemon> {
	@Override
	public int compare(Pokemon pk1, Pokemon pk2) {
		return pk1.getName().compareTo(pk2.getName());
	}
}
