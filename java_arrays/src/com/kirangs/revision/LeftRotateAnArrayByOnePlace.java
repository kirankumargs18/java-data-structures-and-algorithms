package com.kirangs.revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeftRotateAnArrayByOnePlace {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		rotateArrayByKPlaces(nums, 3);
		System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));

	}

	private static void rotateArrayByKPlaces(int[] nums, int k) {

		int n = nums.length;
		for (int i = 0; i < n - k; i++) {
			rotateArray(nums);
		}
	}

	// Time : O(N)
	// Space : O(1)
	private static void rotateArray(int[] nums) {

		int n = nums.length;
		int first = nums[0];
		for (int i = 0; i < n - 1; i++) {
			nums[i] = nums[i + 1];
		}
		nums[n - 1] = first;
	}
}
