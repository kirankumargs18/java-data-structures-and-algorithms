package com.kirangs.basicmaths.tyf;

public class PalindromeNumber {

    public static void main(String[] args) {
	
	System.out.println(isPalindrome(123));
	System.out.println(isPalindrome(123321));

    }

    /*
     * Time Complexity : O(numberOfDigits) 
     * Space Complexity : O(1)
     */
    private static boolean isPalindrome(int n) {
	
	int temp = n;
	int rev = 0;
	while (n > 0) {
	    rev = (rev * 10) + (n % 10);
	    n = n / 10;
	}
	if (temp == rev) {
	    return true;
	}
	return false;
    }

}
