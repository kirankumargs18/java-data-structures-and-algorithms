package com.kirangs;

public class LongestSubArrayWithSumLessThanOrEqualToK {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 1, 7, 10 };
		System.out.println(longestSubArray(nums, 14));

	}
	
	

	// Time : O(n^2)
	// Space : O(1)
	private static int longestSubArray(int[] nums, int k) {
		int n = nums.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
//			int currLen = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum <= k) {
//					currLen++;
//					maxLen = Math.max(maxLen, currLen);
					maxLen = Math.max(maxLen, j - i + 1);
				}
				if (sum > k) {
					break;
				}
			}
		}
		return maxLen;
	}
}
