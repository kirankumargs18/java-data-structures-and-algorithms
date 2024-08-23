package com.kirangs.revision;

public class LargestElementInAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(largest(nums));
	}

	// Time : O(N)
	// Space : O(1)
	private static int largest(int[] nums) {
		int n = nums.length;
		int larget = nums[0];
		for (int i = 1; i < n; i++) {
			larget = Math.max(larget, nums[i]);
		}
		return larget;
	}
}
