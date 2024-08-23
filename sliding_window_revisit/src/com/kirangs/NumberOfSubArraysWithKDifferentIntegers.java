package com.kirangs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfSubArraysWithKDifferentIntegers {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 2, 3 };
		int k = 2;
		System.out.println(naiveSolution(nums, k));
		System.out.println(optimalSolution(nums, k));

		int[] nums1 = { 1, 2, 1, 3, 4 };
		int k1 = 3;
		System.out.println(naiveSolution(nums1, k1));
		System.out.println(optimalSolution(nums1, k1));
	}

	// 2 pointer and sliding window
	// Time : O(2*(N+N))
	// Space : O(1)
	private static int optimalSolution(int[] nums, int k) {
		return countSubArrays(nums, k) - countSubArrays(nums, k - 1);
	}

	private static int countSubArrays(int[] nums, int k) {
		if (k < 0) {
			return 0;
		}
		int n = nums.length;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		int r = 0;
		int l = 0;
		while (r < n) {
			if (map.containsKey(nums[r])) {
				map.put(nums[r], map.get(nums[r]) + 1);
			} else {
				map.put(nums[r], 1);
			}
			while (map.size() > k) {
				map.put(nums[l], map.get(nums[l]) - 1);
				if (map.get(nums[l]) == 0) {
					map.remove(nums[l]);
				}
				l++;
			}
			count = count + (r - l + 1);
			r++;
		}
		return count;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int k) {

		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = i; j < n; j++) {
				set.add(nums[j]);
				if (set.size() == k) {
					count++;
				}
				if (set.size() > k) {
					break;
				}
			}
		}
		return count;
	}
}
