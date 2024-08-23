package com.kirangs;

import java.util.Arrays;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String str = "cadbzabcd";
		System.out.println(longestSubStringWithoutRepeatingCharacterOptimal(str));
	}

	// Time : O(n)
	// Space : O(1)
	private static int longestSubStringWithoutRepeatingCharacterOptimal(String str) {

		int n = str.length();

		int l = 0;
		int r = 0;
		int maxLen = Integer.MIN_VALUE;

		int[] hash = new int[256];
		Arrays.fill(hash, -1);
		while (r < n) {
			if (hash[str.charAt(r)] != -1 && hash[str.charAt(r)] >= l) {
				l = hash[str.charAt(r)] + 1;
			}
			maxLen = Math.max(maxLen, r - l + 1);
			hash[str.charAt(r)] = r;
			r++;
		}
		return maxLen;
	}

	// Time : O(n^2)
	// Space : O(256)
	private static int longestSubStringWithoutRepeatingCharacterBetter(String str) {

		int maxLen = Integer.MIN_VALUE;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			int[] hash = new int[256];
			for (int j = i; j < n; j++) {
				if (hash[str.charAt(j)] == 1) {
					break;
				}
				maxLen = Math.max(maxLen, j - i + 1);
				hash[str.charAt(j)] = 1;
			}
		}
		return maxLen;
	}

	// Time : O(n^3*logn)
	// Space : O(1)
	private static int longestSubStringWithoutRepeatingCharacterNaive(String str) {

		int maxLen = Integer.MIN_VALUE;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			String sub = "";
			for (int j = i; j < n; j++) {
				sub = sub + str.charAt(j);
				if (isUnique(sub)) {
					maxLen = Math.max(maxLen, sub.length());
				} else {
					break;
				}
			}
		}
		return maxLen;
	}

	private static boolean isUnique(String str) {

		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] != chars[i + 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}
