package com.kirangs;

public class TransposeOfAMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print(matrix);
		System.out.println();
//		naiveSolution(matrix);
		optimalSolution(matrix);
		print(matrix);
	}

	private static int[][] optimalSolution(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
	}

	// Time : O(MN)
	// Space : O(MN)
	private static int[][] naiveSolution(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;
		int[][] temp = new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				temp[i][j] = matrix[j][i];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = temp[i][j];
			}
		}
		return matrix;
	}

	private static void print(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
