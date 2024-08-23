package com.kirangs.practice;

public class MatrixBoundaryTraversal {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boundaryTraversal(matrix);
	}

	private static void boundaryTraversal(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		// matrix has only one column
		if (n == 1) {
			for (int row = 0; row < m; row++) {
				System.out.print(matrix[row][n - 1] + " ");
			}
			// matrix has only one row
		} else if (m == 1) {
			for (int col = 0; col < n; col++) {
				System.out.print(matrix[m - 1][col] + " ");
			}
		} else {
			// first row (left to right)
			for (int col = 0; col < n; col++) {
				System.out.print(matrix[0][col] + " ");
			}

			// last column (top to bottom)
			for (int row = 1; row < m; row++) {
				System.out.print(matrix[row][n - 1] + " ");
			}

			// last row (right to left)
			for (int col = n - 2; col >= 0; col--) {
				System.out.print(matrix[m - 1][col] + " ");
			}

			// first column (bottom to top)
			for (int row = m - 2; row >= 1; row--) {
				System.out.print(matrix[row][0] + " ");
			}
		}
	}
}
