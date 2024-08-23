package com.kirangs;

public class MaximumPointsObtainFromCards {

	public static void main(String[] args) {

		int[] nums = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
		int k = 4;
		System.out.println(maxPoints(nums, k));
	}

	// We can pick cards from either right or left side but not in inbetween
	// Time : O(2k)
	// Space : O(1)
	private static int maxPoints(int[] nums, int k) {

		int n = nums.length;
		int lSum = 0;
		int rSum = 0;
		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			lSum = lSum + nums[i];
		}
		maxSum = lSum;
		int rIndex = n - 1;
		for (int i = k - 1; i >= 0; i--) {
			lSum = lSum - nums[i];
			rSum = rSum + nums[rIndex];
			rIndex--;
			maxSum = Math.max(maxSum, lSum + rSum);
		}
		return maxSum;
	}
}
