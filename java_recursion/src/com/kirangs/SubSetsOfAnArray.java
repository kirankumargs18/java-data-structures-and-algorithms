package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsOfAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2 };
		System.out.println(subsetsWithDup(nums));
	}

	private static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> answerList = new ArrayList<>();
		subsets(0, nums, new ArrayList<>(), answerList);
		return answerList;
	}

	private static void subsets(int index, int[] nums, List<Integer> list, List<List<Integer>> ansList) {

		ansList.add(new ArrayList<>(list));
		for (int i = index; i < nums.length; i++) {
			if (i != index && nums[i] == nums[i - 1]) {
				continue;
			}
			list.add(nums[i]);
			subsets(i + 1, nums, list, ansList);
			list.remove(list.size() - 1);
		}
	}
}
