package com.kirangs.problems;

public class LargestElementUsingBubbleSort {

	public static void main(String[] args) {

		int[] nums = { -5, -4, -1, -2, -3 };

		System.out.println("Largest Element : " + largestElement(nums));

	}

	// in first pass the largest element at its correct position
	private static int largestElement(int[] nums) {

		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				swap(nums, i, i + 1);
			}
		}
		return nums[n - 1];
	}

	// swaps 2 elements
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
