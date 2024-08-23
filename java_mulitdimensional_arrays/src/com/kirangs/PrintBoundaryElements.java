package com.kirangs;

public class PrintBoundaryElements {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		solution(matrix);

	}

	private static void solution(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				System.out.print(matrix[0][i] + " ");
			}
		} else if (n == 1) {
			for (int i = 0; i < n; i++) {
				System.out.print(matrix[i][0] + " ");
			}
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print(matrix[0][i] + " ");
			}
			for (int i = 1; i < m; i++) {
				System.out.print(matrix[i][n - 1] + " ");
			}
			for (int i = n - 2; i >= 0; i--) {
				System.out.print(matrix[m - 1][i] + " ");
			}
			for (int i = m - 2; i >= 1; i--) {
				System.out.print(matrix[i][0] + " ");
			}
		}
	}

}
