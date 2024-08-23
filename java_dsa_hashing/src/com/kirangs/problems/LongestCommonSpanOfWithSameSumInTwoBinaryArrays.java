package com.kirangs.problems;

import java.util.HashMap;

public class LongestCommonSpanOfWithSameSumInTwoBinaryArrays {

	public static void main(String[] args) {

		int[] nums1 = { 0, 1, 0, 0, 0, 0 };
		int[] nums2 = { 1, 0, 1, 0, 0, 1 };
		System.out.println(naiveSolution(nums1, nums2));
		System.out.println(optimalSolution(nums1, nums2));

	}

	// convert the problem into longest sub array with sum 0
	// Take difference between 2 arrays into a single array
	// Time : O(N)
	// Space : O(N)
	private static int optimalSolution(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = nums1[i] - nums2[i];
		}
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int maxLen = 0;
		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum = prefixSum + temp[i];
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
	private static int naiveSolution(int[] nums1, int[] nums2) {

		int n = nums1.length;
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int j = i; j < n; j++) {
				sum1 = sum1 + nums1[j];
				sum2 = sum2 + nums2[j];
				if (sum1 == sum2) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}

}
