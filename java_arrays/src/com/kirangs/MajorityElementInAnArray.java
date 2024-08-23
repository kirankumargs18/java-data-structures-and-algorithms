package com.kirangs;

public class MajorityElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 8, 3, 4, 8, 8 };
		System.out.println(majorityNaive(arr));

		int[] arr1 = { 3, 7, 4, 7, 7, 5 };
		System.out.println(majorityNaive(arr1));

		int[] arr2 = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		System.out.println(majority(arr2));

		int[] arr3 = { 3, 3, 4, 2, 4, 4, 2, 4 };
		System.out.println(majority(arr3));

		int[] nums = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
		System.out.println(majority(nums));

	}

	// Moore's voting algorithm
	// Time : O(n)
	private static int majority(int[] nums) {

		int n = nums.length;

		int majority = nums[0];
		int count = 1;

		for (int i = 1; i < n; i++) {
			if (majority == nums[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				majority = nums[i];
				count = 1;
			}
		}

		count = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == majority) {
				count++;
			}
			if (count > (n / 2)) {
				return majority;
			}
		}
		return -1;
	}

	// Time : O(n^2)
	// Space : O(1)
	private static int majorityNaive(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count > (n / 2)) {
				return arr[i];
			}
		}
		return -1;
	}
}
