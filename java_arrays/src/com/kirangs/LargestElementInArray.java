package com.kirangs;

public class LargestElementInArray {

	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 5, 1, 9 };

		System.out.println(largest(arr));

	}

	// Time : O(n)
	// Space : O(1)
	private static int largest(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
}
