package com.kirangs.revision;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int[] res = optimalSolution(nums);
		printArray(res);
	}

	private static int[] optimalSolution(int[] nums) {

		int n = nums.length;
		int[] res = new int[n];
		int left = 1;
		for (int i = 0; i < n; i++) {
			res[i] = left;
			left = left * nums[i];
		}
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			res[i] = res[i] * right;
			right = right * nums[i];
		}
		return res;
	}

	// Time : O(n*n)
	// Space : O(1)
	private static int[] naiveSolution(int[] nums) {

		int n = nums.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int prod = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					prod = prod * nums[j];
				}
			}
			res[i] = prod;
		}
		return res;
	}

	// Time : O(3*n)
	// Space : (2*n)
	private static int[] productOfArrayExceptSelf(int[] nums) {

		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = left[i] * right[i];
		}
		return res;
	}

	// print array in [1,2,3,..] format
	private static void printArray(int[] nums) {
		int n = nums.length;
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(nums[i]);
			} else {
				System.out.print(nums[i] + ",");
			}
		}
		System.out.print("]");
		System.out.println();
	}

}
