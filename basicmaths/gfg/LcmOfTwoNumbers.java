package com.kirangs.basicmaths.gfg;

public class LcmOfTwoNumbers {

    public static void main(String[] args) {

	System.out.println(lcmOfTwoNumbers(20, 15));
	System.out.println(lcmOfTwoNumbers(5, 7));
	
	System.out.println(lcm(20, 15));
	System.out.println(lcm(5, 7));

    }

    // Efficient Solution using gcd
    // a*b = gcd(a,b)*lcm(a,b)

    // lcm(a,b) = (a*b)/gcd(a,b)

    // Time : O(log(min(a,b))
    // Space : O(1)
    private static int lcm(int a, int b) {

	return (a * b) / (gcd(a, b));
    }

    // Time : O(log(min(a,b))
    // Space : O(1)
    private static int gcd(int a, int b) {
	while (a > 0 && b > 0) {
	    if (a > b) {
		a = a % b;
	    } else {
		b = b % a;
	    }
	}
	return a == 0 ? b : a;
    }

    // Naive Solution

    // Time : O(a*b - max(a,b))
    // Space : O(1)

    private static int lcmOfTwoNumbers(int a, int b) {

	int res = Math.max(a, b);
	while (true) {
	    if (res % a == 0 && res % b == 0) {
		break;
	    }
	    res++;
	}
	return res;
    }

}
