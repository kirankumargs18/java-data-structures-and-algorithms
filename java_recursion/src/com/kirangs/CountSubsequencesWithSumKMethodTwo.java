package com.kirangs;

import java.util.Arrays;

public class CountSubsequencesWithSumKMethodTwo {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1 };
		Arrays.sort(nums);
		System.out.println(solution(nums));
	}

	private static int solution(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}
		return subsequences(0, nums, 0, 2);
	}

	// Time : O(n*2^n)
	// Space : O(n)
	private static int subsequences(int index, int[] nums, int sum, int k) {

		if (index >= nums.length) {
			if (sum == k) {
				return 1;
			}
			return 0;
		}
		sum = sum + nums[index];
		int l = subsequences(index + 1, nums, sum, k);
		sum = sum - nums[index];
		int r = subsequences(index + 1, nums, sum, k);
		return l + r;
	}
}
