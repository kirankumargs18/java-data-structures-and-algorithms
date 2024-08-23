package com.kirangs.basicmaths.tyf;

public class IsPrime {

    public static void main(String[] args) {

	System.out.println(isPrime(7));
	System.out.println(isPrime(5));
	System.out.println(isPrime(6));
	System.out.println(isPrime(1));

	System.out.println(isPrimeSolution(7));
	System.out.println(isPrimeSolution(5));
	System.out.println(isPrimeSolution(6));
	System.out.println(isPrimeSolution(1));

    }

    // brute force
    private static boolean isPrime(int num) {

	if (num == 1) {
	    return false;
	}
	for (int i = 2; i < num; i++) {
	    if (num % i == 0) {
		return false;
	    }
	}
	return true;
    }

    // O(sqrt(n))
    private static boolean isPrimeSolution(int num) {

	int count = 0;
	for (int i = 1; i * i <= num; i++) {
	    if (num % i == 0) {
		count++;
	    }
	}
	return count == 2;
    }
}
