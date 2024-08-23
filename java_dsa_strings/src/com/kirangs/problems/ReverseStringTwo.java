package com.kirangs.problems;

//Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

//If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
//then reverse the first k characters and leave the other as original.
public class ReverseStringTwo {

	public static void main(String[] args) {

		String str = "abcd";
		int k = 6;
		System.out.println(reverse(str, k));

	}

	private static String reverse(String s, int k) {

		int n = s.length();
		char[] str = s.toCharArray();
		int start = 0;
		int end = 2 * k - 1;
		if (end > n) {
			int charsLeft = n - start;
			if (charsLeft >= k) {
				reverseChars(str, start, start + k - 1);
			} else {
				reverseChars(str, start, n - 1);
			}
		}
		while (end <= n) {
			reverseChars(str, start, end - k);
			start = end + 1;
			end = end + 2 * k;
			if (end > n) {
				int charsLeft = n - start;
				if (charsLeft >= k) {
					reverseChars(str, start, start + k - 1);
				} else {
					reverseChars(str, start, n - 1);
				}
			}
		}
		return new String(str);
	}

	private static void reverseChars(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}
}
