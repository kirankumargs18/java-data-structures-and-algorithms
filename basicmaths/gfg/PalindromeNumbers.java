package com.kirangs.basicmaths.gfg;

public class PalindromeNumbers {

    public static void main(String[] args) {

	System.out.println(isPalindrome(123));
	System.out.println(isPalindrome(123321));
    }

    //Time : O(numberOfDigits
    //Space : O(1)
    private static boolean isPalindrome(int n) {
	int temp = n;
	int rev = 0;

	while (temp != 0) {
	    rev = rev * 10 + (temp % 10);
	    temp = temp / 10;
	}
	return rev == n;
    }

}
