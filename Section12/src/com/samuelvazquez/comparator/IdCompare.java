package com.samuelvazquez.comparator;

import java.util.Comparator;


public class IdCompare implements Comparator<Pokemon> {
	@Override
	public int compare(Pokemon pk1, Pokemon pk2) {
		return pk1.getId() - pk2.getId();
	}
}
