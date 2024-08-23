package com.kirangs;

import java.util.Arrays;

//Only one element appears more than once
public class RepeatingElements {

	public static void main(String[] args) {

		int[] nums1 = { 0, 2, 1, 3, 2, 2 };
		System.out.println(naiveSolution(nums1));
		System.out.println(betterSolution(nums1));
		System.out.println(betterSolutionOne(nums1));

		int[] nums2 = { 0, 0 };
		System.out.println(naiveSolution(nums2));
		System.out.println(betterSolution(nums2));
		System.out.println(betterSolutionOne(nums2));
	}

	// using 2 loops
	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					return nums[i];
				}
			}
		}
		return -1;
	}

	// sort array
	// Time : O(NlogN)
	// Space : O(1)
	private static int betterSolution(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return nums[i];
			}
		}
		return -1;
	}

	// using hashing to store frequencies
	// Time : O(N)
	// Space : O(N)
	private static int betterSolutionOne(int[] nums) {
		int n = nums.length;
//		int[] hashMap = new int[n];
//		for (int i = 0; i < n; i++) {
//			hashMap[nums[i]]++;
//		}
//		for (int i = 0; i < n; i++) {
//			if (hashMap[i] > 1) {
//				return i;
//			}
//		}
		int[] visited = new int[n];
		for (int i = 0; i < n; i++) {
			if (visited[nums[i]] == 1) {
				return nums[i];
			}
			visited[nums[i]] = 1;
		}
		return -1;
	}
}
