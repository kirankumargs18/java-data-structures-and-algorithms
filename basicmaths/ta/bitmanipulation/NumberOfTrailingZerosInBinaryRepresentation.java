package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class NumberOfTrailingZerosInBinaryRepresentation {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    int n = scanner.nextInt();
	    System.out.println("Number of trailing zeros  : " + numberOfTrailingZeros(n));
	    System.out.println("Number of trailing zeros  : " + numberOfTrailingZerosOptimized(n));
	}
    }

    // Efficient Approach is finding position of the right most set bit, after that
    // all we have 0s only

    // Idea is to preserve the right most set bit and doing log(it)

    // Time : O(1)
    // Space : O(1)

    private static int numberOfTrailingZerosOptimized(int n) {

	if (n == 0) {
	    return -1;
	}

	return (int) (Math.log(((n & (n - 1)) ^ n)) / Math.log(2));

    }

    // Time : log(N)
    // Space : O(1)
    private static int numberOfTrailingZeros(int n) {

	int count = 0;
	int temp = 1;

	if (n == 0) {
	    return -1;
	}
	while ((n & temp) == 0) {
	    count += 1;
	    temp = temp << 1;
	}
	return count;
    }
}
