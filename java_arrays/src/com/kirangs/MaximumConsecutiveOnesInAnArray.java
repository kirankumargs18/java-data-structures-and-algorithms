package com.kirangs;

public class MaximumConsecutiveOnesInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 1, 1, 1, 0, 1, 1 };
		System.out.println("Maximum Consecutive Ones : " + maxOnes(arr));

	}

	// Time : O(n)
	// Space : O(1)
	private static int maxOnes(int[] arr) {

		int n = arr.length;
		int freq = 0;
		int currFreq = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				currFreq++;
				freq = Math.max(freq, currFreq);
			} else {
				currFreq = 0;
			}
		}
		return freq;
	}

}
