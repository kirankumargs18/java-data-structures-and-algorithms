package com.kirangs.java8;

import java.util.ArrayList;

public class ModArrayList extends ArrayList<Integer> {

	public Integer getElementAtIndex(int index, ModArrayList modArrayList) {

		if (index > modArrayList.size()) {
			index = index % modArrayList.size();
		}
		return modArrayList.get(index);
	}
}
