package com.kirangs.revision;

import java.util.Arrays;
import java.util.List;

public class MinimumArrayLengthAfterPairRemovals {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2, 3, 4, 4, 4);
		System.out.println(minimumLength(nums));

	}

	// Time : O(n)
	// Space : O(1)
	private static int minimumLength(List<Integer> nums) {
		int n = nums.size();
		int i = 0;
		int j = n / 2;
		int res = n;
		while (i < n / 2 && j < n) {
			if (nums.get(i) < nums.get(j)) {
				res = res - 2;
				i++;
				j++;
			} else {
				j++;
			}
		}
		return res;
	}

}
