package com.kirangs;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		reverse(nums, 0);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	// Time : O(N)
	// Space : O(N)
	private static void reverse(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		swap(arr, l, r);
		reverse(arr, l + 1, r - 1);
	}

	// using single variable
	private static void reverse(int[] arr, int l) {
		if (l >= arr.length / 2) {
			return;
		}
		swap(arr, l, arr.length - l - 1);
		reverse(arr, l + 1, arr.length - l - 2);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
