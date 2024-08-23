package com.kirangs.geeks;

public class SumOfDigitsUsingRecursion {
	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(999));
	}
	
	private static int sumOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sumOfDigits(n/10);
	}
}
