package com.kirangs.problems;

public class IndexOfFirstUniqueCharacterInString {

	public static void main(String[] args) {

		String s = "eabbbcc";
		System.out.println(optimalSolution(s));
	}

	// Time : O(n*n)
	// Space : O(1)
	private static int firstUniqueCharacter(String s) {

		int n = s.length();
		if (n == 1) {
			return 0;
		}
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			int count = 0;
			int firstIndex = i;
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == c) {
					count = count + 1;
				}
			}
			if (count == 1) {
				return firstIndex;
			}
		}
		return -1;
	}

	// Time: O(n+n)
	// Space : O(27)
	private static int optimalSolution(String s) {

//		int n = s.length();
//		if (n == 1) {
//			return 0;
//		}
//		int[] count = new int[27];
//		LinkedHashMap<Character, Integer> firstIndexMap = new LinkedHashMap<>();
//		for (int i = 0; i < n; i++) {
//			count[s.charAt(i) - 'a']++;
//			if (!firstIndexMap.containsKey(s.charAt(i))) {
//				firstIndexMap.put(s.charAt(i), i);
//			}
//		}
//		for (Map.Entry<Character, Integer> entry : firstIndexMap.entrySet()) {
//			if (count[entry.getKey() - 'a'] == 1) {
//				return entry.getValue();
//			}
//		}
//		return -1;

		int n = s.length();
		if (n == 1) {
			return 0;
		}
		int[] count = new int[27];

		for (int i = 0; i < n; i++) {
			count[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < n; i++) {
			if (count[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}
}
