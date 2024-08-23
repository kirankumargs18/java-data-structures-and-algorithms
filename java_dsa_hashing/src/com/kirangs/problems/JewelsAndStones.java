package com.kirangs.problems;

import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {

		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(jewelsAndStones(jewels, stones));

	}

	// Time : O(m*n)
	// space : O(1)
	private static int optimalSolution(String jewels, String stones) {

		int res = 0;
		int m = stones.length();
		for (int i = 0; i < m; i++) {
			if (jewels.indexOf(stones.charAt(i)) > -1) {
				res++;
			}
		}
		return res;
	}

	// Time : O(m+n)
	// Space : O(m+n)
	private static int jewelsAndStones(String jewels, String stones) {

//		int res = 0;
//		HashSet<Character> hashSet = new HashSet<>();
//		char[] jewelsArray = jewels.toCharArray();
//		char[] stonesArray = stones.toCharArray();
//		for (char c : jewelsArray) {
//			hashSet.add(c);
//		}
//		for (char c : stonesArray) {
//			if (hashSet.contains(c)) {
//				res++;
//			}
//		}
//		return res;

		int res = 0;
		int m = jewels.length();
		int n = stones.length();
		HashSet<Character> hashSet = new HashSet<>();
		for (int i = 0; i < m; i++) {
			hashSet.add(jewels.charAt(i));
		}
		for (int i = 0; i < n; i++) {
			if (hashSet.contains(stones.charAt(i))) {
				res++;
			}
		}
		return res;
	}
}
