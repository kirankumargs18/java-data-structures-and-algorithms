package com.kirangs;

public class MaximumDifferenceWithOrder {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		System.out.println(maxDifference(arr));
		System.out.println(maxDifferenceInAnArray(arr));
	}

	// Time : O(n)
	private static int maxDifferenceInAnArray(int[] arr) {

		int n = arr.length;
		int difference = Integer.MIN_VALUE;
		int minValue = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] >= minValue) {
				difference = Math.max(difference, arr[i] - minValue);
			}
			if (arr[i] <= minValue) {
				minValue = arr[i];
			}
		}
		return difference;
	}

	// Time : O(n^2)
	private static int maxDifference(int[] arr) {

		int n = arr.length;
		int difference = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] >= arr[i]) {
					difference = Math.max(difference, arr[j] - arr[i]);
				}
			}
		}
		return difference;
	}
}
