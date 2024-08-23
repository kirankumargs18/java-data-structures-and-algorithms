package com.kirangs;

public class FrequenciesInASortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10, 10 };
		printFrequencies(arr);
	}

	private static void printFrequencies(int[] arr) {

		int n = arr.length;
		int freq = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] == arr[i]) {
				freq++;
			} else {
				System.out.println("Frequency of " + arr[i - 1] + " is " + freq);
				freq = 1;
			}
		}
		System.out.println("Frequency of " + arr[n - 1] + " is " + freq);
	}
}
