package com.kirangs.problems;

public class NumberOfMatchingSubSequences {

	public static void main(String[] args) {

		String s = "dsahjpjauf";
		String[] words = { "ahjpjau","ja","ahbwzgqnuk","tnmlanowax" };
		System.out.println(numMatchingSubseq(s, words));

	}

	// if k is number of words
	// Time : O(k*(m+n))
	// Space : O(1)
	private static int numMatchingSubseq(String s, String[] words) {

		int count = 0;
		for (String str : words) {
			if (isSubsequence(str, s)) {
				count = count + 1;
			}
		}
		return count;
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
}
