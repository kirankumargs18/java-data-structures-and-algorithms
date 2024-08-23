package com.kirangs.problems;

import java.util.Arrays;

public class ValidAnagram {
	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";
		System.out.println(optimalSolution(s, t));
	}

	// Time : O(n*logn)
	// Space : O(n+n)
	private static boolean naiveSolution(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		char[] s1 = s.toCharArray();
		Arrays.sort(s1);
		String str1 = new String(s1);

		char[] t1 = t.toCharArray();
		Arrays.sort(t1);
		String str2 = new String(t1);

		return str1.equals(str2);
	}

	// Time : O(n)
	// Space : O(26) --> O(1)
	private static boolean optimalSolution(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		int[] hashMap1 = new int[27];
		for (int i = 0; i < s.length(); i++) {
			hashMap1[s.charAt(i) - 'a'] = hashMap1[s.charAt(i) - 'a'] + 1;
			hashMap1[t.charAt(i) - 'a'] = hashMap1[t.charAt(i) - 'a'] - 1;
		}
		for (int i = 0; i < 26; i++) {
			if (hashMap1[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
