package com.kirangs;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] nums = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;
		System.out.println(naiveSolution(nums, sum));
		System.out.println(optimalSolution(nums, sum));

		int[] nums1 = { 2, 4 };
		int sum1 = 3;
		System.out.println(naiveSolution(nums1, sum1));
		System.out.println(optimalSolution(nums1, sum1));

	}

	// 2 pointer and sliding window
	// Time : O(N+N)--> O(2N)--> O(N)
	// Space : O(1)
	private static String optimalSolution(int[] nums, int givenSum) {

		int n = nums.length;
		int l = 0;
		int r = 0;
		int sum = 0;
		while (r < n) {
			sum = sum + nums[r];
			while (sum > givenSum) {
				sum = sum - nums[l];
				l = l + 1;
			}
			if (sum == givenSum) {
				return "YES";
			}
			r = r + 1;
		}
		return "NO";
	}

	// Time : O(N^2)
	// Space : O(1)
	private static String naiveSolution(int[] nums, int givenSum) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];
				if (sum == givenSum) {
					return "YES";
				}
			}
		}
		return "NO";
	}

}
