package com.kirangs;

//[8,5,7,3,2]
public class InsertionSort {

	public static void main(String[] args) {

		int[] nums = { 8, 5, 7, 3, 2 };
		insertionSort(nums);
		printArray(nums);

	}

	// Time : O(n*n)
	// space : O(1)
	private static void insertionSort(int[] nums) {
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			int x = nums[i];
			int j = i - 1;
			while (j > -1 && nums[j] > x) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = x;
		}
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
