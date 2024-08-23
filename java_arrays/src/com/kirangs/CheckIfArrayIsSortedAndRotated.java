package com.kirangs;

public class CheckIfArrayIsSortedAndRotated {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(isSortedAndRotated(nums));

		int[] nums1 = { 2, 1, 3, 4 };
		System.out.println(isSortedAndRotated(nums1));

		int[] nums2 = { 1, 2, 3 };
		System.out.println(isSortedAndRotated(nums2));

	}

	// O(N)
	// O(1)
	private static boolean isSortedAndRotated(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (nums[(i + 1) % n] < nums[i]) {
				count++;
			}
		}
		return count <= 1;
	}

}
