package com.kirangs;

//852. Peak Index in a Mountain Array
public class PeakIndexInMountainArray {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0 };
		System.out.println(peakIndex(arr));

		int[] arr1 = { 0, 2, 1, 0 };
		System.out.println(peakIndex(arr1));

		int[] arr2 = { 0, 10, 5, 2 };
		System.out.println(peakIndex(arr2));

	}

	// O(logN)
	// O(1)
	private static int peakIndex(int[] arr) {

		int n = arr.length;
		int l = 1;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
				return m;
			} else if (arr[m] > arr[m - 1]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return -1;
	}

}
