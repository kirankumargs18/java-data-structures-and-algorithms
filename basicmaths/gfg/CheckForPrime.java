package com.kirangs.basicmaths.gfg;

public class CheckForPrime {

    public static void main(String[] args) {

	System.out.println(isPrimeNaiveSolution(811));
	System.out.println(isPrimeNaiveSolution(821));
	System.out.println(isPrimeNaiveSolution(900));

	System.out.println(isPrimeEfficientSolution(811));
	System.out.println(isPrimeEfficientSolution(821));
	System.out.println(isPrimeEfficientSolution(900));

	System.out.println(isPrime(811));
//	System.out.println(isPrime(821));
//	System.out.println(isPrime(900));

    }

    // Optimizing below approach by adding checks n%2==0 and n%3==0, so that we can
    // save many iterations

    private static boolean isPrime(int n) {

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

    // Efficient approach using divisors concept
    // Time : O(sqrt(n))
    // Space : O(1)

    // 30: 1,2,3,5,6,10,15,30 (1,30) divisors, (2,15), (3,10), (5,6), (6,5) divisors
    // in pairs

    private static boolean isPrimeEfficientSolution(int n) {

	if (n == 1) {
	    return false;
	}

	for (int i = 2; i * i <= n; i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }

    // BruteForce
    // Time : O(n)
    // Space : O(1)
    private static boolean isPrimeNaiveSolution(int n) {
	if (n == 1) {
	    return false;
	}
	for (int i = 2; i < n; i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }

}
