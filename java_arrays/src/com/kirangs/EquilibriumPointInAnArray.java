package com.kirangs;

//724. Find Pivot Index
//1991. Find the Middle Index in Array
public class EquilibriumPointInAnArray {

	public static void main(String[] args) {

		int[] nums = { 2, 1, -1 };
		System.out.println(betterSolution(nums));

	}

	// compute total sum of all the elements
	// in each iteration to compute rsum just do totalsum - nums[i]
	// to compute lsum, lsum = lsum + nums[i]

	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(int[] nums) {

		int n = nums.length;
		if (n <= 1) {
			return 0;
		}
		int rsum = nums[0];
		for (int i = 1; i < n; i++) {
			rsum = rsum + nums[i];
		}
		int lsum = 0;
		for (int i = 0; i < n; i++) {
			rsum = rsum - nums[i];
			if (lsum == rsum) {
				return i;
			}
			lsum = lsum + nums[i];
		}
		return -1;
	}

//	Time : O(N)
//	Space : O(N+N)
	private static int betterSolution(int[] nums) {

		int n = nums.length;
		if (n <= 1) {
			return 0;
		}
		int[] lsum = new int[n];
		lsum[0] = nums[0];
		int[] rsum = new int[n];
		rsum[n - 1] = nums[n - 1];
		for (int i = 1; i < n; i++) {
			lsum[i] = lsum[i - 1] + nums[i];
		}
		for (int i = n - 2; i >= 0; i--) {
			rsum[i] = rsum[i + 1] + nums[i];
		}
		int left = 0;
		int right = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				left = 0;
				right = rsum[i + 1];
			} else if (i == n - 1) {
				right = 0;
				left = lsum[i - 1];
			} else {
				left = lsum[i - 1];
				right = rsum[i + 1];
			}
			if (left == right) {
				return i;
			}
		}
		return -1;
	}

}
