package com.kirangs;

public class NumberOfSubArraysWithSumEqualToK {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1 };
		int k = 2;
		System.out.println(naiveSolution(nums, k));
		System.out.println(optimalSolution(nums, k));

		int[] nums1 = { 1, 2, 3 };
		int k1 = 3;
		System.out.println(naiveSolution(nums1, k1));
		System.out.println(optimalSolution(nums1, k1));

	}

	// Time : O(N)
	// Space : O(N)
	private static int optimalSolution(int[] nums, int k) {

		int n = nums.length;
		int count = 0;
		int[] psum = new int[n];
		int l = 0;
		int r = 0;
		psum[0] = nums[0];
		for (int i = 1; i < n; i++) {
			psum[i] = psum[i - 1] + nums[i];
		}
		while (r < n) {
			if (getSum(psum, l, r) == k) {
				count++;
			}
			if (getSum(psum, l, r) > k) {
				l++;
			}
			r++;
		}
		return count;
	}

	private static int getSum(int[] psum, int l, int r) {
		if (r == l || l == 0) {
			return psum[r];
		}
		return psum[r] - psum[l - 1];
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int k) {

		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}

}
