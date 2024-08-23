package com.kirangs.geeks;

public class NthFibanacciUsingRecursion {
	public static void main(String[] args) {
		
		System.out.println(fibanacci(7));
	}
	
	private static int fibanacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibanacci(n - 1) + fibanacci(n - 2);
	}
}
