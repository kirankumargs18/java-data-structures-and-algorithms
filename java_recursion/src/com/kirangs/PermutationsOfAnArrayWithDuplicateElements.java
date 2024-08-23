package com.kirangs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsOfAnArrayWithDuplicateElements {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2 };
		System.out.println(permute(nums));

	}

	private static List<List<Integer>> permute(int[] nums) {

		// nums must contain unique elements or else result will contain duplicate
		// permutations
		Set<List<Integer>> ans = new HashSet<>();
		boolean[] freq = new boolean[nums.length];
		permutations(nums, freq, new ArrayList<>(), ans);
		return new ArrayList<>(ans);
	}

	private static void permutations(int[] nums, boolean[] freq, List<Integer> ds, Set<List<Integer>> ans) {

		int n = nums.length;
		if (ds.size() == n) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!freq[i]) {
				ds.add(nums[i]);
				freq[i] = true;
				permutations(nums, freq, ds, ans);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
		}
	}

}
