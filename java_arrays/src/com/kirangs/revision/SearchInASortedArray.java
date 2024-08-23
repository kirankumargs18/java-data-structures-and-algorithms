package com.kirangs.revision;

public class SearchInASortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6 };
		System.out.println(optimalSolution(arr, 6));

	}

	private static int optimalSolution(int[] arr, int k) {
		int n = arr.length;
		int l = 0;
		int r = n - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] == k) {
				return n - m;
			} else if (arr[m] > k) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}
}
