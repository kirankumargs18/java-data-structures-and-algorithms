package com.kirangs.problems;

import java.util.HashSet;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 6 };
		System.out.println(naiveSolution(nums, 10));
		System.out.println(optimalSolution(nums, 10));

	}

	// Idea : calculate all prefix sum. At each prefix sum check whether
	// prefixSum-sum exists in previous prefix Sums
	// Time : O(N)
	// Space : O(N)
	private static boolean optimalSolution(int[] nums, int target) {
		int n = nums.length;
		HashSet<Integer> hashSet = new HashSet<>();
		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum = prefixSum + nums[i];
			if (prefixSum == target) {
				return true;
			}
			if (hashSet.contains(prefixSum - target)) {
				return true;
			}
		}
		return false;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static boolean naiveSolution(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum == target) {
					return true;
				}
			}
		}
		return false;
	}
}
