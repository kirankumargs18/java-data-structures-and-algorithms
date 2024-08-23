package com.kirangs.revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RightRotateAnArrayByOnePlace {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		rightRotateByKTimes(nums, 5);
		System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));

	}

	// Time : O(n*k)
	// Space : O(1)
	private static void rightRotateByKTimes(int[] nums, int k) {

		int n = nums.length;
		k = k % n;
		for (int i = 0; i < k; i++) {
			rightRotate(nums);
		}
	}

	private static void rightRotate(int[] nums) {
		int n = nums.length;
		int last = nums[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			nums[i + 1] = nums[i];
		}
		nums[0] = last;
	}
}
