package com.kirangs.problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedElements {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 3, 4, 4, 5, 5 };
		System.out.println(nonRepeated(nums, nums.length));

	}

	private static ArrayList<Integer> nonRepeated(int[] arr, int n) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
		for (int i : arr) {
			hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 1) {
				arrayList.add(entry.getKey());
			}
		}
		return arrayList;
	}
}
