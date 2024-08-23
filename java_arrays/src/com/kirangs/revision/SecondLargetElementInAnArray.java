package com.kirangs.revision;

import java.util.Arrays;

public class SecondLargetElementInAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		System.out.println(betterSolution(nums));
		System.out.println(optimalSolution(nums));

	}

	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(int[] nums) {
		int n = nums.length;
		int large = nums[0];
		int secondLarge = -1;
		for (int i = 1; i < n; i++) {
			if (nums[i] > large) {
				secondLarge = large;
				large = nums[i];
			} else if (nums[i] != large && nums[i] > secondLarge) {
				secondLarge = nums[i];
			}
		}
		return secondLarge;
	}

	// Time : O(NlogN + N)
	// Space : O(1)
	private static int betterSolution(int[] nums) {

		int n = nums.length;
		Arrays.sort(nums);
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return -1;
	}
}
