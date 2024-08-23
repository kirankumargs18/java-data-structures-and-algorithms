package com.kirangs;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		System.out.println(maxSum(arr));

		System.out.println(maxSumNaive(arr));

		System.out.println(maxSumTapAcademy(arr));

	}

	// Time : O(n^2)
	// Space : O(1)
	private static int maxSumNaive(int[] arr) {

		int res = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int curr = 0;
			for (int j = i; j < n; j++) {
				curr = curr + arr[j];
				res = Math.max(curr, res);
			}
		}
		return res;
	}
	

	// Time : O(n)
	// Space : O(1)
	private static int maxSum(int[] arr) {

		int n = arr.length;
		int res = arr[0];
		int maxEnding = arr[0];

		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}
	

	// [-2,-3,4,-1,-2,1,5,-3]
	// Kadane's algorithm
	private static int maxSumTapAcademy(int[] arr) {

		int n = arr.length;
		int maxSum = arr[0];
		int sum = arr[0];
		for (int i = 1; i < n; i++) {
			if (sum >= 0) {
				sum = sum + arr[i];
			} else {
				sum = arr[i];
			}
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
}
