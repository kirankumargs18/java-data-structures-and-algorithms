package com.kirangs.practice;

public class PrintMatrixInSnakePattern {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		snakePattern(matrix);

	}

	// Time : O(n*n)
	// Space : O(1)
	private static void snakePattern(int[][] matrix) {

		int n = matrix.length;
		for (int row = 0; row < n; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < n; col++) {
					System.out.print(matrix[row][col] + " ");
				}
			} else {
				for (int col = n - 1; col >= 0; col--) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
	}
}
