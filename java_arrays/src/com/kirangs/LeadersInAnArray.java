package com.kirangs;

public class LeadersInAnArray {

	public static void main(String[] args) {

		int[] arr = { 16, 17, 4, 3, 5, 2 };
		printLeaders(arr);
		printLeadersInAnArray(arr);
		int[] arr1 = { 8, 11, 5, 11, 7, 6, 3 };
		printLeaders(arr1);
		printLeadersInAnArray(arr1);
		int[] arr2 = { 5, 6, 7 };
		printLeaders(arr2);
		printLeadersInAnArray(arr2);
	}

	// Optimal solution will be travesing array from right side
	// Time : O(n)
	private static void printLeadersInAnArray(int[] arr) {

		int n = arr.length;
		int currLeader = arr[n - 1];
		System.out.print(currLeader + " ");
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > currLeader) {
				currLeader = arr[i];
				System.out.print(currLeader + " ");
			}
		}
		System.out.println();
	}

	// Time : O(n^2)
	private static void printLeaders(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
