package com.kirangs.geeks;

public class PalindromeCheckUsingRecursion {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("madam", 0));
		System.out.println();
		System.out.println(isPalindrome("Kiran", 0));

	}

	private static boolean isPalindrome(String str, int start) {
		int n = str.length();
		if (start >= n / 2) {
			return true;
		}
		if (Character.compare(str.charAt(start), str.charAt(n - start - 1)) != 0) {
			return false;
		}
		return isPalindrome(str, start + 1);
	}
}
