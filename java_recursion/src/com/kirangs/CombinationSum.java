package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {

		int[] candidates = { 2,3,5};
		int target = 8;
		Arrays.sort(candidates);
		System.out.println(combinationSum(candidates, target));

	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> resultList = new ArrayList<>();
		if (candidates.length == 0) {
			return resultList;
		}
		findCombinations(0, candidates, target, new ArrayList<>(), resultList);
		return resultList;
	}

	private static void findCombinations(int index, int[] arr, int target, List<Integer> list,
			List<List<Integer>> combinationList) {
		if (index == arr.length) {
			if (target == 0) {
				combinationList.add(new ArrayList<>(list));
			}
			return;
		}
		if (arr[index] <= target) {
			list.add(arr[index]);
			findCombinations(index, arr, target - arr[index], list, combinationList);
			list.remove(list.size() - 1);
		}
		findCombinations(index + 1, arr, target, list, combinationList);
	}

}
