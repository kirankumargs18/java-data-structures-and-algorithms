package com.kirangs.basicmaths.gfg;

public class AllDivisorsOfANumber {

    public static void main(String[] args) {

	divisors(99);
	divisors(101);
	divisors(182);
	divisors(176);
//	divisorsBruteForce(16);

    }

    // Optimal Solution
    private static void divisors(int n) {

	for (int i = 1; i * i <= n; i++) {
	    if (n % i == 0) {
		System.out.print(i + " ");
		if ((n / i) != i) {
		    System.out.print((n / i) + " ");
		}
	    }
	}
	
	System.out.println();
    }

    // BruteForce
    private static void divisorsBruteForce(int n) {

	for (int i = 1; i <= n; i++) {
	    if (n % i == 0) { 
		System.out.print(i + " ");
	    }
	}
    }

}
