package com.kirangs.basicmaths.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {

	System.out.println(reverseInteger(-123));

    }

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed. If
     * reversing x causes the value to go outside the signed 32-bit integer range
     * [-231, 231 - 1], then return 0.
     */
    private static int reverseInteger(int x) {

	long rev = 0;
	while (x != 0) {
	    rev = (rev * 10) + (x % 10);
	    x = x / 10;
	}
	return (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) ? 0 : (int) rev;
    }

}
