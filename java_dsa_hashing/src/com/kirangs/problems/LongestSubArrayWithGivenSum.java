package com.kirangs.problems;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] nums = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println("Maximum Length of Subarray : " + naiveSolution(nums, 0));
		System.out.println("Maximum Length of Subarray : " + optimalSolution(nums, 0));

	}

	// Idea : prefix sum
	// Time : O(N)
	// Space : O(N)
	private static int optimalSolution(int[] nums, int target) {

		int maxLen = 0;
		int n = nums.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum = prefixSum + nums[i];
			if (prefixSum == target) {
				maxLen = Math.max(maxLen, i + 1);
			}
			if (hashMap.containsKey(prefixSum - target)) {
				maxLen = Math.max(maxLen, i - hashMap.get(prefixSum - target));
			} else {
				hashMap.put(prefixSum, i);
			}
		}
		return maxLen;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int target) {
		int n = nums.length;
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum == target) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}
}
