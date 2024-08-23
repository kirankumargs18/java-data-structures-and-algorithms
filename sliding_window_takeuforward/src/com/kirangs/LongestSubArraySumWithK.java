package com.kirangs;

public class LongestSubArraySumWithK {

	public static void main(String[] args) {

		int[] nums = { 10, 5, 2, 7, 1, 9 };
		int k = 15;
		System.out.println(longestSubArrayWithSumEqualToK(nums, k));

		int[] nums1 = { -5, 8, -14, 2, 4, 12 };
		int k1 = -5;
		System.out.println(longestSubArrayWithSumEqualToK(nums1, k1));

	}

	private static int longestSubArrayWithSumEqualToKNaive(int[] nums, int k) {
		int n = nums.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}

	private static int longestSubArrayWithSumEqualToK(int[] nums, int k) {

		int n = nums.length;
		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;
		int sum = 0;
		while (r < n) {
			sum = sum + nums[r];
			if (sum > k) {
				sum = sum - nums[l];
				l++;
			}
			if (sum == k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;

	}

}
