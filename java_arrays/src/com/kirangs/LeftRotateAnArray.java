package com.kirangs;

public class LeftRotateAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		leftRotateArray(arr);
		printArray(arr);

	}

//	1 2 3 4 5
//	2 3 4 5 1
	private static void leftRotateArray(int[] arr) {

		int n = arr.length;
		int first = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = first;
	}

	private static void printArray(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
