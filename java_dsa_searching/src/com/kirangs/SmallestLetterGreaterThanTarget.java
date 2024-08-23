package com.kirangs;

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {

		char[] letters = { 'c', 'f', 'j' };
		int[] res = new int[letters.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = letters[i];
		}
		printArray(res);
		char target = 'a';
		System.out.println(nextGreatestLetter(letters, target));

	}

	private static char nextGreatestLetter(char[] letters, char target) {

		char res = 123;
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > target && (letters[i] < res)) {
				res = letters[i];
			}
		}
		if (res == 123) {
			return letters[0];
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
