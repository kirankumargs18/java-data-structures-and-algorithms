package com.kirangs.revision;

public class RemoveDuplicateElementsFromSortedArray {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 2, 3 };
		System.out.println(naiveSolution(nums));
		System.out.println(optimalSolution(nums));

	}

	private static int optimalSolution(int[] nums) {

		int n = nums.length;
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}

	// Time : O(N+N)
	// Space : O(N)
	private static int naiveSolution(int[] nums) {

		int n = nums.length;
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1 || nums[i] != nums[i + 1]) {
				temp[j] = nums[i];
				j++;
			}
		}
		for (int i = 0; i < j; i++) {
			nums[i] = temp[i];
		}
		return j;
	}

}
