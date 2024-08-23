package com.kirangs;

public class MaximumCircularSubArraySum {

	public static void main(String[] args) {

		int[] arr = { 5, -2, 3, 4 };
		System.out.println(maxCircularSubArraySum(arr));

	}

	// Time : O(n^2)
	// Space : O(1)
	private static int maxCircularSubArraySum(int[] arr) {

		int n = arr.length;

		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int sum = arr[i];
			int currSum = arr[i];
			for (int j = 1; j < n; j++) {
				int index = (i + j) % n;
				currSum = currSum + arr[index];
				sum = Math.max(currSum, sum);
			}
			res = Math.max(res, sum);
		}
		return res;
	}

}
