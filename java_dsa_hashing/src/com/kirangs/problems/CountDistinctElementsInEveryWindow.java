package com.kirangs.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CountDistinctElementsInEveryWindow {

	public static void main(String[] args) {

		int[] nums = { 10, 10, 10, 10 };
		int k = 3;
		System.out.println(naiveSolution(nums, k));
		System.out.println(betterSolution(nums, k));
	}

	// Time : O(n)
	// Space : O(k)
	private static List<Integer> betterSolution(int[] nums, int k) {

		int n = nums.length;
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < k; i++) {
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
		}
		list.add(hashMap.size());
		for (int i = k; i < n; i++) {
			hashMap.put(nums[i - k], hashMap.get(nums[i - k]) - 1);
			if (hashMap.get(nums[i - k]) == 0) {
				hashMap.remove(nums[i - k]);
			}
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
			list.add(hashMap.size());
		}
		return list;
	}

	// Time : O(n*k)
	// Space : O(k)
	private static List<Integer> naiveSolution(int[] nums, int k) {

		List<Integer> list = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i <= n - k; i++) {
			HashSet<Integer> hashSet = new HashSet<>();
			for (int j = i; j < (i + k); j++) {
				hashSet.add(nums[j]);
			}
			list.add(hashSet.size());
			hashSet.clear();
		}
		return list;
	}
}
