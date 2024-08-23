package com.kirangs.problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfLeftMostRepeatingCharacter {

	public static void main(String[] args) {

		String s = "abccb";
		System.out.println(moreOptimalSolution(s));

	}

	// Time : O(n+n)
	// Space : O(n+27)

	private static int betterSolution(String s) {

		int n = s.length();
		if (n == 1) {
			return -1;
		}
		int[] count = new int[27];
		LinkedHashMap<Character, Integer> firstIndexMap = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			count[s.charAt(i) - 'a']++;
			if (!firstIndexMap.containsKey(s.charAt(i))) {
				firstIndexMap.put(s.charAt(i), i);
			}
		}
		for (Map.Entry<Character, Integer> entry : firstIndexMap.entrySet()) {
			if (count[entry.getKey() - 'a'] > 1) {
				return entry.getValue();
			}
		}
		return -1;
	}

	// assume s has atleast one repeating character
	// Time : O(n)
	// Space : O(1)
	private static int optimalSolution(String s) {

		int n = s.length();
		if (n == 2) {
			return 0;
		}
		int[] firstIndex = new int[27];
		Arrays.fill(firstIndex, -1);
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int fi = firstIndex[s.charAt(i) - 'a'];
			if (fi == -1) {
				firstIndex[s.charAt(i) - 'a'] = i;
			} else {
				res = Math.min(fi, res);
			}
		}
		// if s has all unique characters(in case if there is no such condition on
		// string that it shoud have atleast one repeating character
		if (res == Integer.MAX_VALUE) {
			return -1;
		} else {
			return res;
		}
	}

	// traverse from right
	// Time : O(n)
	// Space : O(27) --> O(1)
	private static int moreOptimalSolution(String s) {

		int n = s.length();
		int res = -1;
		boolean[] visited = new boolean[27];
		for (int i = n - 1; i >= 0; i--) {
			if (visited[s.charAt(i) - 'a']) {
				res = i;
			} else {
				visited[s.charAt(i) - 'a'] = true;
			}
		}
		return res;
	}
}
