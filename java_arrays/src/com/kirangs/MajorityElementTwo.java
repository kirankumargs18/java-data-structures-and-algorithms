package com.kirangs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//element that appears more n/3 times
public class MajorityElementTwo {

	public static void main(String[] args) {

		int[] nums = { 1, 2 };
		System.out.println(naiveSolution(nums));

		int[] nums1 = { 1, 2 };
		System.out.println(betterSolution(nums1));
		System.out.println(optimalSolution(nums1));

	}

	// Using moore's voting algorithm
	// O(N+N)
	// O(1)
	private static List<Integer> optimalSolution(int[] nums) {

		List<Integer> list = new ArrayList<>();
		int n = nums.length;
		if (n == 1) {
			list.add(nums[0]);
			return list;
		}
		int count1 = 0;
		int count2 = 0;
		int element1 = Integer.MIN_VALUE;
		int element2 = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (count1 == 0 && nums[i] != element2) {
				count1 = 1;
				element1 = nums[i];
			} else if (count2 == 0 && nums[i] != element1) {
				count2 = 1;
				element2 = nums[i];
			} else if (element1 == nums[i]) {
				count1++;
			} else if (element2 == nums[i]) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		int threshold = n / 3;
		count1 = 0;
		count2 = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == element1) {
				count1++;
			}
			if (nums[i] == element2) {
				count2++;
			}
		}
		if (count1 > threshold) {
			list.add(element1);
		}
		if (count2 > threshold && element2 != element1) {
			list.add(element2);
		}
		return list;
	}

	// O(N^2)
	// O(1)
	private static List<Integer> naiveSolution(int[] nums) {

		int n = nums.length;
		List<Integer> majorElements = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int ele = nums[i];
			int count = 0;
			if (!majorElements.contains(nums[i])) {
				for (int j = 0; j < n; j++) {
					if (nums[j] == ele) {
						count++;
					}
				}
				if (count > n / 3) {
					majorElements.add(nums[i]);
					if (majorElements.size() >= 2) {
						break;
					}
				}
			}
		}
		return majorElements;
	}

	// Using hashmap
	// O(N+N)
	// O(N)
	private static List<Integer> betterSolution(int[] nums) {

		int n = nums.length;
		int threshold = n / 3;
		List<Integer> majorityElements = new ArrayList<>();
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (majorityElements.size() >= 2) {
				break;
			}
			if (!majorityElements.contains(nums[i])) {
				if (hashMap.containsKey(nums[i])) {
					hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
				} else {
					hashMap.put(nums[i], 1);
				}
				if (hashMap.get(nums[i]) > threshold) {
					majorityElements.add(nums[i]);
				}
			}
		}
		return majorityElements;
	}
}
