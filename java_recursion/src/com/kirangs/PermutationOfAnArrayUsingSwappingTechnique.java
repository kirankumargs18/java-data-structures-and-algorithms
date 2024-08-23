package com.kirangs;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfAnArrayUsingSwappingTechnique {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));
	}

	private static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		permutations(0, nums, list);
		return list;
	}

	private static void permutations(int index, int[] nums, List<List<Integer>> ans) {

		int n = nums.length;
		if (index == n) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(nums[i]);
			}
			ans.add(new ArrayList<>(list));
		}
		for (int i = index; i < n; i++) {
			swap(nums, index, i);
			permutations(index + 1, nums, ans);
			swap(nums, index, i);
		}
	}

	private static void swap(int[] nums, int index, int i) {
		if (index == i) {
			return;
		}
		int temp = nums[index];
		nums[index] = nums[i];
		nums[i] = temp;
	}
}
