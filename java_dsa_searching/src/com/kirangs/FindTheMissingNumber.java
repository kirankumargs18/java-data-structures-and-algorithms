package com.kirangs;

public class FindTheMissingNumber {

	public static void main(String[] args) {

		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(naiveSolution(nums));
		System.out.println(betterSolution(nums));
	}

	// better solution using hashing
	// Time : O(N)
	// Space : O(N)

	private static int betterSolution(int[] nums) {
		int n = nums.length;
		int[] hash = new int[n + 1];
		for (int i = 0; i < n; i++) {
			hash[nums[i]] = 1;
		}
		for (int i = 0; i < n + 1; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums) {

		int n = nums.length;
		for (int i = 0; i <= n; i++) {
			int flag = 0;
			for (int j = 0; j < n; j++) {
				if (nums[j] == i) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return i;
			}
		}
		return -1;
	}
}