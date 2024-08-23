package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class DecimalToBinary {

    // Time : O(N)
    // Space : O(N)
    static void decimalToBinary(int n) {
	if (n < 1) {
	    return;
	} else {
	    decimalToBinary(n / 2);
	    System.out.print((n % 2) + " ");
	}
    }

    // Time : O(logN)
    // Space : O(1)
    static String decimalToBinaryIterative(int n) {
	String res = " ";
	while (n >= 1) {
	    int x = n % 2;
	    n = n / 2;
	    res = x + " " + res;
	}
	return res;
    }

    // Time : O(Length of binary string)
    // Space : O(1)
    static int binaryToDecimal(String binary) {
	int result = 0;
	int powerOfTwo = 1;

	for (int i = binary.length() - 1; i >= 0; i--) {
	    if (binary.charAt(i) == '1') {
		result += powerOfTwo;
	    }
	    powerOfTwo = powerOfTwo * 2;
	}
	return result;
    }

    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
//	    int n = scanner.nextInt();
//	    decimalToBinary(n);
//	    System.out.println();
//	    String b = decimalToBinaryIterative(n);
//	    System.out.println(b);

	    int res = binaryToDecimal("101");
	    System.out.println("Result : " + res);
	}
    }
}
