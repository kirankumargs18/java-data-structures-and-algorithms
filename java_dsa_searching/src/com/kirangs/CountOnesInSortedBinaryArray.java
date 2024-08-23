package com.kirangs;

public class CountOnesInSortedBinaryArray {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 0, 1, 1, 1, 1 };
		System.out.println(onesInSortedBinaryArray(nums));
		System.out.println(naiveSolution(nums));

		int[] nums1 = { 1, 1, 1, 1, 1 };
		System.out.println(onesInSortedBinaryArray(nums1));
		System.out.println(naiveSolution(nums1));

		int[] nums3 = { 0, 0, 0, 0 };
		System.out.println(onesInSortedBinaryArray(nums3));
		System.out.println(naiveSolution(nums3));

	}

	// calculate first occurrence of 1 and do n-firstOccurence

	// O(logN)
	private static int onesInSortedBinaryArray(int[] nums) {

		int n = nums.length;
		if (nums[n - 1] == 0) {
			return 0;
		}
		if (nums[0] == 1) {
			return n;
		}
		int firstOccurence = -1;
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (nums[m] == 1) {
				if (nums[m - 1] != 1) {
					firstOccurence = m;
					break;
				} else {
					h = m - 1;
				}
			} else {
				l = m + 1;
			}
		}
		return n - firstOccurence;
	}

	
	//Naive solution
	//O(N)
	//O(1)
	private static int naiveSolution(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] == 1) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}
