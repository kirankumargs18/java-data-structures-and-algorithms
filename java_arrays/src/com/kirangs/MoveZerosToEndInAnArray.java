package com.kirangs;

public class MoveZerosToEndInAnArray {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 2, 0, 0, 3, 4, 5 };
		moveZerosToEndWithExtraSpace(arr);
		moveZerosToEnd(arr);

	}

	private static void moveZerosToEndWithExtraSpace(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		printArray(temp);
	}

	private static void moveZerosToEnd(int[] arr) {
		
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					if (arr[j] != 0) {
						swap(arr, i, j);
						break;
					}
				}
			}
		}
		printArray(arr);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
