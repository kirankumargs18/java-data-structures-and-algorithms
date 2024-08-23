package com.kirangs.problems;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 4, 3, 2, 4, 4 };
		naiveSolution(nums);
		System.out.println("======");
		betterSolution(nums);

	}

	// Time : O(N)
	// Space : O(N)
	private static void betterSolution(int[] nums) {
		int n = nums.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
		}
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// Time : O(N^2)
	// Space : O(1)
	private static void naiveSolution(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int key = nums[i];
			int count = 0;
			boolean visited = false;
			for (int k = 0; k < i; k++) {
				if (nums[k] == key) {
					visited = true;
					break;
				}
			}
			if (!visited) {
				for (int j = 0; j < n; j++) {
					if (nums[j] == key) {
						count++;
					}
				}
				System.out.println(key + " : " + count);
			}
		}
	}
}
