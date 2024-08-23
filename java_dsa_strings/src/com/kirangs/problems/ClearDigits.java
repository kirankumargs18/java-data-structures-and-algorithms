package com.kirangs.problems;

//You are given a string s.
//
//Your task is to remove all digits by doing this operation repeatedly:
//
//Delete the first digit and the closest non-digit character to its left.
//Return the resulting string after removing all digits.

public class ClearDigits {

	private static String clearDigits(String s) {

		StringBuffer stringBuffer = new StringBuffer(s);
		for (int i = 0; i < stringBuffer.length(); i++) {
			char currChar = stringBuffer.charAt(i);
			if (currChar >= 97 && currChar <= 122) {
				continue;
			} else {
				stringBuffer.setCharAt(i, '+');
				int j = i - 1;
				while (j >= 0 && stringBuffer.charAt(j) == '+') {
					j--;
				}
				stringBuffer.setCharAt(j, '+');
			}
		}
		String res = "";
		int n = stringBuffer.length();
		for (int i = 0; i < n; i++) {
			if (stringBuffer.charAt(i) != '+') {
				res = res + stringBuffer.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String s = "abc3";
		System.out.println(clearDigits(s));
	}

}
