package com.kirangs.basicmaths.ta.basicmaths;

import java.util.Scanner;

public class CheckForPrime {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = scanner.nextInt();
	System.out.println(checkPrime(n));
	scanner.close();

    }

    // Time : O(sqrt(n))
    // Space : O(1)

    // first factor will always be found before sqrt(n) or at sqrt(n)
    private static boolean isPrime(int n) {
	for (int i = 2; i * i <= n; i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }

    // more optimized way of above approach
    private static boolean checkPrime(int n) {

	if (n == 1) {
	    return false;
	}

	if (n == 2 || n == 3) {
	    return true;
	}

	if (n % 2 == 0 || n % 3 == 0) {
	    return false;
	}
	for (int i = 5; i * i <= n; i = i + 6) {
	    if (n % i == 0 || n % (i + 2) == 0) {
		return false;
	    }
	}
	return true;
    }

    // Time : O(n)
    // Space : O(1)

    // max factor can be n/2
    private static boolean isPrimeOne(int n) {
	for (int i = 2; i <= n / 2; i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
