package com.kirangs.basicmaths;

public class TestMain {

    public static void main(String[] args) {
	
	System.out.println(reverse(-1534236469));

    }

    public static int reverse(int x) {
	int temp = x;
	long rev = 0;
	if (x < 0) {
	    x = -x;
	}
	while (x > 0) {
	    int d = x % 10;
	    rev = (rev * 10) + d;
	    x = x / 10;
	}
	if (temp < 0) {
	    return (int) (rev * (-1));
	}
	return (int) rev;
    }

}
