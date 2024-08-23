package com.kirangs;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println(maxOnes(nums));

	}

	private static int maxOnesNaive(int[] nums) {

		int n = nums.length;
		int count = 0;
		int maxCount = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				count++;
				maxCount = Math.max(maxCount, count);
			} else {
				count = 0;
			}
		}
		if (maxCount <= 0) {
			return 0;
		}
		return maxCount;
	}

	private static int maxOnes(int[] nums) {

		int n = nums.length;
		int r = 0;
		int l = 0;
		int maxLen = Integer.MIN_VALUE;
		while (r < n) {
			if (nums[r] != 0) {
				maxLen = Math.max(maxLen, r - l + 1);
				r++;
			} else {
				r++;
				l = r;
			}
		}
		return maxLen;
	}
}
