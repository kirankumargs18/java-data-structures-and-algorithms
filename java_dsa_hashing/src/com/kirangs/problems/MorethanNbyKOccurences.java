package com.kirangs.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MorethanNbyKOccurences {

	public static void main(String[] args) {

		int[] nums = { 4, 2, 1, 1 };
		System.out.println(naiveSolution(nums, 3));
		System.out.println(betterSolution(nums, 3));
		System.out.println(optimalSolution(nums));

	}

	// when k is very small we can use extended version of moore's voting algorithm
	// Assume k is 3. our answer can have k-1 elements

	// Time : O(n*k + k*n)
	// Space : O(k-1) ==> O(1)
	private static List<Integer> optimalSolution(int[] nums) {

		int n = nums.length;
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> hashMap = new ConcurrentHashMap<>(2);
		for (int i : nums) {
			if (hashMap.containsKey(i)) {
				hashMap.put(i, hashMap.get(i) + 1);
			} else if (hashMap.size() < 2) {
				hashMap.put(i, 1);
			} else {
				// reduce all values by 1, if value==0 then remove from hashMap
				for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
					hashMap.put(entry.getKey(), entry.getValue() - 1);
					if (hashMap.get(entry.getKey()) == 0) {
						hashMap.remove(entry.getKey());
					}
				}
			}
		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (nums[i] == key) {
					count++;
				}
			}
			if (count > (n / 3)) {
				list.add(key);
			}
		}
		return list;
	}

	// Time : O(N)
	// Space : O(N)
	private static ArrayList<Integer> betterSolution(int[] nums, int k) {

		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() > (n / k)) {
				list.add(entry.getKey());
			}
		}
		return list;
	}

	// Time : O(n*n)
	// Space : O(1)
	private static ArrayList<Integer> naiveSolution(int[] nums, int k) {

		int n = nums.length;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int count = 0;
			boolean visited = false;
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					visited = true;
					break;
				}
			}
			if (!visited) {
				for (int j = 0; j < n; j++) {
					if (nums[j] == nums[i]) {
						count++;
					}
				}
			}
			if (count > (n / k)) {
				list.add(nums[i]);
			}
		}
		return list;
	}
}
