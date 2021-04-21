package com.samuelvazquez.comparator;

import java.util.Comparator;


public class WeightCompare implements Comparator<Pokemon> {
	@Override
	//descending order
	public int compare(Pokemon pk1, Pokemon pk2) {
		return Double.compare(pk2.getWeight(),pk1.getWeight());
	}
}
