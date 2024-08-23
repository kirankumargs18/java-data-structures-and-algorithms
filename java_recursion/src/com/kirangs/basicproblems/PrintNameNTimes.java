package com.kirangs.basicproblems;

public class PrintNameNTimes {

	public static void main(String[] args) {

		function(1, 5);
	}

	// Time : O(N)
	// Space : O(N)
	private static void function(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println("Kiran");
		function(i + 1, n);
	}

}
