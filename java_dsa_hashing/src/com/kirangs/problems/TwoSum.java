package com.kirangs.problems;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 3, 3 };
		int target = 6;
		int[] res = twoSum(nums, target);
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	// Time : O(n)
	// Space : O(n)
	private static int[] twoSum(int[] nums, int target) {

		int n = nums.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (hashMap.containsKey(target - nums[i])) {
				return new int[] { hashMap.get(target - nums[i]), i };
			} else {
				hashMap.put(nums[i], i);
			}
		}
		return new int[] { -1, -1 };
	}
}
