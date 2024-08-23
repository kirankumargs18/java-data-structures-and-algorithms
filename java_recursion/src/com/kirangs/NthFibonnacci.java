package com.kirangs;

public class NthFibonnacci {

	public static void main(String[] args) {

		System.out.println(function(4));
		System.out.println(function(5));
	}

	private static int function(int n) {

		if (n == 1 || n == 0) {
			return n;
		}
		int last = function(n - 1);
		int secondLast = function(n - 2);
		return last + secondLast;
	}

//	private static int function(int n) {
//
//		if (n == 1 || n == 0) {
//			return n;
//		}
//		return function(n - 1) + function(n - 2);
//	}
}
