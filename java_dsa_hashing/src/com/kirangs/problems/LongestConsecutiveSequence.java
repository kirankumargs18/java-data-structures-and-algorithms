package com.kirangs.problems;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0, 1 };
		System.out.println(betterSolution(nums));
		System.out.println(optimalSolution(nums));
	}

	// Idea: use hash set and put all elements in hash set
	// now iterate over hash set check if curr element is starting point of
	// subsequence, if it check curr+1, curr+2... exists and hash set and increase
	// count

	private static int optimalSolution(int[] nums) {

		int res = 0;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int x : nums) {
			hashSet.add(x);
		}
		for (Integer x : hashSet) {
			if (!hashSet.contains(x - 1)) {
				int curr = 1;
				while (hashSet.contains(x + curr)) {
					curr++;
				}
				res = Math.max(res, curr);
			}
		}
		return res;
	}

	// Time : O(NlogN + N)
	// Space : O(1)
	private static int betterSolution(int[] nums) {

		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 1;
		int currCount = 1;
		for (int i = 1; i < n; i++) {
			if (nums[i] == nums[i - 1] + 1) {
				currCount++;
			} else if (nums[i] != nums[i - 1]) {
				count = Math.max(currCount, count);
				currCount = 1;
			}
		}
		return Math.max(count, currCount);
	}
}
