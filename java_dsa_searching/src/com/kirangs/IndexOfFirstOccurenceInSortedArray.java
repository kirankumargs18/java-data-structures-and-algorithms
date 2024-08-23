package com.kirangs;

public class IndexOfFirstOccurenceInSortedArray {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		System.out.println(firstOccurence(nums, 8));

		int[] nums1 = { 5, 7, 7, 8, 8, 10 };
		System.out.println(firstOccurence(nums1, 6));

		int[] nums3 = {};
		System.out.println(firstOccurence(nums3, 0));

	}

	// O(logN)
	// O(1)
	private static int firstOccurence(int[] nums, int target) {

		int n = nums.length;
		if (n <= 0) {
			return -1;
		}
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				if (mid == 0 || nums[mid] != nums[mid - 1]) {
					return mid;
				} else {
					high = mid - 1;
				}
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}