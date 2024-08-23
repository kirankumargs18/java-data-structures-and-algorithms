package com.kirangs;

public class NumberOfSubStringsThatContainsAllThreeCharacters {

	public static void main(String[] args) {

		String s1 = "abcabc";
		System.out.println(naiveSolution(s1));
		System.out.println(optimalSolution(s1));

		String s2 = "bbacba";
		System.out.println(naiveSolution(s2));
		System.out.println(optimalSolution(s2));

		String s3 = "abc";
		System.out.println(naiveSolution(s3));
		System.out.println(optimalSolution(s3));

	}

	// 2 pointer and sliding window
	// with every character there is subString that ends
	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(String s) {
		int n = s.length();
		int count = 0;
		int[] hash = { -1, -1, -1 };
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			hash[ch - 'a'] = i;
			if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1) {
				count = count + Math.min(hash[0], Math.min(hash[1], hash[2])) + 1;
			}
		}
		return count;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(String s) {

		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
//			Set<Character> chars = new HashSet<>();
			int[] hash = new int[3];
			for (int j = i; j < n; j++) {
//				chars.add(s.charAt(j));
//				if (chars.size() == 3) {
//					count++;
//				}
//				if (chars.size() > 3) {
//					break;
//				}
				hash[s.charAt(j) - 'a'] = 1;
				if (hash[0] + hash[1] + hash[2] == 3) {
//					count++;
					// once we find first valid substring, then everyThing that comes after will be
					// valid only
					count = count + (n - j);
					break;
				}
			}
		}
		return count;
	}
}
