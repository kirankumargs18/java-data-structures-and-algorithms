package com.kirangs.basicmaths.ta.bitmanipulation;

public class BitWiseOperators {

    public static void main(String[] args) {

//	System.out.println(5 | 9);
//	System.out.println(5 & 9);
//	System.out.println(5 ^ 9);

	// LeftShift (<<) Operator or multiply by 2^n where n is number of
	// times we are left shifting, for example 10<<1 = 10*2 = 20, 10<<2 = 10*2*2 =
	// 40, basically left shifting by once is multiplying by 2
	// Left shift fills empty spaces with 0 after shifitng

//	System.out.println(10 << 1);
//	System.out.println(10 << 2);
//	System.out.println(2 << 1);

	// RightShift (<<) Operator or dividing by 2^n where n is number of
	// times(floor division) we are right shifting, for example 10>>1 = 10/2 =5,
	// 10>>2 = 10/2^2 =1, basically right shifting by once is dividing by 2
	// Right shift fills empty spaces with MSB(Most significant Bit) after shifitng

	System.out.println(100 >> 1);
	System.out.println(100 >> 2);
	System.out.println(100 >> 3);
	System.out.println(-5 >> 1);

	// Tripple Right Shift, fills empty spaces with 0
	// For positive numbers tripple shift works in the same way
	// for negative numbers, we will find the difference
	// in case of right shift, we undo 2's complement but in case of tripple right
	// shift we wont undo, we just convert it to decimal
	System.out.println(100 >>> 1);
	System.out.println(-5 >> 1);
	System.out.println(-5 >>> 1);

	// negation ~n = -(n+1)

	System.out.println(~2);
    }

}
