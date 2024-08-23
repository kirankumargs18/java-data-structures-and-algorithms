package com.kirangs.basicmaths.tyf;

public class CountDigitsInNumber {

    public static void main(String[] args) {

	System.out.println(countDigits(1234));
	System.out.println(countDigits(1));
	System.out.println(countDigits(100));

    }

    
    /*
     * Time Complexity : O(numberOfDigits) 
     * Space Complexity : O(1)
     */

    private static int countDigits(int n) {

	int count = 0;
	while (n > 0) {

	    // int digit = n % 10;
	    count = count + 1;
	    n = n / 10;
	}
	return count;
    }
    
    
    /*Other solutions
    
    1. Convert Integer to String and return length of the string
    2. Log10(n)+1 This gives us number of digits
    */

}
