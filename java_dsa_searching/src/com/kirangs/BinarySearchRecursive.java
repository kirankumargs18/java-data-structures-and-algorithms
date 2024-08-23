package com.kirangs;

public class BinarySearchRecursive {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(nums, 0, nums.length - 1, 4));
		System.out.println(binarySearch(nums, 0, nums.length - 1, 3));

	}

	// O(logN)
	// O(logN) recursive calls in stack
	private static int binarySearch(int[] nums, int l, int h, int target) {

		if (l > h) {
			return -1;
		}
		int m = (l + h) / 2;
		if (nums[m] == target) {
			return m;
		}
		if (nums[m] > target) {
			return binarySearch(nums, l, m - 1, target);
		} else {
			return binarySearch(nums, m + 1, h, target);
		}
	}
}
