package com.kirangs;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class ValidPerfectSquare {

	public static void main(String[] args) {

		System.out.println(naiveSolution(16));
		System.out.println(naiveSolution(14));
		System.out.println(naiveSolution(0));
		System.out.println(naiveSolution(1));

	}

	// O(logN)
	// O(1)
	private static boolean optimalSolution(int num) {

		int l = 1;
		int h = num;
		while (l <= h) {
			int m = (l + h) / 2;
			int mySqr = m * m;
			if (mySqr == num) {
				return true;
			} else if (m > num / m) {
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		return false;
	}

	// O(sqrt(N))
	private static boolean naiveSolution(int num) {
		int i = 1;
		while (i * i <= num) {
			if (i == num / i) {
				return true;
			}
			i++;
		}
		return false;
	}
}
