package com.kirangs;

public class LastOccurenceOfANegativeNumberInSortedArray {

	public static void main(String[] args) {

		int[] nums = { -2, -1, -1, 1, 2, 3 };
		System.out.println(lastOccurence(nums));

		int[] nums1 = { -3, -2, -1, 0, 0, 1, 2 };
		System.out.println(lastOccurence(nums1));

		int[] nums2 = { 5, 20, 66, 1314 };
		System.out.println(lastOccurence(nums2));
	}

	// O(logN)
	// O(1)
	private static int lastOccurence(int[] nums) {
		int n = nums.length;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] < 0) {
				if (nums[m + 1] >= 0) {
					return m;
				} else {
					l = m + 1;
				}
			} else {
				h = m - 1;
			}
		}
		return -1;
	}
}
