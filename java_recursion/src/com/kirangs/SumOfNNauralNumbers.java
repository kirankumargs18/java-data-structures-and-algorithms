package com.kirangs;

public class SumOfNNauralNumbers {

	public static void main(String[] args) {

		System.out.println(function(6));
		System.out.println(function(3));
	}

	// Time : O(N)
	// Space : O(N)
	private static int function(int n) {
		if (n == 1) {
			return 1;
		}
		return n + function(n - 1);
	}
}
