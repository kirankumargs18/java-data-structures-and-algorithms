package com.kirangs.revision;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 4, 8, 10 };
		int[] nums2 = { 2, 3, 9 };
		mergeTwoSortedArrays(nums1, nums2);

	}

	// Time : O(m+n + n*logn + m*logm)
	// Space : O(1)
	//num1 contains all minimum elements
	//num2 contains all maxmum elements
	//finally sorting both the arrays
	private static void mergeTwoSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int i = m - 1;
		int j = 0;
		while (i >= 0 && j < n) {
			if (nums1[i] > nums2[j]) {
				int temp = nums1[i];
				nums1[i] = nums2[j];
				nums2[j] = temp;
				i--;
				j++;
			} else {
				break;
			}
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		printArray(nums1);
		printArray(nums2);
	}

	private static void printArray(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
