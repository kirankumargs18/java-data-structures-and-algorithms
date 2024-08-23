package com.kirangs;

public class SlidingWindowTechnique {

	public static void main(String[] args) {

		int[] nums = { 10, 5, -2, 20, 1 };

		int[] nums1 = { 6, -9, 7, 91, 4 };

		System.out.println(maxSumNaive(nums, 3));

		System.out.println(maxSum(nums, 3));

		System.out.println(maxSum(nums1, 3));

	}

	// sliding widow technique
	// Time : O(n)
	// Space : O(1)
	private static int maxSum(int[] nums, int k) {

		int n = nums.length;

		if (k > n) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		int res = sum;
		for (int i = k; i < n; i++) {
			sum = sum + nums[i] - nums[i - k];
			res = Math.max(sum, res);
		}
		return res;
	}

	// Maximum sum of K consecutive elements
	// Time : O(n*K)
	// Space : O(1)
	private static int maxSumNaive(int[] nums, int k) {

		int res = Integer.MIN_VALUE;

		int n = nums.length;
		for (int i = 0; i + k - 1 < n; i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += nums[i + j];
			}
			res = Math.max(res, sum);
		}
		return res;
	}
}
