package com.kirangs.problems;

import java.util.Arrays;
import java.util.HashSet;

//1 <= nums1.length, nums2.length <= 1000
//0 <= nums1[i], nums2[i] <= 1000
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 2, 2 };
		int[] nums2 = { 1, 2, 2, 1 };
		int[] res = optimalSolutionWithDuplicates(nums1, nums2);
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	// Time : O(M+N)
	// Space : O(1001)
	private static int[] optimalSolutionWithoutDuplicates(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int[] track = new int[1001];
		int[] res = new int[1001];
		int count = 0;
		for (int i = 0; i < m; i++) {
			track[nums1[i]] = 1;
		}
		for (int i = 0; i < n; i++) {
			if (track[nums2[i]] == 1) {
				track[nums2[i]] = 0;
				res[count] = nums2[i];
				count++;
			}
		}
		return Arrays.copyOf(res, count);
	}

	// Time : O(M+N)
	// Space : O(1001)
	private static int[] optimalSolutionWithDuplicates(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int[] hash = new int[1001];
		int[] res = new int[1001];
		int count = 0;
		for (int i = 0; i < m; i++) {
			hash[nums1[i]] = hash[nums1[i]] + 1;
		}
		for (int i = 0; i < n; i++) {
			if (hash[nums2[i]] > 0) {
				res[count++] = nums2[i];
				hash[nums2[i]] = hash[nums2[i]] - 1;
			}
		}
		return Arrays.copyOf(res, count);

	}

	// Time : O(m+n)
	// Space : O(m+n)
	private static int[] betterSolution(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		HashSet<Integer> hashSet = new HashSet<>();
		HashSet<Integer> resultSet = new HashSet<>();
		for (int i = 0; i < m; i++) {
			hashSet.add(nums1[i]);
		}
		for (int i = 0; i < n; i++) {
			if (hashSet.contains(nums2[i])) {
				resultSet.add(nums2[i]);
			}
		}
		int[] res = new int[resultSet.size()];
		int i = 0;
		for (int num : resultSet) {
			res[i] = num;
			i++;
		}
		return res;
	}

	// Time : O(m*n)
	// Space : O(m/n)
	public static int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> hashSet = new HashSet<>();
		int m = nums1.length;
		int n = nums2.length;
		for (int i = 0; i < m; i++) {
			int key = nums1[i];
			for (int j = 0; j < n; j++) {
				if (key == nums2[j]) {
					hashSet.add(key);
					break;
				}
			}
		}
		int[] res = new int[hashSet.size()];
		int i = 0;
		for (int num : hashSet) {
			res[i] = num;
			i++;
		}
		return res;
	}
}
