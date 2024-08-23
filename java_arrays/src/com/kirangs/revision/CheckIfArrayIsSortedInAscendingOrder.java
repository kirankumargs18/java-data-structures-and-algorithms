package com.kirangs.revision;

public class CheckIfArrayIsSortedInAscendingOrder {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 4 };
		int[] nums1 = { 1, 2, 1, 3, 4 };
		System.out.println(isSorted(nums));
		System.out.println(isSorted(nums1));
	}

	// Time : O(N)
	// Space : O(1)
	private static boolean isSorted(int[] nums) {
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			if (nums[i - 1] > nums[i]) {
				return false;
			}
		}
		return true;
	}
}
