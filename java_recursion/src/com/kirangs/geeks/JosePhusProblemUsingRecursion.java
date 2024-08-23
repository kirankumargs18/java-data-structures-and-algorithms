package com.kirangs.geeks;

public class JosePhusProblemUsingRecursion {
	
	public static void main(String[] args) {
		
		System.out.println(josePhus(7, 3));
		System.out.println(josePhus(5, 2));
	}
	
	
	private static int josePhus(int n, int k) {
		if (n == 1) {
			return 0;
		}
		return (josePhus(n - 1, k) + k) % n;
	}

}
