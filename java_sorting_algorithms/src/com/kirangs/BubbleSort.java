package com.kirangs;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		optimalBubbleSort(nums);
		printArray(nums);
	}

	// Time : O(n*n)
	// Space : O(1)
	private static void bubbleSort(int[] nums) {
		int n = nums.length;
		for (int pass = n - 1; pass >= 0; pass--) {
			for (int i = 0; i <= pass - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					swap(nums, i, i + 1);
				}
			}
		}
	}

	// even if we pass sorted array the above method still does all comparisons
	// This we can avoid by checking whether swap performed in particular pass or
	// not. If no swap performed that means all elements are at correct position
	private static void optimalBubbleSort(int[] nums) {

		int n = nums.length;
		for (int pass = n - 1; pass >= 0; pass--) {
			boolean swapped = false;
			for (int i = 0; i <= pass - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					swap(nums, i, i + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	// swaps 2 elements
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	// print array in [1,2,3,..] format
	private static void printArray(int[] nums) {
		int n = nums.length;
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(nums[i]);
			} else {
				System.out.print(nums[i] + ",");
			}
		}
		System.out.print("]");
		System.out.println();
	}
}
