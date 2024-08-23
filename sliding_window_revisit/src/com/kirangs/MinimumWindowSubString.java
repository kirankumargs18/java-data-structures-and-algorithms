package com.kirangs;

public class MinimumWindowSubString {

	public static void main(String[] args) {

		String s1 = "ADOBECODEBANC";
		String t1 = "ABC";
		System.out.println(optimalSolution(s1, t1));

	}

	private static String optimalSolution(String s, String t) {

		if (s.isEmpty() || t.isEmpty()) {
			return "";
		}

		int n = s.length();
		int m = t.length();
		int[] hash = new int[256];
		int minLen = Integer.MAX_VALUE;
		int startIndex = -1;
		int count = 0;
		for (int i = 0; i < m; i++) {
			hash[t.charAt(i)] = hash[t.charAt(i)] + 1;
		}
		int r = 0;
		int l = 0;
		while (r < n) {
			if (hash[s.charAt(r)] > 0) {
				count = count + 1;
			}
			hash[s.charAt(r)] = hash[s.charAt(r)] - 1;
			while (count == m) {
				if ((r - l + 1) < minLen) {
					minLen = r - l + 1;
					startIndex = l;
				}
				hash[s.charAt(l)] = hash[s.charAt(l)] + 1;
				if (hash[s.charAt(l)] > 0) {
					count = count - 1;
				}
				l = l + 1;
			}
			r = r + 1;
		}
		return startIndex == -1 ? "" : s.substring(startIndex, minLen);
	}

	// Time : O(N^2)
	// Space : O(1)
	private static String naiveSolution(String s, String t) {

		int n = s.length();
		int m = t.length();
		int startIndex = -1;
		int minLen = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int[] hash = new int[256];
			int count = 0;
			for (int j = 0; j < m; j++) {
				hash[t.charAt(j)]++;
			}
			for (int j = i; j < n; j++) {
				if (hash[s.charAt(j)] > 0) {
					count = count + 1;
				}
				hash[s.charAt(j)]--;
				if (count == m && ((j - i + 1) < minLen)) {
					minLen = Math.min(minLen, j - i + 1);
					startIndex = i;
					break;
				}
			}
		}
		return s.substring(startIndex, minLen);
	}

}
