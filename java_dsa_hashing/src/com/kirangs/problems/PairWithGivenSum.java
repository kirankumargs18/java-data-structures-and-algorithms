package com.kirangs.problems;

import java.util.HashSet;

public class PairWithGivenSum {

	public static void main(String[] args) {

		int[] nums1 = { 2, 1, 6, 3 };
		int sum1 = 6;
		System.out.println(pairWithGivenSum(nums1, sum1));
		System.out.println(naiveSolution(nums1, sum1));

	}

	private static boolean naiveSolution(int[] nums, int sum) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}

	// Time : O(N)
	// Space : O(N)
	private static boolean pairWithGivenSum(int[] nums, int sum) {

		HashSet<Integer> hashSet = new HashSet<>();
		for (int i : nums) {
			if (hashSet.contains(sum - i)) {
				return true;
			} else {
				hashSet.add(i);
			}
		}
		return false;
	}
}
