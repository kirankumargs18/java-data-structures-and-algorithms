package com.kirangs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//904. Fruit Into Baskets
public class FruitsIntoBuckets {

	public static void main(String[] args) {

		int[] fruits = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
		System.out.println(naiveSolution(fruits));
		System.out.println(optimalSolution(fruits));

		int[] fruits1 = { 0, 1, 2, 2 };
		System.out.println(naiveSolution(fruits1));
		System.out.println(optimalSolution(fruits1));

		int[] fruits2 = { 1, 2, 3, 2, 2 };
		System.out.println(naiveSolution(fruits2));
		System.out.println(optimalSolution(fruits2));

	}

	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(int[] fruits) {

		int n = fruits.length;
		int maxLen = Integer.MIN_VALUE;
		int r = 0;
		int l = 0;
		Map<Integer, Integer> map = new HashMap<>();
		while (r < n) {
			if (map.containsKey(fruits[r])) {
				map.put(fruits[r], map.get(fruits[r]) + 1);
			} else {
				map.put(fruits[r], 1);
			}
			if (map.size() > 2) {
				map.put(fruits[l], map.get(fruits[l]) - 1);
				if (map.get(fruits[l]) == 0) {
					map.remove(fruits[l]);
				}
				l = l + 1;
			}
			if (map.size() <= 2) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r = r + 1;
		}
		return maxLen;
	}

	// Time : O(N^2)
	// Space : O(1)
	private static int naiveSolution(int[] fruits) {

		int n = fruits.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = i; j < n; j++) {
				set.add(fruits[j]);
				if (set.size() > 2) {
					break;
				}
				if (set.size() <= 2) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}
}
