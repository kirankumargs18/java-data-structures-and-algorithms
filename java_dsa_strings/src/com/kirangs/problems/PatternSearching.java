package com.kirangs.problems;

public class PatternSearching {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		String p = "gee";
		improvedNaiveSolution(s, p);

	}

	// Time : O((n-m+1)*m)
	// Space : O(1)
	// it's also a scenario of sliding window
	private static void patterSearch(String s, String p) {

		int n = s.length();
		int m = p.length();
		int start = 0;
		int end = m - 1;
		boolean patternFound = false;
		while (end < n) {
			if (s.substring(start, end + 1).equals(p)) {
				patternFound = true;
				System.out.println("Pattern found at " + start);
			}
			start++;
			end++;
		}
		if (!patternFound) {
			System.out.println("Pattern Not Found");
		}
	}

	// letter by letter comparison
	// Time : O((n-m+1)*m)
	// Space : O(1)
	private static void naiveSolution(String t, String p) {

		int n = t.length();
		int m = p.length();
		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (p.charAt(j) != t.charAt(i + j)) {
					break;
				}
			}
			if (j == m) {
				System.out.println("Pattern found at index : " + i);
			}
		}
	}

	// Improved naive algorithm when pattern has unique characters
	// Time : O(n)
	// Space : O(1)
	private static void improvedNaiveSolution(String t, String p) {

		int n = t.length();
		int m = p.length();
		int i = 0;
		while (i <= n - m) {
			int j = 0;
			while (j < m) {
				if (p.charAt(j) != t.charAt(i + j)) {
					break;
				}
				j++;
			}
			if (j == m) {
				System.out.println("Pattern found at index : " + i);
			}
			if (j == 0) {
				i++;
			} else {
				i = i + j;
			}
		}
	}
}
