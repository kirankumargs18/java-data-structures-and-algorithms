package com.kirangs;

//2656. Maximum Sum With Exactly K Elements 
public class MaximumSumWithKElements {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		int k = 3;
		System.out.println(optimalSolution(nums, k));

		int[] nums1 = { 5, 5, 5 };
		int k1 = 2;
		System.out.println(optimalSolution(nums1, k1));
	}

	// Time : O(N+K)
	// Space : O(1)
	private static int optimalSolution(int[] nums, int k) {

		int n = nums.length;
		int sum = 0;
		int max = nums[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, nums[i]);
		}
		for (int i = 1; i <= k; i++) {
			sum = sum + max + (i - 1);
		}
		return sum;
	}
}
