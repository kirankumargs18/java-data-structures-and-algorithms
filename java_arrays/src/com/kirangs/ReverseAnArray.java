package com.kirangs;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 5, 1, 9 };
		printArray(arr);
		reverseArray(arr);
		printArray(arr);

	}

//	Time Complexity : O(n)
	private static void reverseArray(int[] arr) {

		int n = arr.length;
		if (n == 0 || n == 1) {
			return;
		}
		for (int i = 0; i < n; i++) {
			if (i >= (n / 2)) {
				return;
			}
			swap(arr, i);
		}

	}

	private static void swap(int[] arr, int i) {

		int n = arr.length;
		int temp = arr[i];
		arr[i] = arr[n - i - 1];
		arr[n - i - 1] = temp;
	}

	private static void printArray(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
