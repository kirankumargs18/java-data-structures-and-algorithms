package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintOnlyOneSubsequenceWithSumKMethodTwo {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1 };
		Arrays.sort(nums);
		System.out.println(solution(nums));
	}

	private static List<Integer> solution(int[] nums) {

		List<Integer> list = new ArrayList<>();
		if (nums.length == 0) {
			return list;
		}
		subsequences(0, nums, list, 0, 2);
		return list;
	}

	// Time : O(n*2^n)
	// Space : O(n)
	private static boolean subsequences(int index, int[] nums, List<Integer> list, int sum, int k) {

		if (index >= nums.length) {
			if (sum == k) {
				return true;
			}
			return false;
		}
		list.add(nums[index]);
		sum = sum + nums[index];
		if (subsequences(index + 1, nums, list, sum, k)) {
			return true;
		}
		sum = sum - nums[index];
		list.remove(list.size() - 1);
		if (subsequences(index + 1, nums, list, sum, k)) {
			return true;
		}
		return false;
	}

}
