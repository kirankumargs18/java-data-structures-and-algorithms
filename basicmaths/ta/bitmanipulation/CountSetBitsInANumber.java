package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class CountSetBitsInANumber {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.println("Enter number : ");
	    int n = scanner.nextInt();
	    System.out.println("Number of Set Bits : " + countSetBits(n));
	}

    }

    // Time : O(logN)
    // Space : O(1)

    // Here we will use the concept doing (n & n-1) will set the right most set bit
    // to 0, assign back to n, we will keep repeating until n becomes 0
    private static int countSetBits(int n) {

	int count = 0;
	while (n > 0) {
	    n = (n & (n - 1)); // this will set right most set bit to 0 and assig value back to n
	    count++;
	}
	return count;
    }

}
