package com.kirangs.problems;

public class PalindromeCheck {
	public static void main(String[] args) {
		System.out.println(palindromeCheck("madam"));
		System.out.println(isPalindrome("abba", 0, 3));
	}

	// Time : O(n)
	// Space : O(1)
	private static boolean palindromeCheck(String str) {

		int l = 0;
		int r = str.length() - 1;
		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	// using recursion
	// Time : O(n)
	// Space : O(n)
	private static boolean isPalindrome(String str, int left, int right) {

		if (left >= right) {
			return true;
		}
		if (str.charAt(left) != str.charAt(right)) {
			return false;
		}
		return isPalindrome(str, ++left, --right);
	}
}
