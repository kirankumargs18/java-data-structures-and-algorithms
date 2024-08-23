package com.kirangs.basicmaths.gfg;

public class FactorialOfANumber {

    public static void main(String[] args) {
	
	System.out.println(factOfNumber(10));
	System.out.println(factOfNumber(12));
	System.out.println(factOfNumber(15));
	
	System.out.println(factRecursive(10));
	System.out.println(factRecursive(12));
	System.out.println(factRecursive(15));

    }

    //Time : O(n)
    //Space : O(1)
    private static long factOfNumber(long n) {
	long res = 1;
	for (long i = 2; i <= n; i++) {
	    res = res * i;
	}
	return res;
    }
    
    //Time : O(n)
    //Space : O(n) stack space to track recursive calls
    private static long factRecursive(long n) {
	if(n==0) {
	    return 1;
	}
	return n*factRecursive(n-1);
    }
}
