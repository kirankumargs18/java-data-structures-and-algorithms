package com.kirangs;

public class TestMain {

	public static void main(String[] args) {

//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
//		int[][] arr = new int[2][3];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = 10;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		int[][] arr = new int[4][];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
