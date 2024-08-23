package com.kirangs;

public class SquareRootOfNumberFloorValue {

	public static void main(String[] args) {

		System.out.println(optimalSolution(9));

		System.out.println(optimalSolution(24));

	}

	private static int optimalSolution(int x) {

		int l = 1;
		int h = x;
		while (l <= h) {
			int m = (l + h) / 2;
			int mySq = m * m;
			if (mySq == x) {
				return m;
			} else if (mySq > x) {
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		return l-1;
	}

	// O(sqrt(x))
	// O(1)
	private static int sqrt(int x) {

		int i = 1;
		while (i * i <= x) {
			i++;
		}
		return i - 1;
	}
}
