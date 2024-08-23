package com.kirangs;

public class CanPlaceFlowers {

	public static void main(String[] args) {

		int[] flowerbed = { 1, 0, 1, 0, 1, 0, 1 };
		System.out.println(naiveSolution(flowerbed, 1));

		int[] flowerbed1 = { 1, 0, 0, 0, 1 };
		System.out.println(naiveSolution(flowerbed1, 1));

	}

	private static boolean naiveSolution(int[] flowerbed, int n) {
		int len = flowerbed.length;
		for (int i = 0; i < len; i++) {
			int left = i == 0 ? 0 : flowerbed[i - 1];
			int right = i == len - 1 ? 0 : flowerbed[i + 1];
			if (left + flowerbed[i] + right == 0) {
				flowerbed[i] = 1;
				n--;
			}
		}
		return n <= 0;
	}

}
