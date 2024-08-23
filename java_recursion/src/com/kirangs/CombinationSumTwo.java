package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumTwo {

	public static void main(String[] args) {

		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		System.out.println(combinationSum(candidates, target));

	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		Set<List<Integer>> resultList = new HashSet<>();
		if (candidates.length == 0) {
			return new ArrayList<>(resultList);
		}
		findCombinations(0, candidates, target, new ArrayList<>(), resultList);
		return new ArrayList<>(resultList);
	}

	private static void findCombinations(int index, int[] arr, int target, List<Integer> list,
			Set<List<Integer>> combinationList) {
		if (index == arr.length) {
			if (target == 0) {
				combinationList.add(new ArrayList<>(list));
			}
			return;
		}
		if (arr[index] <= target) {
			list.add(arr[index]);
			findCombinations(index + 1, arr, target - arr[index], list, combinationList);
			list.remove(list.size() - 1);
		}
		findCombinations(index + 1, arr, target, list, combinationList);
	}
}
