package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllSubsequencesWithDuplicateValues {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 1 };
		System.out.println(solution(nums));
	}

	private static List<List<Integer>> solution(int[] nums) {

		Arrays.sort(nums);
		Set<List<Integer>> resultSet = new HashSet<>();
		if (nums.length == 0) {
			return new ArrayList<>(resultSet);
		}
		subsequences(0, nums, new ArrayList<>(), resultSet);
		return new ArrayList<>(resultSet);
	}

	// Time : O(n*2^n)
	// Space : O(n)
	private static void subsequences(int index, int[] nums, List<Integer> list, Set<List<Integer>> resultSet) {

		if (index >= nums.length) {
			resultSet.add(new ArrayList<>(list));
			return;
		}
		list.add(nums[index]);
		subsequences(index + 1, nums, list, resultSet);
		list.remove(list.size() - 1);
		subsequences(index + 1, nums, list, resultSet);
	}

}
