package com.kirangs;

public class MaximumEvenOddLengthArray {

	public static void main(String[] args) {

		int[] arr = { 8, 10, 2, 3, 4, 5, 6, 8, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] arr1 = { 2, 4, 6, 8 };
		System.out.println(maxLength(arr));
		System.out.println(maxLength(arr1));
	}

	// Time : O(n)
	// Space : O(1)
	private static int maxLength(int[] arr) {

		int n = arr.length;
		int res = 1;
		int curr = 1;
		for (int i = 1; i < n; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
				curr++;
				res = Math.max(curr, res);
			} else {
				curr = 1;
			}
		}
		return res;
	}

	// Time : O(n^2)
	// Space : O(1)
	private static int maxLengthNaive(int[] arr) {

		int n = arr.length;

		int res = 1;

		for (int i = 0; i < n; i++) {

			int curr = 1;
			for (int j = i + 1; j < n; j++) {

				if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
					curr++;
				} else {
					break;
				}
				res = Math.max(curr, res);
			}
		}
		return res;
	}

}
