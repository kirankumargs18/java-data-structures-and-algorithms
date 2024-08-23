package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubSequencesWithSumK {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1 };
		Arrays.sort(nums);
		System.out.println(solution(nums));

	}

	private static List<List<Integer>> solution(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		if (nums.length == 0) {
			return result;
		}
		subsequences(0, nums, new ArrayList<>(), result, 0, 2);
		return result;
	}

	// Time : O(n*2^n)
	// Space : O(n)
	private static void subsequences(int index, int[] nums, List<Integer> list, List<List<Integer>> result, int sum,
			int k) {

		if (index >= nums.length) {
			if (sum == k) {
				result.add(new ArrayList<>(list));
			}
			return;
		}
		list.add(nums[index]);
		sum = sum + nums[index];
		subsequences(index + 1, nums, list, result, sum, k);
		sum = sum - nums[index];
		list.remove(list.size() - 1);
		subsequences(index + 1, nums, list, result, sum, k);
	}
}
