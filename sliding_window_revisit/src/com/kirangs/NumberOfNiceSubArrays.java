package com.kirangs;

public class NumberOfNiceSubArrays {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
		int k = 2;
		System.out.println(naiveSolution(nums, k));
		System.out.println(optimalSolution(nums, k));

		int[] nums1 = { 2, 4, 6 };
		int k1 = 1;
		System.out.println(naiveSolution(nums1, k1));
		System.out.println(optimalSolution(nums1, k1));

		int[] nums2 = { 2, 4, 6 };
		int k2 = 1;
		System.out.println(naiveSolution(nums2, k2));
		System.out.println(optimalSolution(nums2, k2));

	}

	// sliding window and 2 pointer

	private static int optimalSolution(int[] nums, int k) {
		return countSubArrays(nums, k) - countSubArrays(nums, k - 1);
	}

	private static int countSubArrays(int[] nums, int k) {

		if (k < 0) {
			return 0;
		}
		int n = nums.length;
		int count = 0;
		int l = 0;
		int r = 0;
		int sum = 0;
		while (r < n) {
			sum = sum + nums[r] % 2;
			while (sum > k) {
				sum = sum - nums[l] % 2;
				l = l + 1;
			}
			count = count + (r - l + 1);
			r = r + 1;
		}
		return count;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int k) {

		int n = nums.length;
		int subArrayCount = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (nums[j] % 2 != 0) {
					count++;
				}
				if (count == k) {
					subArrayCount++;
				}
				if (count > k) {
					break;
				}
			}
		}
		return subArrayCount;
	}
}
