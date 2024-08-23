package com.kirangs.geeks;

public class PrintOneToNUsingRecursion {
	public static void main(String[] args) {
		print(5);
		System.out.println();
		printOneToN(5);
	}
	
	
	private static void print(int n) {
		if (n < 1) {
			return;
		}
		System.out.print(n + " ");
		print(n - 1);
	}
	
	private static void printOneToN(int n) {
		if (n < 1) {
			return;
		}
		printOneToN(n - 1);
		System.out.print(n + " ");
	}

}
