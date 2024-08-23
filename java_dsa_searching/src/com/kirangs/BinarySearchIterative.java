package com.kirangs;

public class BinarySearchIterative {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(nums, 4));
		System.out.println(binarySearch(nums, 20));

	}

	// O(LogN)
	// O(1)
	private static int binarySearch(int[] nums, int target) {

		int n = nums.length;
		int l = 0;
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

}
