package com.kirangs.revision;

public class CheckIfArrayIsSortedAndRotated {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(isSortedAndRotated(nums));

	}

	// Time : O(N)
	// Space : O(1)
	private static boolean isSortedAndRotated(int[] nums) {

		int count = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[(i + 1) % n] < nums[i]) {
				count = count + 1;
			}
			if (count > 1) {
				return false;
			}
		}
		return true;
	}
}
