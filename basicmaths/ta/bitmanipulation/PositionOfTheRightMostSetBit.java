package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class PositionOfTheRightMostSetBit {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.println("Enter number : ");
	    int n = scanner.nextInt();
//	    int pos = positionOfTheRightmostSetBit(n);
	    int pos = positionOfTheRightmostSetBitOptimized(n);
	    System.out.println("Position of the right most set bit is " + pos);
	}
    }

    // More Efficient Way
    // Time : O(1)
    // Space : O(1)

// Algotithm

//      step 1 : Given value of n, create a mask i.e mask = (n & m)
//      step 2 : Perform XOR between n and mask and reassign it n 
//      step 3 : Update n will have only one set bit,if we can extract updated n to 2 power , then power+1 will be our answer

    private static int positionOfTheRightmostSetBitOptimized(int n) {

	if (n == 0) {
	    return -1;
	}
	int mask = (n & n - 1);
	n = (n ^ mask);
	//calculation of logN base B ==> logN/logB
	return (int) (Math.log(n) / Math.log(2)) + 1;
    }

    // Time : log(N) (number of iterations)
    // Space : O(1)
    private static int positionOfTheRightmostSetBit(int n) {

	int pos = 0;
	int mask = 1;

	if (n == 0) {
	    return -1;
	}

	while ((n & mask) == 0) {
	    pos++;
	    mask = mask << 1;
	}

	return pos + 1;
    }
}
