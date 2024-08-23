package com.kirangs.basicmaths.ta.basicmaths;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

	try (Scanner scanner = new Scanner(System.in)) {

	    System.out.print("Enter number : ");
	    int n = scanner.nextInt();
	    primeFactors(n);
	    
	    System.out.println();
	    
	    primeFactorsOptimized(n);
	}

    }

    // Time : O(nlogn) (for prime numbers it will always take O(n))
    // Space : O(1)
    private static void primeFactors(int n) {
	int i = 2;
	while (n > 1) {
	    while (n % i == 0) {
		System.out.print(i + " ");
		n = n / i;
	    }
	    i++;
	}
    }

    // Time : O(sqrt(n)logn)
    // Space : O(1)
    // Always atleast first factor will be found before the sqrt(n)

    private static void primeFactorsOptimized(int n) {
	int i = 2;
	while (i * i <= n) {
	    while (n % i == 0) {
		System.out.print(i + " ");
		n = n / i;
	    }
	    i++;
	}
	if (n != 1) {
	    System.out.println(n);
	}
    }

}
