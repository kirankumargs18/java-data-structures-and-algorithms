package com.kirangs.basicmaths.gfg;

public class CountDigits {

    public static void main(String[] args) {
	
	
	System.out.println(countDigits(1000));
	System.out.println(countDigits(123));
    }

    //Time : O(numberOfDigits)
    //Space : O(1)
    private static int countDigits(int n) {

	int count = 0;

	while (n != 0) {
	    n = n / 10;
	    count++;
	}
	return count;
    }

}
