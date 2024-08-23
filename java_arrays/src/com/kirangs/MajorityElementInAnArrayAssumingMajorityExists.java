package com.kirangs;

public class MajorityElementInAnArrayAssumingMajorityExists {

	public static void main(String[] args) {

		int[] nums1 = { 8, 3, 4, 8, 8 };
		System.out.println(majority(nums1));

		int[] nums2 = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		System.out.println(majority(nums2));

	}

	
	//Time : O(n)
	//Assuming majority exists always 
	private static int majority(int[] nums) {

		int n = nums.length;
		int majority = nums[0];
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (nums[i] == majority) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				majority = nums[i];
				count = 1;
			}
		}
		return majority;
	}

}
