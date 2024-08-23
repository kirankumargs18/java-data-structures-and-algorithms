package com.kirangs;

public class CheckIfStringIsAPalindrome {

	public static void main(String[] args) {

		String str = "121";
		System.out.println(isPalindrome(str, 0, str.length() - 1));
	}

	// Time : O(N)
	// Space : O(N)
	private static boolean isPalindrome(String str, int l, int r) {

		if (l >= r) {
			return true;
		}
		if (str.charAt(l) != str.charAt(r)) {
			return false;
		}
		return isPalindrome(str, l + 1, r - 1);
	}
}
