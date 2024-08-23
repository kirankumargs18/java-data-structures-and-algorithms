package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class SwapAllEvenAndOddBitsInBinaryRepresentation {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    int n = scanner.nextInt();
	    System.out.println("Result after swapping : " + swapBits(n));
	}
    }

    // Time : O(1)
    // Space : O(1)
    private static int swapBits(int n) {

	return (((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1));
    }
}


/**
 * Swap all even and odd bits
==========================

The idea is to preserve even and odd bits and doing tripple right shift and left accordingly.
Doing OR between these 2 result in binary representation where even and odd bits swapped 

example 1 0 1 1 0 1 0 1 (181)

preserving even bits : 

n & 0xAAAAAAAA (n & -14316555766) 

1 0 1 1 0 1 0 1
1 0 1 0 1 0 1 0  (&)
===============
1 0 1 0 0 0 0 0  we have all even bits preserved with odd bits disappeared

doing tripple right shift by 1 to above give us all even bits at odd position

0 1 0 1 0 0 0 0  this has all even bits at odd position   ------> 1


preserving odd bits :

n & 0x55555555 (n & 1436555766)

1 0 1 1 0 1 0 1
0 1 0 1 0 1 0 1
===============
0 0 0 1 0 1 0 1 we have all odd bits with even bits disappeared 

left shift by 1 to above gives us all odd bits are at even position

0 0 1 0 1 0 1 0 this has all odd bits at even position  --------> 2

doing OR between (1) & (2)

0 1 0 1 0 0 0 0
0 0 1 0 1 0 1 0 (OR)
=============== 
0 1 1 1 1 0 1 0   ==> This has all even and odd bits swapped
 * */