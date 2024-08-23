package com.kirangs.basicmaths.leetcode;

public class IsPalindrome {

    public static void main(String[] args) {

	System.out.println(isPalindrome(123));
	System.out.println(isPalindrome(121));
    }

    /**
     * Given an integer x, return true if x is a palindrome ,
     *  and false otherwise.
     * 
     */
    public static boolean isPalindrome(int x) {
	int temp = x;
	int rev = 0;
	while (x > 0) {
	    rev = (rev * 10) + (x % 10);
	    x = x / 10;
	}
	if (temp == rev) {
	    return true;
	}
	return false;
    }

}
