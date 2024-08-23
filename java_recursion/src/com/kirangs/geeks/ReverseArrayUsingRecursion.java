package com.kirangs.geeks;

public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
//		reverse(0, arr.length - 1, arr);
		reverseOne(0, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void reverse(int i, int j, int[] arr) {
		
		if (i >= j) {
			return;
		}
		swap(i, j, arr);
		reverse(i+1, j-1, arr);
	}
	
	//using single i variable
	private static void reverseOne(int i, int[] arr) {

		int n = arr.length;
		if (i >= (n / 2)) {
			return;
		}
		swap(i, n - i - 1, arr);
		reverseOne(i + 1, arr);
	}

	private static void swap(int i, int j, int[] arr) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
