package com.kirangs.problems;

import java.util.HashMap;

public class LongestSubArrayWithEqualNumberOfZerosAndOnes {

	public static void main(String[] args) {

		int[] nums = { 1, 0, 1, 1, 1, 0, 0 };
		System.out.println(naiveSolution(nums));
		System.out.println(optimalSolution(nums));

	}

	// Time : O(N)
	// Space : O(N)
	private static int optimalSolution(int[] nums) {

		int maxLen = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				nums[i] = -1;
			}
		}
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum = prefixSum + nums[i];
			if (prefixSum == 0) {
				maxLen = Math.max(maxLen, i + 1);
			}
			if (hashMap.containsKey(prefixSum)) {
				maxLen = Math.max(maxLen, i - hashMap.get(prefixSum));
			} else {
				hashMap.put(prefixSum, i);
			}
		}
		return maxLen;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums) {

		int n = nums.length;
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int count1 = 0;
			int count2 = 0;
			for (int j = i; j < n; j++) {
				if (nums[j] == 0) {
					count1++;
				} else {
					count2++;
				}
				if (count1 == count2) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}
}
