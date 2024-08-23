package com.kirangs;

public class SearchInAnInfiniteSortedArray {

	public static void main(String[] args) {

		int[] nums = { 9, 11, 17, 26, 37, 52, 89, 111, 129, 144, 198 };
		System.out.println(naiveSolution(nums, 37));
		System.out.println(naiveSolution(nums, 39));
		System.out.println(optimalSolution(nums, 37));
		System.out.println(optimalSolution(nums, 39));

	}

	// Optimal Solution
	// random find some position where element at which is equal or greaterThan
	// search element
	// then apply binary search for that portion

	// Time : O(logN)
	// Space : O(1)
	private static int optimalSolution(int[] nums, int target) {
		
		if (nums[0] == target) {
			return 0;
		}
		int i = 1;
		while (nums[i] < target) {
			i = i * 2;
		}
		if (nums[i] == target) {
			return i;
		}
		return binarySearch(nums, i / 2 + 1, i - 1, target);
	}
	
	private static int binarySearch(int[] nums, int low, int high, int target) {

		int l = low;
		int h = high;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] == target) {
				return m;
			} else if (nums[m] > target) {
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}

	// Naive solution (linear search)
	// O(Position)
	// O(1)
	private static int naiveSolution(int[] nums, int target) {
		int i = 1;
		while (true) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] > target) {
				return -1;
			}
			i++;
		}
	}
}
