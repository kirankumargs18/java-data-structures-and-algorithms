package com.kirangs;

import java.util.Arrays;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(naiveSolution(s));
		System.out.println(betterSolution(s));

		String s1 = "bbbbb";
		System.out.println(naiveSolution(s1));
		System.out.println(betterSolution(s1));

		String s2 = "pwwkew";
		System.out.println(naiveSolution(s2));
		System.out.println(betterSolution(s2));
	}

	// 2 pointer and sliding window
	// Time : O(N)
	// Space : O(256)
	private static int betterSolution(String str) {

		int n = str.length();
		int maxLen = 0;
		int r = 0;
		int l = 0;
		int[] hashArray = new int[256];
		Arrays.fill(hashArray, -1);
		while (r < n) {
			if (hashArray[str.charAt(r)] != -1 && (hashArray[str.charAt(r)] >= l)) {
				l = hashArray[str.charAt(r)] + 1;
			}
			maxLen = Math.max(maxLen, r - l + 1);
			hashArray[str.charAt(r)] = r;
			r++;
		}
		return maxLen;
	}

	// find all subStrings and make sure subString does not have repeating
	// characters
	// Time : O(n^2)
	// Space : O(256) --> O(1)
	private static int naiveSolution(String str) {

		int n = str.length();
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int[] visited = new int[256];
			for (int j = i; j < n; j++) {
				if (visited[str.charAt(j)] == 1) {
					break;
				}
				maxLen = Math.max(maxLen, j - i + 1);
				visited[str.charAt(j)] = 1;
			}
		}
		return maxLen;
	}

}
