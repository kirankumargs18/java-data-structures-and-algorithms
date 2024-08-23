package com.kirangs.basicmaths.gfg;

public class CountTrailingZeros {

    public static void main(String[] args) {

	System.out.println(countTrailingZerosBruteForce(5));
	System.out.println(countTrailingZerosBruteForce(10));
	System.out.println(countTrailingZerosBruteForce(20));
	System.out.println(countTrailingZeros(5));
	System.out.println(countTrailingZeros(10));
	System.out.println(countTrailingZeros(20));
	
	System.out.println(countTrailingZeros(251));

    }

    // BruteForce - Find factorial and traverse it from left to right, check for
    // zeros using %10 operation and this solution has overflow issue

    // Time : O(n)
    // Space : O(1)

    private static int countTrailingZerosBruteForce(long n) {
	
	long fact = 1;
	for (long i = 2; i <= n; i++) {
	    fact = fact * i;
	}
	int res = 0;
	while (fact % 10 == 0) {
	    res++;
	    fact = fact / 10;
	}
	return res;
    }

    // Efficient Approach

    // Time : O(logN)
    // Space : O(1)

    // For every pair of 2 and 5 we will get one zero
    // basically in numbers every alteranate number is a multiple of 2, every
    // alternate 5th number is multiple of 5.
    // if we can count number of 5's we will get number of zeros

    // General formula to count number of 5's = n/5 + n/25 + n/125 + ........ till
    // n/5^n becomes zero or n is lessthan 5^something
    private static int countTrailingZeros(int n) {
	int res = 0;
	for (int i = 5; i <= n; i = i * 5) {
	    res = res + (n / i);
	}
	return res;
    }

}
