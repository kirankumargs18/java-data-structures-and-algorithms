package com.kirangs;

public class MaximumSumSubArrayOfSizeK {

	public static void main(String[] args) {

		int[] nums = { 100, 200, 300, 400 };
		System.out.println(naiveSolution(nums, 2));

		int[] nums1 = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
		System.out.println(naiveSolution(nums1, 4));
		
		System.out.println(optimalSolution(nums, 2));
		System.out.println(optimalSolution(nums1, 4));

	}

	// Sliding window technique (constant window)
	// Time : O(n)
	// Space : O(1)
	private static int optimalSolution(int[] nums, int k) {

		int n = nums.length;
		int currSum = 0;
		for (int i = 0; i < k; i++) {
			currSum += nums[i];
		}
		int maxSum = currSum;
		for (int i = k; i < n; i++) {
			currSum = currSum + nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

	// Time : O(n^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums, int k) {

		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int currSum = 0;
			int count = 0;
			for (int j = i; j < n; j++) {
				if (count > k) {
					break;
				}
				currSum = currSum + nums[j];
				count++;
				if (count == k) {
					maxSum = Math.max(maxSum, currSum);
				}
			}
		}
		return maxSum;
	}

}
