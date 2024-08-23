package com.kirangs;

//424. Longest Repeating Character Replacement
public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {

		String s = "ABAB";
		int k = 2;
		System.out.println(naiveSolution(s, k));
		System.out.println(optimalSolution(s, k));

		String s1 = "AABABBA";
		int k1 = 1;
		System.out.println(naiveSolution(s1, k1));
		System.out.println(optimalSolution(s1, k1));

	}

	// 2 pointer and sliding window
	// Time : O(N)
	// Space : O(26) --> O(26)
	private static int optimalSolution(String s, int k) {

		int n = s.length();
		int maxF = 0;
		int maxLen = 0;
		int[] hash = new int[26];
		int r = 0;
		int l = 0;
		while (r < n) {
			char ch = s.charAt(r);
			hash[ch - 'A']++;
			maxF = Math.max(maxF, hash[ch - 'A']);
			int changes = (r - l + 1) - maxF;
			if (changes <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			} else {
				char lCh = s.charAt(l);
				hash[lCh - 'A']--;
				l++;
			}
			r++;
		}
		return maxLen;
	}

	// Time : O(N^2)
	// Space : O(26)--> O(1)
	// at most letters we can flip = maxF - length
	private static int naiveSolution(String s, int k) {

		int n = s.length();
		int maxLen = 0;
		int maxF = 0;
		for (int i = 0; i < n; i++) {
			int[] hash = new int[26];
			for (int j = i; j < n; j++) {
				hash[s.charAt(j) - 'A']++;
				maxF = Math.max(maxF, hash[s.charAt(j) - 'A']);
				int changes = (j - i + 1) - maxF;
				if (changes <= k) {
					maxLen = Math.max(maxLen, j - i + 1);
				} else {
					break;
				}
			}
		}
		return maxLen;
	}

}
