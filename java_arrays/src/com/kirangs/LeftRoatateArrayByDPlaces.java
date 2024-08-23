package com.kirangs;

public class LeftRoatateArrayByDPlaces {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
//		leftRotateByDPlaces(arr, 2);
//		leftRotateByDPlacesWithDExtraSpace(arr, -4);
//		leftRotateByDPlacesWithDExtraSpace(arr, 2);
		leftRotateByDPlacesByArrayReversal(arr, 6);
		printArray(arr);
	}

	// Time : O(d*n)
	// Space : O(1)
	// Note : Still we can reduce time complexity to O(n) but we have to use space
	// of O(d)
	private static void leftRotateByDPlaces(int[] arr, int d) {

		int n = arr.length;
		d = d % n;
		for (int i = 1; i <= d; i++) {
			leftRotateArray(arr);
		}
	}

	// Time : O(n)
	// Space : O(d)
	private static void leftRotateByDPlacesWithDExtraSpace(int[] arr, int d) {

		int n = arr.length;
		if (d < 0) {
			d = d + n;
		}
		d = d % n;
		if (d == 0) {
			return;
		}
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}
		for (int i = 0; i < d; i++) {
			arr[n - d + i] = temp[i];
		}
	}

	private static void leftRotateByDPlacesByArrayReversal(int[] arr, int d) {

		int n = arr.length;
		d = d % n;
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);
	}

	private static void reverseArray(int[] arr, int i, int j) {

		int n = arr.length;
		if (n == 0 || n == 1) {
			return;
		}
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

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
