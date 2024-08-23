package com.kirangs;

public class TrippletsInSortedArray {
	public static void main(String[] args) {

		int[] nums = { 2, 3, 4, 8, 9, 20, 40 };
		System.out.println(naiveSolution(nums, 32));
		System.out.println(betterSolution(nums, 32));
		System.out.println(optimalSolution(nums, 32));

		int[] nums1 = { 1, 2, 5, 6 };
		System.out.println(naiveSolution(nums1, 14));
		System.out.println(betterSolution(nums1, 14));
		System.out.println(optimalSolution(nums1, 14));
	}

	// Time : O(N^3)
	// Space : O(1)
	private static boolean naiveSolution(int[] nums, int x) {

		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == x) {
						return true;
					}
				}
			}
		}
		return false;
	}

	// Time : O(N^2logN)
	// Space : O(1)
	private static boolean betterSolution(int[] nums, int x) {
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int value = x - (nums[i] + nums[j]);
				if (binarySearch(nums, j + 1, value) >= 0) {
					return true;
				}
			}
		}
		return false;
	}

	private static int binarySearch(int[] nums, int low, int target) {

		int n = nums.length;
		int l = low;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (target == nums[m]) {
				return m;
			} else if (target > nums[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return -1;
	}

	// Time : O(N^2)
	// Space : O(1)
	// for every i we will try to find a pair where whose sum is equal to x-nums[i]

	private static boolean optimalSolution(int[] nums, int x) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int value = x - nums[i];
			int l = i + 1;
			int r = n - 1;
			while (l < r) {
				int sum = nums[l] + nums[r];
				if (sum == value) {
					return true;
				} else if (sum > value) {
					r--;
				} else {
					l++;
				}
			}
		}
		return false;
	}
}
