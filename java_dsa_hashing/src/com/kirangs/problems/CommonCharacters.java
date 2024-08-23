package com.kirangs.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacters {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("bella", "label", "roller");
		System.out.println(findCommonChars(words));

	}

	// Time : O(27 + NumberOfWords*(avgLengthOfEachWord + 27) + 27) ==>
	// O(NumberOfWords*avgLengthOfEachWord)
	// Space : O(27) ==> O(1)
	private static List<String> findCommonChars(List<String> words) {

		int[] common = new int[27];
		Arrays.fill(common, Integer.MAX_VALUE);
		for (String word : words) {
			int[] count = new int[27];
			for (char c : word.toCharArray()) {
				count[c - 'a']++;
			}
			for (int i = 0; i < 27; i++) {
				common[i] = Math.min(common[i], count[i]);
			}
		}
		List<String> strList = new ArrayList<>();
		int i = 0;
		while (i < 27) {
			if (common[i] > 0) {
				strList.add(String.valueOf("" + (char) ('a' + i)));
				common[i] = common[i] - 1;
			} else {
				i++;
			}
		}
		return strList;
	}

}
