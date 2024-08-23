package com.kirangs.revision;

public class SortTransformedArray {

	public static void main(String[] args) {

		int[] nums = { -4, -2, 2, 4 };
		int n = nums.length;
		int a = -1;
		int b = 3;
		int c = 5;
		int[] result = transformedArray(nums, a, b, c);
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

	// Time : O(n)
	// Space : O(n)
	private static int[] transformedArray(int[] nums, int a, int b, int c) {

		int n = nums.length;
		int[] result = new int[n];
		int head = 0;
		int tail = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			int headValue = calculateValue(nums[head], a, b, c);
			int tailValue = calculateValue(nums[tail], a, b, c);
			if (headValue > tailValue) {
				result[i] = headValue;
				head++;
			} else {
				result[i] = tailValue;
				tail--;
			}
		}
		return result;

	}

	// Time : O(1)
	// Space :O(1)
	private static int calculateValue(int x, int a, int b, int c) {
		return (x * x * a) + (x * b) + c;
	}

}
