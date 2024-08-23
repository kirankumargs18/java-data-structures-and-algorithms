package com.kirangs.basicmaths.gfg;

/**
 * Binary Exponenstiation
 * 
 * x=4, n= 5
 * 
 * 5 : 0 1 0 1 
 *     4^3 4^2 4^1 4^0
 */
public class IterativePower {

    public static void main(String[] args) {

	System.out.println(power(2, 5));

    }

    // Time : O(logN)
    // Space : O(1)
    private static int power(int x, int n) {

	int res = 1;

	while (n > 0) {

	    if (n % 2 != 0) {
		res = res * x;
	    }
	    x = x * x;
//	    n = n / 2;
	    n = n >> 1;
	}
	return res;
    }

}
