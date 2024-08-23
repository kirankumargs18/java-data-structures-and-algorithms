package com.kirangs;

public class CheckIfArrayIsSortedOrNot {

	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 5, 1, 9 };

//		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(isSorted(arr));
	}

	
	// Time : O(n)
	// Space : O(1)
	private static boolean isSorted(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		if (arr[arr.length - 2] > arr[arr.length - 1]) {
			return false;
		}
		return true;

	}

	
	// Time : O(n)
	// Space : O(1)
	private static boolean isSortedOrNot(int[] arr) {

		int n = arr.length;
		if (n == 0 || n == 1) {
			return true;
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
