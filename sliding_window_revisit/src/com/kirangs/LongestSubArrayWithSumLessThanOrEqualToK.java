package com.kirangs;

public class LongestSubArrayWithSumLessThanOrEqualToK {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 0, 1, 1, 0 };
		int k = 4;
		System.out.println(naiveSolution(nums, k));
		System.out.println(betterSolution(nums, k));
		System.out.println(optimalSolution(nums, k));

		int[] nums1 = { 8, 2, 4, 0, 1, 1, 0 };
		int k1 = 9;
		System.out.println(naiveSolution(nums1, k1));
		System.out.println(betterSolution(nums1, k1));
		System.out.println(optimalSolution(nums1, k1));

	}

	// Optimal Solution we can reduce that while we have used in the better solution
	// for shrinking. Instead of shrinking the window to below maxLen. we will keep
	// window length intact with maxLen
	// Time : O(N)
	// Space : O(1)

	private static int optimalSolution(int[] nums, int k) {

		int n = nums.length;
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		int sum = 0;
		while (r < n) {
			sum = sum + nums[r];
			if (sum > k) {
				sum = sum - nums[l];
				l = l + 1;
			}
			if (sum <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r = r + 1;
		}
		return maxLen;
	}

	// using 2 pointer and sliding window
	// Time : O(N+N) N--> window expansion, N--> Window Shrink
	// Space : O(1)
	private static int betterSolution(int[] nums, int k) {

		int n = nums.length;
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		int sum = 0;
		while (r < n) {
			sum = sum + nums[r];
			while (sum > k) {
				sum = sum - nums[l];
				l = l + 1;
			}
			if (sum <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r = r + 1;
		}
		return maxLen;
	}

	// Time : O(n^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int k) {

		int n = nums.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int currSum = 0;
			for (int j = i; j < n; j++) {
				currSum = currSum + nums[j];
				if (currSum > k) {
					break;
				} else {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}
}
