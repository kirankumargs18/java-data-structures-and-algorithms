package com.kirangs;

public class FirstOccurenceOfPositiveNumberInSortedArray {

	public static void main(String[] args) {

		int[] nums = { -2, -1, -1, 1, 2, 3 };
		System.out.println(firstOccurence(nums));

		int[] nums1 = { -3, -2, -1, 0, 0, 1, 2 };
		System.out.println(firstOccurence(nums1));

		int[] nums2 = {-2,-1,-1,0,0,0 };
		System.out.println(firstOccurence(nums2));
	}

	// O(logN)
	// O(1)
	private static int firstOccurence(int[] nums) {
		if (nums[0] > 0) {
			return 0;
		}
		int n = nums.length;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] == 0) {
				l = m + 1;
			} else if (nums[m] > 0) {
				if (nums[m - 1] > 0) {
					h = m - 1;
				} else {
					return m;
				}
			} else {
				l = m + 1;
			}
		}
		return -1;
	}
}
