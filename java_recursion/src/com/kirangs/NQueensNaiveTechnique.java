package com.kirangs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueensNaiveTechnique {

	public static void main(String[] args) {

		System.out.println(solveNQueens(4));

	}

	private static List<List<String>> solveNQueens(int n) {

		List<List<String>> res = new ArrayList<>();
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		nQueens(0, board, res);
		return res;
	}

	// Time : O(n^2)
	private static void nQueens(int col, char[][] board, List<List<String>> res) {

		int n = board.length;
		if (col == n) {
			res.add(construct(board));
			return;
		}
		for (int row = 0; row < n; row++) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				nQueens(col + 1, board, res);
				board[row][col] = '.';
			}
		}
	}

	// Time : O(n+n+n)
	private static boolean isSafe(int row, int col, char[][] board) {

		int r = row;
		int c = col;

		while (row >= 0 && col >= 0) {
			if (board[row][col] == 'Q') {
				return false;
			}
			row--;
			col--;
		}

		row = r;
		col = c;

		while (col >= 0) {
			if (board[row][col] == 'Q') {
				return false;
			}
			col--;
		}

//		row = r;
		col = c;
		while (col >= 0 && row < board.length) {
			if (board[row][col] == 'Q') {
				return false;
			}
			row++;
			col--;
		}
		return true;
	}

	private static List<String> construct(char[][] board) {
		List<String> res = new LinkedList<>();
		for (int i = 0; i < board.length; i++) {
			String s = new String(board[i]);
			res.add(s);
		}
		return res;
	}

}
