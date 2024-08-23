package com.kirangs;

public class NumberOfBinarySubArraysWithSum {

	public static void main(String[] args) {

		int[] nums = { 1, 0, 1, 0, 1 };
		int goal = 2;
		System.out.println(naiveSolution(nums, goal));
		System.out.println(optimalSolution(nums, goal));

		int[] nums1 = { 0, 0, 0, 0, 0 };
		int goal1 = 0;
		System.out.println(naiveSolution(nums1, goal1));
		System.out.println(optimalSolution(nums1, goal1));

	}

	// 2 pointer and sliding window
	// Time : O(N)
	// Space : O(1)
	// Total number of subArrays =number of subArrays with <=goal - number of
	// subArrays with <=goal-1
	private static int countSubArrays(int[] nums, int goal) {

		if (goal < 0) {
			return 0;
		}
		int n = nums.length;
		int count = 0;
		int l = 0;
		int r = 0;
		int sum = 0;
		while (r < n) {
			sum = sum + nums[r];
			while (sum > goal) {
				sum = sum - nums[l];
				l = l + 1;
			}
			count = count + (r - l + 1);
			r = r + 1;
		}
		return count;
	}

	private static int optimalSolution(int[] nums, int goal) {
		return countSubArrays(nums, goal) - countSubArrays(nums, goal - 1);
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int goal) {

		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum == goal) {
					count++;
				}
				if (sum > goal) {
					break;
				}
			}
		}
		return count;
	}
}
