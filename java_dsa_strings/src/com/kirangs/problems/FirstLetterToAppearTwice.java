package com.kirangs.problems;

import java.util.HashSet;

public class FirstLetterToAppearTwice {

	public static void main(String[] args) {

		String s = "abcdd";
		System.out.println(betterSoluiton(s));

	}

	// Time : O(n)
	// Space : O(n)
	private static char betterSoluiton(String s) {

		int n = s.length();
		if (n == 2) {
			return s.charAt(0);
		}
		HashSet<Character> hashSet = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (hashSet.contains(s.charAt(i))) {
				return s.charAt(i);
			} else {
				hashSet.add(s.charAt(i));
			}
		}
		return '\u0000';
	}
}
