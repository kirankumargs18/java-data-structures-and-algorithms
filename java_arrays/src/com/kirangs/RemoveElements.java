package com.kirangs;

public class RemoveElements {

	public static void main(String[] args) {

	}

	private static int removeElements(int[] nums, int val) {

		int n = nums.length;
		if (n == 1 && nums[0] != val) {
			return 1;
		}
		if (n == 1 && nums[0] == val) {
			return 0;
		}
		int l = 0;
		int r = n - 1;
		while (l < r) {
			if (nums[l] == val && nums[r] != val) {
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
				l++;
				r--;
			}
			if (nums[l] != val) {
				l = l + 1;
			}
			if (nums[r] == val) {
				r = r - 1;
			}
		}
		return l + 1;
	}
}
