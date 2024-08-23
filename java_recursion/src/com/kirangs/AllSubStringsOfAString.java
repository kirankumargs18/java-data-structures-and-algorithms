package com.kirangs;

public class AllSubStringsOfAString {

	public static void main(String[] args) {
		subStrings(0, "abc", "");
	}

	private static void subStrings(int i, String str, String subStr) {
		if (i == str.length()) {
			System.out.println(subStr);
			return;
		}
		subStrings(i + 1, str, subStr + str.charAt(i));
		subStrings(i + 1, str, subStr);
	}

}
