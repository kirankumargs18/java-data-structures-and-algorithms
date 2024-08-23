package com.kirangs;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringAtMostKDistinctCharacters {

	public static void main(String[] args) {

		String str1 = "aaaaaaaa";
		int k1 = 2;
		System.out.println(naiveSolution(str1, k1));
		System.out.println(betterSolution(str1, k1));
		System.out.println(optimalSolution(str1, k1));

		String str2 = "abcddefg";
		int k2 = 3;
		System.out.println(naiveSolution(str2, k2));
		System.out.println(betterSolution(str2, k2));
		System.out.println(optimalSolution(str2, k2));

	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(String str, int k) {
		int n = str.length();
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int[] hash = new int[256];
			int count = 0;
			for (int j = i; j < n; j++) {
				if (hash[str.charAt(j)] != 1) {
					hash[str.charAt(j)] = 1;
					count++;
				}
				if (count <= k) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
				if (count > k) {
					break;
				}
			}
		}
		return maxLen;
	}

	// 2 pointer and sliding window
	// Time : O(N+N)
	// even though if we are using while inside while. Second while will run for N
	// times throughout
	// Space : O(1)
	private static int betterSolution(String str, int k) {

		int n = str.length();
		int maxLen = 0;
		int r = 0;
		int l = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (r < n) {
			if (map.containsKey(str.charAt(r))) {
				map.put(str.charAt(r), map.get(str.charAt(r)) + 1);
			} else {
				map.put(str.charAt(r), 1);
			}

			while (map.size() > k) {
				map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
				if (map.get(str.charAt(l)) == 0) {
					map.remove(str.charAt(l));
				}
				l++;
			}
			if (map.size() <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}

	// 2 pointer and sliding window
	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(String str, int k) {

		int n = str.length();
		int maxLen = 0;
		int r = 0;
		int l = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (r < n) {
			char rChar = str.charAt(r);
			if (map.containsKey(rChar)) {
				map.put(str.charAt(r), map.get(rChar) + 1);
			} else {
				map.put(str.charAt(r), 1);
			}
			if (map.size() > k) {
				char lChar = str.charAt(l);
				map.put(str.charAt(l), map.get(lChar) - 1);
				if (map.get(lChar) == 0) {
					map.remove(lChar);
				}
				l++;
			}
			if (map.size() <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}
}
