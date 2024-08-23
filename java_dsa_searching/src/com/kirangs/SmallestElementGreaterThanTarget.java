package com.kirangs;

public class SmallestElementGreaterThanTarget {

	public static void main(String[] args) {

		int[] nums = { 99, 102, 106 };
		int target = 101;
		System.out.println(nextSmallest(nums, target));

	}

	private static int nextSmallest(int[] nums, int target) {

		int n = nums.length;
		int l = 0;
		int r = n - 1;
		int res = nums[0];
		while (l <= r) {
			int m = (l + r) / 2;
			if (nums[m - 1] == target && nums[m] != target) {
				return nums[m];
			} else if (nums[m] == target) {
				l = m + 1;
			} else if (nums[m] > target && nums[m - 1] <= target) {
				res = nums[m];
			} else {
				r = m - 1;
			}
		}
		return res;
	}

}
