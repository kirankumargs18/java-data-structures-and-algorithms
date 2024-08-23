package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//15. 3Sum
public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };
//		System.out.println(naiveSolution(nums));
//		System.out.println(betterSolution(nums));
		System.out.println(optimalSolution(nums));

		int[] nums1 = { 0, 0, 0, 0 };
//		System.out.println(naiveSolution(nums1));
//		System.out.println(betterSolution(nums1));
		System.out.println(optimalSolution(nums1));

	}

	// Optimal Solution will be using 2 pointer approach(we need to sort the array)
	// Time : O(N^2)
	// Space : O(1)
	private static List<List<Integer>> optimalSolution(int[] nums) {

		Arrays.sort(nums);
		int n = nums.length;
		List<List<Integer>> tripplets = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int value = -(nums[i]);
			int l = i + 1;
			int r = n - 1;
			while (l < r) {
				int sum = nums[l] + nums[r];
				if (sum == value) {
					tripplets.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
					r--;
					while (l < r && nums[l] == nums[l - 1]) {
						l++;
					}
					while (r > l && nums[r] == nums[r + 1]) {
						r--;
					}
				} else if (sum > value) {
					r--;
				} else {
					l++;
				}
			}
		}
		return tripplets;
	}

	// better solution using Hashing we can reduce third loop
	// we will use our hashSet to find third element of the tripplet
	// Time : O(N^2LogN))
	// Space : O(3*numberOfTripplets)

	private static List<List<Integer>> betterSolution(int[] nums) {

		int n = nums.length;
		List<List<Integer>> tripplets = new ArrayList<>();
		Set<List<Integer>> trippletSet = new HashSet<>();
		Set<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int value = -(nums[i] + nums[j]);
				if (hashSet.contains(value)) {
					List<Integer> tripplet = Arrays.asList(nums[i], nums[j], value);
					Collections.sort(tripplet);
					trippletSet.add(tripplet);
				} else {
					hashSet.add(nums[j]);
				}
			}
			hashSet.clear();
		}
		for (List<Integer> tripplet : trippletSet) {
			tripplets.add(tripplet);
		}
		return tripplets;
	}

	// Naive solution using 3 loops (trying out all possible tripplets)
	// Time : O(N^3)
	// Space : O(2*numberOfTripplets)
	private static List<List<Integer>> naiveSolution(int[] nums) {

		List<List<Integer>> tripplets = new ArrayList<>();
		Set<List<Integer>> tempSet = new HashSet<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> tripplet = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(tripplet);
						tempSet.add(tripplet);
					}
				}
			}
		}
		for (List<Integer> list : tempSet) {
			tripplets.add(list);
		}
		return tripplets;
	}
}
