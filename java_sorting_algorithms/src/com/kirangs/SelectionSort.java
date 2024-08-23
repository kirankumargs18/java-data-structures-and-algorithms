package com.kirangs;

public class SelectionSort {

	public static void main(String[] args) {

		int[] nums = { 4, 3, 2, 1, 7, 6, 5 };
		selectionSort(nums);
		printArray(nums);

	}

	// Time : O(n*n)
	// Space : O(1)
	private static void selectionSort(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			swap(nums, i, min);
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
