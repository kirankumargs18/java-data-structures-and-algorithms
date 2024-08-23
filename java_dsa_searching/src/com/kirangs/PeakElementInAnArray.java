package com.kirangs;

//162. Find Peak Element
//This is a rare where we will binary search on unsorted array
public class PeakElementInAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(naiveSolution(nums));
		System.out.println(optimalSolution(nums));

		int[] nums1 = { 1, 2, 3, 1 };
		System.out.println(naiveSolution(nums1));
		System.out.println(optimalSolution(nums1));

	}

	// O(logN)
	// O(1)
	private static int optimalSolution(int[] nums) {
		int n = nums.length;
		if (n == 1) {
			return 0;
		}
		if (nums[0] > nums[1]) {
			return 0;
		}
		if (nums[n - 1] > nums[n - 2]) {
			return n - 1;
		}

		int l = 1;
		int h = n - 2;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) {
				return m;
			} else if (nums[m - 1] < nums[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return -1;
	}

	// NaiveSolution
	// O(N)
	// O(1)
	// if i=0 don't check left side and if i=n-1 don't check right side
	private static int naiveSolution(int[] nums) {
		int n = nums.length;
		int res = -1;
		for (int i = 0; i < n; i++) {
			if ((i == 0 || nums[i] > nums[i - 1]) && (i == n - 1 || nums[i] > nums[i + 1])) {
				res = i;
			}
		}
		return res;
	}
}
