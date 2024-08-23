package com.kirangs;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

		int[] nums1 = { 3, 2, 2 };
		System.out.println(majorityElement(nums1));

	}

	// O(N)
	// O(1)
	// n/2
	private static int majorityElement(int[] nums) {

//		int n = nums.length;
//		int mElement = nums[0];
//		int count = 1;
//
//		for (int i = 0; i < n; i++) {
//			if (nums[i] == mElement) {
//				count++;
//			} else {
//				count--;
//			}
//			if (count == 0) {
//				mElement = nums[i];
//				count = 1;
//			}
//		}
//		return mElement;

		int n = nums.length;
		int count = 0;
		int candidate = -1;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				candidate = nums[i];
			}
			if (candidate == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}
}
