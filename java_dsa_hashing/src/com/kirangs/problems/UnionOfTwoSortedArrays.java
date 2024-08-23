package com.kirangs.problems;

import java.util.HashSet;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 3, 4, 5, 6, 7 };
		System.out.println(union(nums1, nums2));

	}

	// Time : O(M+N)
	// Space : O(M+N)
	private static HashSet<Integer> union(int[] nums1, int[] nums2) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i : nums1) {
			hashSet.add(i);
		}
		for (int i : nums2) {
			hashSet.add(i);
		}
		return hashSet;
	}

}
