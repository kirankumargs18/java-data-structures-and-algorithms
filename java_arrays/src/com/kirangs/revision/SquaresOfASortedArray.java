package com.kirangs.revision;

import java.util.Arrays;

public class SquaresOfASortedArray {

	public static void main(String[] args) {

		int[] nums = { -5, -3, -2, -1 };
		int n = nums.length;
		int[] res = sortedSquares(nums);
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
		}

	}

	// Time : O(n*logn + n)
	// Space : O(1)
	private static int[] naiveSolution(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	// Time : O(n)
	// Space : O(n)
	private static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int head = 0;
		int tail = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			int headSquare = nums[head] * nums[head];
			int tailSquare = nums[tail] * nums[tail];
			if (headSquare > tailSquare) {
				result[i] = headSquare;
				head++;
			} else {
				result[i] = tailSquare;
				tail--;
			}
		}
		return result;
	}
}
