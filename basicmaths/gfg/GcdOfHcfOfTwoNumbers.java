package com.kirangs.basicmaths.gfg;

public class GcdOfHcfOfTwoNumbers {

    public static void main(String[] args) {

	System.out.println(gcdNaiveSolution(4, 10));
	System.out.println(gcdNaiveSolution(24, 30));

	System.out.println(gcdOfTwoNumbersRecursive(4, 10));
	System.out.println(gcdOfTwoNumbersRecursive(24, 30));
	
	System.out.println(gcdOfTwoNumbers(4, 10));
	System.out.println(gcdOfTwoNumbers(24, 30));

    }

    //Time : O(log(min(a,b))
    //Space : O(1)
    private static int gcdOfTwoNumbers(int a, int b) {

	while (a > 0 && b > 0) {

	    if (a > b) {
		a = a % b;
	    } else {
		b = b % a;
	    }
	}
	return a == 0 ? b : a;
    }

    // Time : O(log(min(a,b))
    // Space : O(log(min(a,b)) stack space for recursive calls
    private static int gcdOfTwoNumbersRecursive(int a, int b) {
	if (b == 0) {
	    return a;
	}
	return gcdOfTwoNumbersRecursive(b, a % b);
    }

    // Time : O(min(a,b))
    // Space : O(1)
    private static int gcdNaiveSolution(int a, int b) {

	int res = Math.min(a, b);
	while (res > 0) {
	    if ((a % res == 0) && (b % res == 0)) {
		break;
	    }
	    res--;
	}
	return res;
    }

}
