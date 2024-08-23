package com.kirangs;

public class FindIfThereisPairWithGivenSumInSortedArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(pairWithGiveSum(numbers, target));

		int[] numbers1 = { 2, 3, 4 };
		int target1 = 6;
		System.out.println(pairWithGiveSum(numbers1, target1));

		int[] numbers2 = { -1, 0 };
		int target2 = -1;
		System.out.println(pairWithGiveSum(numbers2, target2));

	}

	// O(N)
	// O(1)
	private static int[] pairWithGiveSum(int[] numbers, int target) {

		int n = numbers.length;
		int l = 0;
		int r = n - 1;
		while (l < r) {
			int sum = numbers[l] + numbers[r];
			if (sum == target) {
				return new int[] { l + 1, r + 1 };
			} else if (sum > target) {
				r = r - 1;
			} else {
				l = l + 1;
			}
		}
		return new int[] { -1, -1 };
	}

}
