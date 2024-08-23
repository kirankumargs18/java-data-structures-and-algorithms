package com.kirangs;

import java.util.ArrayList;
import java.util.List;

public class SpriralTraversalOfTheMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> res = betterSolution(matrix);
		System.out.println(res);
	}

	private static List<Integer> betterSolution(int[][] matrix) {

		int r = matrix.length;
		int c = matrix[0].length;
		int top = 0;
		int left = 0;
		int right = c - 1;
		int bottom = r - 1;
		List<Integer> ints = new ArrayList<>();
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				ints.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				ints.add(matrix[i][right]);
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					ints.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ints.add(matrix[i][left]);
				}
				left++;
			}
		}
		return ints;
	}

}
