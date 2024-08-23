package com.kirangs;

import java.util.HashMap;
import java.util.Map;

//1. Two Sum
public class TwoSum {

	public static void main(String[] args) {

		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(numbers, target));

		int[] numbers1 = { 3, 2, 4 };
		int target1 = 6;
		System.out.println(twoSum(numbers1, target1));

		int[] numbers2 = { 3, 3 };
		int target2 = 6;
		System.out.println(twoSum(numbers2, target2));
	}

	private static int[] twoSum(int[] nums, int target) {

		int n = nums.length;
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hashMap.put(nums[i], i);
		}
		for (int i = 0; i < n; i++) {
			int value = target - nums[i];
			if (hashMap.containsKey(value) && i != hashMap.get(value)) {
				return new int[] { i, hashMap.get(value) };
			}
		}
		return new int[] { -1, -1 };
	}
}
