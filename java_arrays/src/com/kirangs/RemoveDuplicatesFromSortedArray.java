package com.kirangs;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6 };
		removeDuplicates(arr);
	}

	// Time : O(n)
	// Space : O(n)
	private static void removeDuplicatesWithExtraSpace(int[] arr) {

		int n = arr.length;
		int[] temp = new int[n];
		temp[0] = arr[0];
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] != temp[j]) {
				temp[++j] = arr[i];
			}
		}
		printArray(temp, j + 1);
	}

	
	// Time : O(n)
	// Space : O(1)
	private static void removeDuplicates(int[] arr) {

		int n = arr.length;
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[j]) {
				arr[++j] = arr[i];
			}
		}
		printArray(arr, j + 1);
	}

	private static void printArray(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
