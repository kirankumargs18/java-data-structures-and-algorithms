package com.kirangs.basicmaths.tyf;

public class GcdOfTwoNumbers {

    public static void main(String[] args) {

	System.out.println(solutionOne(13, 48));
	System.out.println(solutionOne(52, 10));
	System.out.println(solutionOne(50, 100));
	

	System.out.println(solutionTwo(13, 48));
	System.out.println(solutionTwo(52, 10));
	System.out.println(solutionTwo(50, 100));


    }

    // Time : O(min(a,b))
    // Space : O(1)
    private static int solutionOne(int a, int b) {

	int gcd = -1;
	int min = minNum(a, b);
	for (int i = 1; i <= min; i++) {

	    if ((a % i == 0) && (b % i == 0)) {
		gcd = i;
	    }
	}
	return gcd;
    }

    // Time : O(log(min(a,b))
    // Space : O(1)
    private static int solutionTwo(int a, int b) {

	while (a > 0 && b > 0) {
	    if (a > b) {
		a = a % b;
	    } else {
		b = b % a;
	    }
	}
	if (a == 0) {
	    return b;
	}
	return a;

    }

    private static int minNum(int a, int b) {
	if (a > b) {
	    return a;
	}
	return b;
    }

}
