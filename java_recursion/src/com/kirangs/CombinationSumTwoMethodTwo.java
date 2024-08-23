package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwoMethodTwo {

	public static void main(String[] args) {

		int[] candidates = { 1, 1, 1, 2, 2 };
		int target = 4;
		System.out.println(combinationSum2(candidates, target));

	}

	private static List<List<Integer>> combinationSum2(int[] candidates, int target) {

		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		findCombinations(0, target, candidates, new ArrayList<>(), result);
		return result;
	}

	private static void findCombinations(int index, int target, int[] nums, List<Integer> list,
			List<List<Integer>> ans) {
		if (target == 0) {
			ans.add(new ArrayList<>(list));
		}
		for (int i = index; i < nums.length; i++) {
			if (i > index && nums[i] == nums[i - 1]) {
				continue;
			}
			if (nums[i] > target) {
				break;
			}
			list.add(nums[i]);
			findCombinations(i + 1, target - nums[i], nums, list, ans);
			list.remove(list.size() - 1);
		}
	}
}
