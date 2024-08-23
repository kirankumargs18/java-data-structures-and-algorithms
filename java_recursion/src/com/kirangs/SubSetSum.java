package com.kirangs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//return a list containing sum of all subsets in ascending order
public class SubSetSum {

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2};
		System.out.println(naiveSolution(nums));

	}
	
	
	

	// Time : O(2^N + 2^NlogN)
	// Space : O(2^N)
	private static List<Integer> naiveSolution(int[] nums) {
		List<Integer> ans = new ArrayList<>();
//		Arrays.sort(nums);
		subsetSumOne(0, nums, 0, ans);
		Collections.sort(ans);
		return ans;
	}

	private static void subsetSumOne(int index, int[] nums, int sum, List<Integer> ans) {
		if (index >= nums.length) {
			ans.add(sum);
			return;
		}
		sum = sum + nums[index];
		subsetSumOne(index + 1, nums, sum, ans);
		sum = sum - nums[index];
		subsetSumOne(index + 1, nums, sum, ans);
	}
}
