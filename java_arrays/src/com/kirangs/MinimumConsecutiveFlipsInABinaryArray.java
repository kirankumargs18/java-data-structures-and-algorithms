package com.kirangs;

public class MinimumConsecutiveFlipsInABinaryArray {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 0 };
		minimumConsecutiveFlips(nums);

		int[] nums1 = { 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1 };
		minimumConsecutiveFlips(nums1);
	}

	// It is always second group that we can flip as it will be either as number of
	// groups as first one or one lesser by first group
	private static void minimumConsecutiveFlips(int[] nums) {

		int n = nums.length;
		for (int i = 1; i < n; i++) {
			if (nums[i] != nums[i - 1]) {
				if (nums[i] != nums[0]) {
					System.out.print(i + " - ");
				} else {
					System.out.println(i - 1);
				}
			}
		}
		if (nums[n - 1] != nums[0]) {
			System.out.println(n - 1);
		}
	}
}
