package com.kirangs.bitmanipulation;

import java.util.Scanner;

public class CheckNthBitIsSetOrNot {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    int n = scanner.nextInt();
	    int k = scanner.nextInt();
	    System.out.println(checkNthSetBitOrNot(n, k));
	    System.out.println(checkNthSetBitOrNotOptimized(n, k));
	    System.out.println(checkNthSetBitOrNotUsingTrippleRightShift(n, k));
	}
    }

    /**
     * Time : O(1) Space : O(1)
     */
    private static String checkNthSetBitOrNotOptimized(int n, int k) {

	if (n <= 0) {
	    return "No";
	}

	if ((n & (1 << (k - 1))) != 0) {
	    return "Yes";
	}
	return "No";

    }

    private static String checkNthSetBitOrNotUsingTrippleRightShift(int n, int k) {

	if (n <= 0) {
	    return "No";
	}

	if (((n >>> (k - 1)) & 1) != 0) {
	    return "Yes";
	}
	return "No";

    }

    /**
     * Time : O(k) Space : O(1)
     */
    private static String checkNthSetBitOrNot(int n, int k) {

	if (n <= 0) {
	    return "Yes";
	}
	int x = 1;
	for (int i = 0; i < (k - 1); i++) {
	    x = x * 2;
	}
	if ((n & x) != 0) {
	    return "Yes";
	}
	return "No";
    }

}

