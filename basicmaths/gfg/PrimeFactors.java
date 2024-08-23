package com.kirangs.basicmaths.gfg;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.println("Enter a Number : ");
	    int n = scanner.nextInt();
	    primeFactors(n);
	    
	    System.out.println();
	    
	    primeFactorsOptimized(n);
	}

    }

    // Time : O(sqrt(n)logn)
    // Space : O(1)
    private static void primeFactors(int n) {
	
	
	for (int i = 2; i * i <= n; i++) {
	    while (n % i == 0) {
		System.out.print(i + " ");
		n = n / i;
	    }
	}
	if (n != 1) {
	    System.out.println(n);
	}
    }

    // More Optimization to save many iterations

    private static void primeFactorsOptimized(int n) {

	if (n <= 1) {
	    return;
	}

	while (n % 2 == 0) {
	    System.out.print(2 + " ");
	    n = n / 2;
	}

	while (n % 3 == 0) {
	    System.out.print(3 + " ");
	    n = n / 3;
	}

	for (int i = 5; i * i <= n; i = i + 5) {
	    while (n % i == 0) {
		System.out.print(i + " ");
		n = n / i;
	    }
	    while (n % (i + 2) == 0) {
		System.out.print(i + " ");
		n = n / (i + 2);
	    }
	}

	if (n > 3) {
	    System.out.print(n);
	}
    }

}
