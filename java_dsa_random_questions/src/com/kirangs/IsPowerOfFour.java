package com.kirangs;

public class IsPowerOfFour {

	public static void main(String[] args) {

		System.out.println(naiveSolution(16));

		System.out.println(naiveSolution(20));

		System.out.println(optimalSolution(16));

		System.out.println(optimalSolution(20));

	}

	private static boolean optimalSolution(int n) {

		return n > 0 && (Math.log(n) / Math.log(2)) % 2 == 0;
	}

	// Time : Log4(N)
	// Space : Log(N)
	private static boolean naiveSolution(int n) {

		if (n == 1) {
			return true;
		}
		if (n <= 0) {
			return false;
		}
		if (n % 4 != 0) {
			return false;
		}
		return naiveSolution(n / 4);
	}

}
