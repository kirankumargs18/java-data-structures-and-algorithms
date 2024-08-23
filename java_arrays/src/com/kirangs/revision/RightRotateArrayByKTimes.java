package com.kirangs.revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RightRotateArrayByKTimes {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		rightRotateByKtimes(nums, 2);
		System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
	}

	// Time : O(N+N)
	// Space : O(1)
	private static void rightRotateByKtimes(int[] nums, int k) {

		int n = nums.length;
		k = k % n;
		reverseArray(nums, 0, n - 1);
		reverseArray(nums, 0, k - 1);
		reverseArray(nums, k, n - 1);
	}

	private static void reverseArray(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
