package com.kirangs;

public class MaximumCountOfPositiveAndNegativeIntegers {

	public static void main(String[] args) {

		int[] nums = { -2, -1, -1, 1, 2, 3 };
		System.out.println(maxCount(nums));
		System.out.println(naiveSolution(nums));
		int[] nums1 = { -3, -2, -1, 0, 0, 1, 2 };
		System.out.println(maxCount(nums1));
		System.out.println(naiveSolution(nums1));

		int[] nums2 = { 5, 20, 66, 1314 };
		System.out.println(maxCount(nums2));
		System.out.println(naiveSolution(nums2));

		int[] nums3 = { -2, -1, -1, 0, 0, 0 };
		System.out.println(maxCount(nums3));
		System.out.println(naiveSolution(nums3));
	}

	// O(logN+logN)--> O(logN)
	// O(1)
	private static int maxCount(int[] nums) {

		int n = nums.length;
		if (nums[0] == 0 && nums[n - 1] == 0) {
			return 0;
		}
		if (nums[0] > 0 || nums[n - 1] < 0) {
			return n;
		}
		if (firstOccurence(nums) < 0) {
			return lastOccurence(nums) + 1;
		}
		return Math.max(lastOccurence(nums) + 1, n - firstOccurence(nums));
	}

	private static int lastOccurence(int[] nums) {

		int n = nums.length;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] < 0) {
				if (nums[m + 1] >= 0) {
					return m;
				} else {
					l = m + 1;
				}
			} else {
				h = m - 1;
			}
		}
		return -1;
	}

	private static int firstOccurence(int[] nums) {
		int n = nums.length;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] == 0) {
				l = m + 1;
			} else if (nums[m] > 0) {
				if (nums[m - 1] > 0) {
					h = m - 1;
				} else {
					return m;
				}
			} else {
				l = m + 1;
			}
		}
		return -1;
	}

	// O(N)
	// O(1)
	private static int naiveSolution(int[] nums) {

		int positiveNumbers = 0;
		int neagtiveNumbers = 0;
		for (int num : nums) {
			if (num < 0) {
				neagtiveNumbers++;
			}
			if (num > 0) {
				positiveNumbers++;
			}
		}
		return Math.max(neagtiveNumbers, positiveNumbers);
	}
}
