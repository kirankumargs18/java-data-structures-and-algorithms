package com.kirangs;

public class SecondLargestElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = { 6, 7, 8, 5, 1, 9 };

		System.out.println(secondLargest(arr));

	}

	
	// Time : O(n)
	// Space : O(1)
	private static int secondLargest(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
		}
		return secondMax;
	}

}
