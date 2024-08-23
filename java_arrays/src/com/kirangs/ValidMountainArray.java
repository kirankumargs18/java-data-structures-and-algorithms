package com.kirangs;

public class ValidMountainArray {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1 };
		System.out.println(isValidMountain(arr));

		int[] arr2 = { 0, 3, 2, 1 };
		System.out.println(isValidMountain(arr2));

		int[] arr3 = { 3, 5, 5 };
		System.out.println(isValidMountain(arr3));

		int[] arr4 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(isValidMountain(arr4));

		int[] nums1 = { 14, 82, 89, 84, 79, 70, 70, 68, 67, 66, 63, 60, 58, 54, 44, 43, 32, 28, 26, 25, 22, 15, 13, 12,
				10, 8, 7, 5, 4, 3 };
		System.out.println(isValidMountain(nums1));
		System.out.println(optimalSolution(nums1));

	}

	// using 2 pointer approach
	private static boolean optimalSolution(int[] arr) {
		int n = arr.length;
		if (n < 3) {
			return false;
		}
		int l = 0;
		while (l < n - 1 && arr[l] < arr[l + 1]) {
			l = l + 1;
		}
		int r = n - 1;
		while (r > 0 && arr[r] < arr[r - 1]) {
			r = r - 1;
		}
		if (r > 0 && l < n - 1 && l == r) {
			return true;
		}
		return false;
	}

	private static boolean isValidMountain(int[] arr) {

		int n = arr.length;
		if (n < 3) {
			return false;
		}
		int l = 0;
		int h = n - 1;
		int peakIndex = -1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (m == 0 || m == n - 1) {
				return false;
			} else if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
				peakIndex = m;
				break;
			} else if (arr[m] > arr[m - 1]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}

		if (peakIndex == -1) {
			return false;
		}
		for (int i = 1; i <= peakIndex; i++) {
			if (arr[i - 1] >= arr[i]) {
				return false;
			}
		}
		for (int i = peakIndex + 1; i < n - 1; i++) {
			if (arr[i + 1] >= arr[i]) {
				return false;
			}
		}
		return true;
	}
}
