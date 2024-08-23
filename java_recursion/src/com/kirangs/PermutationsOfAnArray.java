package com.kirangs;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		System.out.println(permute(nums));

	}

	private static List<List<Integer>> permute(int[] nums) {

		// nums must contain unique elements or else result will contain duplicate
		// permutations
		List<List<Integer>> ans = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];
		permutations(nums, new ArrayList<>(), freq, ans);
		return ans;
	}

	// Time : (n*n!)
	// Space : O(n+n)
	private static void permutations(int[] nums, List<Integer> ds, boolean[] freq, List<List<Integer>> ans) {

		int n = nums.length;
		if (ds.size() == n) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!freq[i]) {
				ds.add(nums[i]);
				freq[i] = true;
				permutations(nums, ds, freq, ans);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
		}
	}
}
