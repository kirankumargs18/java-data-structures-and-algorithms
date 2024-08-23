package com.kirangs.problems;

public class IsSubSequence {

	public static void main(String[] args) {

		String s1 = "abc";
		String t1 = "ahbgdc";
//		System.out.println(isSubsequence(s1, t1));
		System.out.println(isSubsequenceRecursive(s1, t1, 0, 0));

		String s2 = "axc";
		String t2 = "ahbgdc";
//		System.out.println(isSubsequence(s2, t2));
		System.out.println(isSubsequence(s2, t2));

	}

	// Time : O(m+n)
	// Space : O(1)
	private static boolean isSubsequence(String s, String t) {

		int i = 0;
		int j = 0;
		while (i < t.length() && j < s.length()) {
			if (t.charAt(i) == s.charAt(j)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j == s.length();
	}

	// Time : O(m+n)
	// Space : O(m+n)
	private static boolean isSubsequenceRecursive(String s, String t, int i, int j) {
		if (j >= s.length()) {
			return true;
		}
		if (i >= t.length()) {
			return false;
		}
		if (t.charAt(i) == s.charAt(j)) {
			i++;
			j++;
		} else {
			i++;
		}
		return isSubsequenceRecursive(s, t, i, j);
	}
}
