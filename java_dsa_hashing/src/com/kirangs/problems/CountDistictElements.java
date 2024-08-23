package com.kirangs.problems;

import java.util.HashSet;

public class CountDistictElements {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 3, 3, 4 };
		System.out.println(naiveSolution(nums));
		System.out.println(betterSolution(nums));
	}

	// Time : O(N)
	// Space : O(N)
	private static int betterSolution(int[] nums) {

		int n = nums.length;
		HashSet<Integer> hashSet = new HashSet<>(n);
		for (int i = 0; i < n; i++) {
			hashSet.add(nums[i]);
		}
		return hashSet.size();
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums) {

		int n = nums.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			boolean visited = false;
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					visited = true;
					break;
				}
			}
			if (!visited) {
				res++;
			}
		}
		return res;
	}
}
