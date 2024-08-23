package com.kirangs;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		System.out.println(searchInsertPosition(nums, 5));

		int[] nums1 = { 1, 3, 5, 6 };
		System.out.println(searchInsertPosition(nums1, -1));

		int[] nums2 = { 1, 3, 5, 6 };
		System.out.println(searchInsertPosition(nums2, 7));

	}

	private static int searchInsertPosition(int[] nums, int target) {

		int n = nums.length;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] == target) {
				return m;
			} else if (target > nums[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return l;
	}
}
