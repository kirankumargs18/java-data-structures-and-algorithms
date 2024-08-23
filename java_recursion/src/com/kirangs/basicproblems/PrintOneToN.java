package com.kirangs.basicproblems;

import java.util.Scanner;

public class PrintOneToN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		function(1, n);
		scanner.close();
	}

	// Time : O(N)
	// Space : O(N)
	private static void function(int i, int n) {

		if (i > n) {
			return;
		}
		System.out.println(i);
		function(i + 1, n);
	}
}
