package com.kirangs;

public class AllocateMinimumNumberOfPages {

	public static void main(String[] args) {

		int[] arr1 = { 12, 34, 67, 90 };
		int k1 = 2;
		System.out.println(maxPages(arr1, k1));

		int[] arr2 = { 25, 46, 28, 49, 24 };
		int k2 = 4;
		System.out.println(maxPages(arr2, k2));

	}

	// Time : O(N*log(sum(arr))
	// Space : O(1)
	private static int maxPages(int[] arr, int k) {

		int n = arr.length;
		int l = arr[0];
		int h = 0;
		int res = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] < l) {
				l = arr[i];
			}
			h = h + arr[i];
		}
		while (l <= h) {
			int m = (l + h) / 2;
			if (isPossible(arr, k, m)) {
				res = m;
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		return res;
	}

	private static boolean isPossible(int[] arr, int k, int m) {

		int n = arr.length;
		int students = 1;
		int pagesAllocated = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > m) {
				return false;
			}
			if (pagesAllocated + arr[i] <= m) {
				pagesAllocated = pagesAllocated + arr[i];
			} else {
				students++;
				if (students > k) {
					return false;
				}
				pagesAllocated = arr[i];
			}
		}
		return true;
	}
}
