package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class ReverseBitsInBinary {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.print("Enter number : ");
	    int n = scanner.nextInt();
	    System.out.println("Value after reversing bits : " + reverseBits(n));
	}
    }

    // Time : logN
    // Space : O(1)
    private static int reverseBits(int n) {

	int f = 31;
	int l = 0;

	int rev = 0;

	while (f > l) {

	    // check if f bit is set in n
	    if ((n & (1 << f)) != 0) {

		// set l bit in rev
		rev = rev | (1 << l);
	    }

	    // check if l bit is set in n
	    if ((n & (1 << l)) != 0) {

		// set f bit in rev
		rev = rev | (1 << f);
	    }
	    f--;
	    l++;
	}
	return rev;
    }

}
