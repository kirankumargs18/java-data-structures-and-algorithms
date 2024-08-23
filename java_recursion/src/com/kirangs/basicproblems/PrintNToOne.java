package com.kirangs.basicproblems;

import java.util.Scanner;

public class PrintNToOne {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of N : ");
		int n = scanner.nextInt();
		function(n, n);
		scanner.close();
	}

	// Time : O(N)
	// Space : O(N)
	private static void function(int i, int n) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		function(i - 1, n);
	}
}
