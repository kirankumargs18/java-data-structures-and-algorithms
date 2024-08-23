package com.kirangs.basicmaths.ta.basicmaths;

import java.util.Scanner;

public class AllPrimeNumberBelowN {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = scanner.nextInt();
	primeNumbers(n);
	scanner.close();

    }

    // Sieve of Eratosthenes
    // Time : O(n)
    // Space : O(n)

    private static void sievePrimeNumbers(int n) {

	boolean[] isPrime = new boolean[n + 1];
	for (int i = 2; i <= n; i++) {
	    if (!isPrime[i]) {
		System.out.print(i + " ");
		for (int j = 2 * i; j <= n; j = j + i) {
		    isPrime[j] = true;
		}
	    }
	}
    }

    // we can make it above solution be more optimized if we can try to start
    // marking from first unmarked multiple instead of from first multiple

    private static void primeNumbersOptimized(int n) {

	boolean[] isPrime = new boolean[n + 1];
	for (int i = 2; i <= n; i++) {
	    if (!isPrime[i]) {
		System.out.print(i + " ");
		for (int j = i * i; j <= n; j = j + i) {
		    isPrime[j] = true;
		}
	    }
	}
    }

    // the above solution still Optimized, we can make outer loop to run from 2 to
    // sqrt(n) as we are marking first unmarked multiple
    // for example if n=100, the we don't have to check for 11 as it 11^2 is 121

    // Time : O(sqrt(n)log(log(n))) since n/2+n/3+n/5+n/7+..... = log(log(n))
    // Space : O(n)
    private static void primeNumbers(int n) {

	boolean[] isPrime = new boolean[n + 1];
	for (int i = 2; i * i <= n; i++) {
	    if (!isPrime[i]) {
		System.out.print(i + " ");
		for (int j = i * i; j <= n; j = j + i) {
		    isPrime[j] = true;
		}
	    }
	}
    }

    // BruteForce

    // Time : O(n*sqrt(n))
    // Space : O(1)
    private static void primeNumbersOne(int n) {

	for (int i = 2; i < n; i++) { // -----------------> n times
	    if (checkPrime(i)) { // ------------------> sqrt(n) times
		System.out.print(i + " ");
	    }
	}

    }

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
}
