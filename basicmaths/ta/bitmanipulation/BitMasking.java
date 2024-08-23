package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Scanner;

public class BitMasking {

    public static void main(String[] args) {

	// setting ith bit to 1 where i values starts from 0

	// example if n= 00000101 (5)
	// i=3;
	// output : 00001101 (13)
	// we will use bitwise OR here

	int n = 5;
	int i = 3;
	int onMask = 1 << i;

	System.out.println(n | onMask);

	// setting ith bit to 0 where i values again starts from 0
	// i=2
	// example if n = 00000101 (5)
	// output : 00000001 (1)
	// we will use bitwise AND here

	int n1 = 5;
	int i1 = 2;
	int offMask = ~(1 << i1);

	System.out.println(n1 & offMask);

	// TOGGLE (flipping the bit[1 to 0 or 0 to 1])
	// example if n= 00001010
	// i=3, 3rd bit(4th from right)
	// output : 00000010

	int n2 = 10;
	int i2 = 3;
	int toggleMask = 1 << i2;

	System.out.println(n2 ^ toggleMask);

	// Check ith bit is ON or OFF
	// we will use AND here

	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.println("Enter number : ");
	    int n3 = scanner.nextInt();

	    System.out.println("Enter position of the bit to be checked : ");
	    int i3 = scanner.nextInt();

	    int mask = 1 << i3;

	    if ((n3 & mask) == 0) {
		System.out.println("OFF");
	    } else {
		System.out.println("ON");
	    }
	}
    }
}
