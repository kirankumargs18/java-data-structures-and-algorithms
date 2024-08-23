package com.kirangs.geeks;

public class RopeCuttingProblem {
	
	public static void main(String[] args) {
		
//		System.out.println(maxPieces(5, 5, 4, 3));
		System.out.println(maxPieces(23, 11, 9, 12));
		
	}

	private static int maxPieces(int n, int a, int b, int c) {

		if (n == 0) {
			return 0;
		}
		if (n < 1) {
			return -1;
		}
		int temp1 = maxPieces(n - a, a, b, c);
		int temp2 = maxPieces(n - b, a, b, c);
		int temp3 = maxPieces(n - c, a, b, c);

		int res = Math.max(Math.max(temp1, temp2), temp3);

		if (res == -1) {
			return -1;
		}
		return res + 1;
	}
}
