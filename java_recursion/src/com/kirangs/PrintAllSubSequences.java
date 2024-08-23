package com.kirangs;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequences {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 2 };
		System.out.println(solution(nums));

	}

	private static List<List<Integer>> solution(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		if (nums.length == 0) {
			return result;
		}
		subsequences(0, nums, new ArrayList<>(), result);
		return result;
	}

	// Time : O(n*2^n)
	// Space : O(n)
	private static void subsequences(int index, int[] nums, List<Integer> list, List<List<Integer>> result) {

		if (index >= nums.length) {
			result.add(new ArrayList<>(list));
			return;
		}
		list.add(nums[index]);
		subsequences(index + 1, nums, list, result);
		list.remove(list.size() - 1);
		subsequences(index + 1, nums, list, result);
	}
}
