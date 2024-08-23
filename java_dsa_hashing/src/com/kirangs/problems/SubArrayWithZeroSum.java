package com.kirangs.problems;

import java.util.HashSet;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {

		int[] nums = { 1, 2, -3 };
		System.out.println(naiveSolution(nums));
		System.out.println(optimalSolution(nums));

	}

	// Idea : u calculate all prefix sum, if prefix sum is repeated then we have
	// subarray with sum = 0
	// or if prefix sum is zero then also we have subarray with sum is zero

	// Time : O(N)
	// Space : O(N)
	private static boolean optimalSolution(int[] nums) {

		HashSet<Integer> hashSet = new HashSet<>();
		int n = nums.length;
		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum = prefixSum + nums[i];
			if (prefixSum == 0) {
				return true;
			}
			if (hashSet.contains(prefixSum)) {
				return true;
			}
			hashSet.add(prefixSum);
		}
		return false;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static boolean naiveSolution(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
