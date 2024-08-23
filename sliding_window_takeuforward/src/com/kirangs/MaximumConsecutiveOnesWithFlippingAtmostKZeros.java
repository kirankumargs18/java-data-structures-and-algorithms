package com.kirangs;

public class MaximumConsecutiveOnesWithFlippingAtmostKZeros {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		System.out.println(maxConsecutiveOnesNaive(nums, k));
		System.out.println(maxConsecutiveOnesBetter(nums, k));
		System.out.println(maxConsecutiveOnesOptimal(nums, k));
	}

	// BruteForce
	// Generate all sub arrays with at most 2 zeros
	// Time : O(n^2)
	// Space : O(1)
	private static int maxConsecutiveOnesNaive(int[] nums, int k) {

		int n = nums.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int zeros = 0;
			for (int j = i; j < n; j++) {
				if (nums[j] == 0) {
					zeros++;
				}
				if (zeros <= k) {
					maxLen = Math.max(maxLen, j - i + 1);
				} else {
					break;
				}
			}
		}
		return maxLen;
	}

	// 2 pointer and sliding window

	// Time : O(2N)
	// Space : O(1)
	private static int maxConsecutiveOnesBetter(int[] nums, int k) {

		int n = nums.length;
		int l = 0;
		int r = 0;
		int zeros = 0;
		int maxLen = Integer.MIN_VALUE;

		while (r < n) {
			if (nums[r] == 0) {
				zeros++;
			}
			while (zeros > k) {
				if (nums[l] == 0) {
					zeros--;
				}
				l++;
			}
			if (zeros <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}

	// Time : O(n)
	// Space : O(1)
	private static int maxConsecutiveOnesOptimal(int[] nums, int k) {

		int n = nums.length;
		int l = 0;
		int r = 0;
		int zeros = 0;
		int maxLen = Integer.MIN_VALUE;

		while (r < n) {
			if (nums[r] == 0) {
				zeros++;
			}
			if (zeros > k) {
				if (nums[l] == 0) {
					zeros--;
				}
				l++;
			}
			if (zeros <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}
}
