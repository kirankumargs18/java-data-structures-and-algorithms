package com.kirangs;

public class PrefixSum {

	public static void main(String[] args) {

		int[] nums = { 2, 8, 3, 9, 6, 5, 4 };
		System.out.println(prefixSum(nums, 2, 5));

	}

	// Time : O(N)
	// Space : O(1)
	private static int prefixSum(int[] nums, int l, int r) {

		int n = nums.length;
		int[] pSum = new int[n];
		pSum[0] = nums[0];
		for (int i = 1; i < n; i++) {
			pSum[i] = nums[i] + pSum[i - 1];
		}
		if (l == 0) {
			return pSum[r];
		} else {
			return pSum[r] - pSum[l - 1];
		}
	}
}
