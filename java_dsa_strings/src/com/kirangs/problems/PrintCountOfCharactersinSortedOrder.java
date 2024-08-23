package com.kirangs.problems;

public class PrintCountOfCharactersinSortedOrder {
	public static void main(String[] args) {

		String str = "globallogic";
		printCharactersAndCount(str);
	}

	// Time : O(n+26) --> O(n)
	// Space : O(26) --> O(1)
	private static void printCharactersAndCount(String str) {
		int n = str.length();
		int[] count = new int[26];
		for (int i = 0; i < n; i++) {
			count[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + " : " + count[i]);
			}
		}
	}
}
