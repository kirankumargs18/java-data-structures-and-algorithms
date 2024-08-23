package com.kirangs;

import java.util.ArrayList;
import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class FirstAndLastPositionOfAnElementInSortedArray {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		System.out.println(optimalSolution(nums, 8));

		int[] nums1 = { 5, 7, 7, 8, 8, 10 };
		System.out.println(optimalSolution(nums1, 6));

		int[] nums3 = {};
		System.out.println(optimalSolution(nums3, 0));
	}

	private static int[] optimalSolution(int[] nums, int target) {

		int first = searchOccurence(nums, target, true);
		if (first == -1) {
			return new int[] { -1, -1 };
		}
		int last = searchOccurence(nums, target, false);
		return new int[] { first, last };
	}
	
	private static ArrayList<Integer> optimalSolutionOne(int[] nums, int target) {

		
		int first = searchOccurence(nums, target, true);
		if (first == -1) {
			return (ArrayList<Integer>) Arrays.asList(-1,-1);
		}
		int last = searchOccurence(nums, target, false);
		return (ArrayList<Integer>) Arrays.asList(first,last);
	}

	// O(logN)
	// O(1)
	private static int searchOccurence(int[] nums, int target, boolean isFirst) {

		int n = nums.length;
		if (n <= 0) {
			return -1;
		}
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				if (isFirst) {
					if (mid == 0 || nums[mid] != nums[mid - 1]) {
						return mid;
					} else {
						high = mid - 1;
					}
				} else {
					if (mid == n - 1 || nums[mid] != nums[mid + 1]) {
						return mid;
					} else {
						low = mid + 1;
					}
				}
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
