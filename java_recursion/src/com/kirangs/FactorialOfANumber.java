package com.kirangs;

public class FactorialOfANumber {

	public static void main(String[] args) {
		System.out.println(function(3));
		System.out.println(function(5));
	}

	// Time : O(N)
	// Space : O(N)
	private static int function(int n) {
		
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * function(n - 1);
	}
}
