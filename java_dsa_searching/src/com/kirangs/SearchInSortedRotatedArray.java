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

	private static int search(int[] nums, int target) {

		int n = nums.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[low] <= nums[mid]) {
				if (target >= nums[low] && target < nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
