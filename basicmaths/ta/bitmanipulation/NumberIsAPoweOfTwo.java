package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

/**
 * Asked in Adobe Interview
 */
public class NumberIsAPoweOfTwo {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.println("Enter number : ");
	    int n = scanner.nextInt();
	    if (isNumberPowerOfTwo(n)) {
		System.out.println("Yes, " + n + " can be represented in powers of 2");
	    } else {
		System.out.println("No, " + n + " can't be represented in powers of 2");
	    }
	}

    }

    // Time : O(1)
    // Space : O(1)

    // we know that if a number is power of 2, it has only one set bit.
    // As we know if we do n&(n-1) it will set the right most set bit to 0,
    // as these numbers have only one set bit number becomes zero
    private static boolean isNumberPowerOfTwo(int n) {
	if (n == 0) {
	    return false;
	}
	return (n & (n - 1)) == 0;
    }
}
