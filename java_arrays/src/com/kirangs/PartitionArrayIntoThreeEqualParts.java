package com.kirangs;

public class PartitionArrayIntoThreeEqualParts {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };
		System.out.println(optimalSolution(arr));

		int[] arr1 = { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 };
		System.out.println(optimalSolution(arr1));

		int[] arr2 = { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 };
		System.out.println(optimalSolution(arr2));
	}

	// Time : O(N+N) --> O(N)
	// Space : O(1)
	private static boolean optimalSolution(int[] arr) {

		int n = arr.length;
		int sum = arr[0];
		for (int i = 1; i < n; i++) {
			sum += arr[i];
		}
		if (sum % 3 != 0) {
			return false;
		}
		int requiredSum = sum / 3;
		int count = 0;
		int currSum = 0;
		for (int i = 0; i < n; i++) {
			currSum = currSum + arr[i];
			if (currSum == requiredSum) {
				count++;
				currSum = 0;
			}
			if (count == 3) {
				return true;
			}
		}
		return false;
	}
}
