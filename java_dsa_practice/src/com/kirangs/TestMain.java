package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println(list);

		List<List<Integer>> result = new ArrayList<>();
		result.add(list);
		System.out.println(result);

	}

}
