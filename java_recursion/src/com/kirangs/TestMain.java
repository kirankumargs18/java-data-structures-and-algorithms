package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

//		int[] nums = { 1, 2, 3 };
//
//		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//		System.out.println(list);

		List<List<String>> strs = new ArrayList<>();
		strs.add(Arrays.asList("Q", ".", ".", "."));
		System.out.println(strs.get(0).get(1));
	}

}
