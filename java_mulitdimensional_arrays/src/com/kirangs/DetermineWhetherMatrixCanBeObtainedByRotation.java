package com.kirangs;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

	public static void main(String[] args) {

		int[][] mat = { { 0, 0 }, { 1, 0 } };
		int[][] target = { { 1, 0 }, { 0, 0 } };
		System.out.println(betterSolution(mat, target));

		int[][] mat1 = { { 0, 1 }, { 1, 1 } };
		int[][] target1 = { { 1, 0 }, { 0, 1 } };
		System.out.println(betterSolution(mat1, target1));

		int[][] mat2 = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] target2 = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(betterSolution(mat2, target2));
	}

	private static boolean betterSolution(int[][] mat, int[][] target) {
		int n = mat.length;
		for (int i = 0; i < 4; i++) {
			if (checkIfEqual(mat, target)) {
				return true;
			}
			rotateClockWise(target);
		}
		return false;
	}

	private static boolean checkIfEqual(int[][] mat, int[][] target) {

		int n = mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] != target[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	private static int[][] rotateClockWise(int[][] matrix) {
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
}
