package com.kirangs.geeks;

public class NaturalNumberSumUsingRecursion {
	
	public static void main(String[] args) {
		
		System.out.println(sum(30));
		
	}

	private static int sum(int n) {
		if (n == 1) {
			return n;
		}
		return n + sum(n - 1);
	}
}
