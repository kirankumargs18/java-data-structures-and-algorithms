package com.kirangs;

public class RotateMatrixAntiClockWiseBy90 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print(matrix);
		System.out.println();
//		naiveSolution(matrix);
		optimalSolutionClockWise(matrix);
		print(matrix);

	}

	// Compute transpose and reverse indivisual columns
	// Time : O(N^2)
	// Space : O(1)
	private static int[][] optimalSolution(int[][] matrix) {

		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int low = 0;
			int high = n - 1;
			while (low < high) {
				int temp = matrix[low][i];
				matrix[low][i] = matrix[high][i];
				matrix[high][i] = temp;
				low++;
				high--;
			}
		}
		return matrix;
	}

	// anticlockwise
	private static int[][] naiveSolution(int[][] matrix) {
		int n = matrix.length;
		int[][] temp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[n - j - 1][i] = matrix[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = temp[i][j];
			}
		}
		return matrix;
	}

	// Compute transpose and reverse indivisual rows
	private static int[][] optimalSolutionClockWise(int[][] matrix) {

		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			int low = 0;
			int high = n - 1;
			while (low < high) {
				int temp = matrix[i][low];
				matrix[i][low] = matrix[i][high];
				matrix[i][high] = temp;
				low++;
				high--;
			}
		}
		return matrix;
	}

	// clcokwise
	private static int[][] naiveSolutionOne(int[][] matrix) {
		int n = matrix.length;
		int[][] temp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[j][n - i - 1] = matrix[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
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
