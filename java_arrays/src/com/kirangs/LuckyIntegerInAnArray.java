package com.kirangs;

public class LuckyIntegerInAnArray {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 2, 4, 1, 3, 4, 3 };
		System.out.println(luckyInteger(arr));

	}

	private static int luckyIntegerInSortedArray(int[] arr) {

		int n = arr.length;
		int freq = 1;
		int luckyNumber = -1;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] != arr[i]) {
				if (freq == arr[i - 1]) {
					luckyNumber = Math.max(arr[i - 1], luckyNumber);
					freq = 1;
				}
			} else {
				freq++;
			}
		}
		if (freq == arr[n - 1]) {
			luckyNumber = Math.max(arr[n - 1], luckyNumber);
		}
		return luckyNumber;
	}

	private static int luckyInteger(int[] arr) {

		int n = arr.length;
		int luckyNumber = -1;
		int[] freq = new int[501];
		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] == freq[arr[i]]) {
				luckyNumber = Math.max(arr[i], luckyNumber);
			}
		}
		return luckyNumber;
	}
}
