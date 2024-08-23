package com.kirangs.problems;

public class LongestProperSuffixAndPrefix {

	public static void main(String[] args) {

		String str = "ababcab";
//		int[] res = properPrefixSuffix(str);
//		printArray(res);
		int[] lps = new int[str.length()];
		fillLps(str, lps);

	}

	// Time : O(n*n*n)
	// Space : O(1)
	private static int[] properPrefixSuffix(String str) {

		int[] lps = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			lps[i] = longestPrefixSuffix(str, i + 1);
		}
		return lps;
	}

	// Time : O(n*n)
	// Space : O(1)
	private static int longestPrefixSuffix(String str, int n) {
		for (int len = n - 1; len >= 0; len--) {
			boolean flag = true;
			for (int j = 0; j < len; j++) {
				if (str.charAt(j) != str.charAt(n - len + j)) {
					flag = false;
				}
			}
			if (flag) {
				return len;
			}
		}
		return 0;
	}

	// Time : O(n)
	// Space : O(1)
	private static void fillLps(String str, int[] lps) {

		int n = str.length();
		int len = 0;
		lps[0] = 0;
		int i = 1;
		while (i < n) {
			if (str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len == 0) {
					lps[i] = 0;
					i++;
				} else {
					len = lps[len - 1];
				}
			}
		}
		printArray(lps);
	}

	// print array in [1,2,3,..] format
	private static void printArray(int[] nums) {
		int n = nums.length;
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(nums[i]);
			} else {
				System.out.print(nums[i] + ",");
			}
		}
		System.out.print("]");
		System.out.println();
	}

}
