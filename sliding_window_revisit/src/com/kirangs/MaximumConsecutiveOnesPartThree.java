package com.kirangs;

/**
 * LeetCode 1004. Max Consecutive Ones III
 */

//Basically this problem length maximum sub array with k zeros
public class MaximumConsecutiveOnesPartThree {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		System.out.println(naiveSolution(nums, k));
		System.out.println(betterSolution(nums, k));
		System.out.println(optimalSolution(nums, k));

		int[] nums1 = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int k1 = 3;
		System.out.println(naiveSolution(nums1, k1));
		System.out.println(betterSolution(nums1, k1));
		System.out.println(optimalSolution(nums1, k1));

	}

	// 2 pointer and sliding window
	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(int[] nums, int k) {

		int n = nums.length;
		int maxLen = Integer.MIN_VALUE;
		int r = 0;
		int l = 0;
		int count = 0;
		while (r < n) {
			if (nums[r] == 0) {
				count++;
			}
			if (count > k) {
				if (nums[l] == 0) {
					count--;
				}
				l = l + 1;
			}
			if (count <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}

	// 2 pointer and sliding window
	// Time : O(N+N)
	// Space : O(1)
	private static int betterSolution(int[] nums, int k) {

		int n = nums.length;

		int maxLen = Integer.MIN_VALUE;

		int r = 0;
		int l = 0;

		int count = 0;
		while (r < n) {
			if (nums[r] == 0) {
				count++;
			}
			while (count > k) {
				if (nums[l] == 0) {
					count--;
				}
				l = l + 1;
			}
			if (count <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int k) {

		int n = nums.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (nums[j] == 0) {
					count++;
				}
				if (count <= k) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
				if (count > k) {
					break;
				}
			}
		}
		return maxLen;
	}
}
