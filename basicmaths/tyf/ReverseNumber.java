package com.kirangs.basicmaths.tyf;

public class ReverseNumber {

    public static void main(String[] args) {
	
	System.out.println(reverseNumber(123));
	System.out.println(reverseNumber(1));

    }

    /*
     * Time Complexity : O(numberOfDigits) 
     * Space Complexity : O(1)
     */
    private static int reverseNumber(int n) {
	int rev = 0;
	while (n > 0) {
	    rev = (rev * 10) + (n % 10);
	    n = n / 10;
	}
	return rev;
    }

}
