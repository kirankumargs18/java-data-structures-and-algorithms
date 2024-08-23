package com.kirangs.basicmaths.gfg;

public class ComputingPowerOfX {

    public static void main(String[] args) {

	System.out.println(power(2, 5));
	System.out.println(power(3, 4));
	System.out.println(power(5, 0));

    }

    // Efficient Solution

    // power(x,n) = "power(x,n/2)*pow(x,n/2)" if n%2==0 else "power(x,n-1)*x
    // [power(x,n/2)*power(x,n/2)*x]"
    
    //Time : O(logN)
    private static int power(int x, int n) {
	if (n == 0) {
	    return 1;
	}
	int res = 1;
	for (int i = 1; i <= n / 2; i++) {
	    res = res * x;
	}
	int temp = res * res;
	if (n % 2 == 0) {
	    return temp;
	}
	return temp * x;
    }

    // Time : O(n)
    // Space : O(1)
    private static int powerBruteForce(int x, int n) {
	int res = 1;
	for (int i = 1; i <= n; i++) {
	    res = res * x;
	}
	return res;
    }

}
