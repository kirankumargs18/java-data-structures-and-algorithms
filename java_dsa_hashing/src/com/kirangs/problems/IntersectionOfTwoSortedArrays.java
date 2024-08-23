package com.kirangs.problems;

import java.util.Arrays;

//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 1, 2, 2 };
		int[] nums2 = { 2, 2 };
		int[] res = intersectionOfTwoSortedArrays(nums1, nums2);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	// Time : O(Min(M,N))
	// Space : O(min(M,N))
	private static int[] intersectionOfTwoSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] res = new int[Math.min(m, n)];
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < m && j < n) {
			if (nums1[i] == nums2[j]) {
				res[count] = nums1[i];
				count++;
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOf(res, count);
	}
}
