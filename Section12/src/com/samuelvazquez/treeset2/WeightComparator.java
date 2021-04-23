package com.samuelvazquez.treeset2;

import java.util.Comparator;


public class WeightComparator implements Comparator<Pokemon> {
	@Override
	public int compare(Pokemon o1, Pokemon o2) {
		return Double.compare(o1.getWeight(),o2.getWeight());
	}
}
