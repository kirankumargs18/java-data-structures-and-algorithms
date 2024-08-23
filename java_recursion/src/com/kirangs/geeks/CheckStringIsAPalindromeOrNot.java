package com.kirangs.geeks;

public class CheckStringIsAPalindromeOrNot {

	public static void main(String[] args) {

		String str = "racecar";
		System.out.println(checkPalindrome(str));
		System.out.println(checkPalindromeUsingRecursion(str, 0));
	}

	private static boolean checkPalindrome(String str) {

		int start = 0;
		int end = str.length() - 1;

		while (start <= end) {
			if (Character.compare(str.charAt(start), str.charAt(end)) != 0) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	
	//using recursion
	private static boolean checkPalindromeUsingRecursion(String str,int start) {
		int n=str.length();
		if (Character.compare(str.charAt(start), str.charAt(n-start-1)) != 0) {
			return false;
		}
		start++;
		if(start>=n/2) {
			return true;
		}
		return checkPalindromeUsingRecursion(str, start);
	}

}
