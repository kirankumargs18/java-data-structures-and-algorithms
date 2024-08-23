package com.kirangs;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(nums, target));

		int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
		int target1 = 3;
		System.out.println(search(nums1, target1));

		int[] nums2 = { 1 };
		int target2 = 0;
		System.out.println(search(nums2, target2));
	}

	// O(logN)
	// O(1)
	private static int search(int[] nums, int target) {

		int n = nums.length;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] == target) {
				return m;
			}
			if (nums[l] <= nums[m]) {
				if (target >= nums[l] && target < nums[m]) {
					h = m - 1;
				} else {
					l = m + 1;
				}
			} else {
				if (target > nums[m] && target <= nums[h]) {
					l = m + 1;
				} else {
					h = m - 1;
				}
			}
		}
		return -1;
	}
}
