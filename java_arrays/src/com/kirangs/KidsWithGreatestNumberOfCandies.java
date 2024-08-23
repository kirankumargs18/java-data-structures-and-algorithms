package com.kirangs;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {

	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int n = candies.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, candies[i]);
		}
		List<Boolean> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (candies[i] + extraCandies >= max) {
				result.add(true);
			} else {
				result.add(false);
			}
		}
		return result;
	}

}
