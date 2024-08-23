package com.kirangs.problems;

import java.util.Arrays;

public class LeftMostNonRepeatingElement {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		s.trim();
		System.out.println(optimalSolution(s));

		String s1 = "abcabc";
		System.out.println(optimalSolution(s1));

		String s2 = "apple";
		System.out.println(optimalSolution(s2));

	}

	// Time : O(n)
	// Space : O(26) --> O(1)
	private static int leftMostNonRepeatingIndex(String s) {

		int n = s.length();
		int[] count = new int[26];
		for (int i = 0; i < n; i++) {
			count[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < n; i++) {
			if (count[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

	// one traversal
	// Time : O(n)
	// Space : O(1)
	private static int optimalSolution(String s) {

		int n = s.length();
		int[] firstIndex = new int[26];
		Arrays.fill(firstIndex, -1);
		for (int i = 0; i < n; i++) {
			if (firstIndex[s.charAt(i) - 'a'] == -1) {
				firstIndex[s.charAt(i) - 'a'] = i;
			} else {
				firstIndex[s.charAt(i) - 'a'] = -2;
			}
		}
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			if (firstIndex[i] >= 0) {
				res = Math.min(res, firstIndex[i]);
			}
		}
		if (res == Integer.MAX_VALUE) {
			return -1;
		}
		return res;
	}
}
