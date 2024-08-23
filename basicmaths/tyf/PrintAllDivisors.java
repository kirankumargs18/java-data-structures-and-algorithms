package com.kirangs.basicmaths.tyf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {

    public static void main(String[] args) {

	printAllDivisors(16);
	printAllDivisors(33);
	printAllDivisors(56);

	System.out.println(printAllDivisorsSolution(16));
	System.out.println(printAllDivisorsSolution(33));
	System.out.println(printAllDivisorsSolution(56));

    }

    /*
     * Time : O(n) Space : O(1)
     */
    private static void printAllDivisors(int n) {
	for (int i = 1; i <= n; i++) {
	    if (n % i == 0) {
		System.out.print(i + " ");
	    }
	}
	System.out.println();
    }

    /*
     * Time : O(sqrt(N)), Space : O(1)
     */
    private static List<Integer> printAllDivisorsSolution(int n) {

	List<Integer> divisors = new ArrayList<>();

	for (int i = 1; i * i <= n; i++) {
	    if (n % i == 0) {
		divisors.add(i);
		if (i != (n / i)) {
		    divisors.add(n / i);
		}
	    }

	}
	Collections.sort(divisors);

	return divisors;
    }

}
