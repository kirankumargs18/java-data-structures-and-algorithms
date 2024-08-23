package com.kirangs;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 5 };
		int[] nums2 = { 2, 4, 6 };
		int[] arr = merge(nums1, nums2);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static int[] merge(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int[] temp = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (j < m && k < n) {
			if (nums1[j] > nums2[k]) {
				temp[i++] = nums2[k++];
			} else {
				temp[i++] = nums1[j++];
			}
		}
		while (j < m) {
			temp[i++] = nums1[j++];
		}
		while (k < n) {
			temp[i++] = nums2[k++];
		}
		return temp;
	}
}
