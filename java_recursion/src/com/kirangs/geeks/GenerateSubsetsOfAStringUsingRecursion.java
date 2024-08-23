package com.kirangs.geeks;

public class GenerateSubsetsOfAStringUsingRecursion {

	public static void main(String[] args) {

		subsets("ABC", "", 0);

	}

	private static void subsets(String str, String curr, int i) {

		if (i == str.length()) {
			System.out.println((char) 34 + curr + (char) 34);
			return;
		}
		subsets(str, curr + str.charAt(i), i + 1);
		subsets(str, curr, i + 1);
	}
}
