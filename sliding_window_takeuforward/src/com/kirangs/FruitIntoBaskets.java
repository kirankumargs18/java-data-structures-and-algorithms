package com.kirangs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//You are visiting a farm that has a single row of fruit trees arranged from left to right. 
//The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
//You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
//You only have two baskets, and each basket can only hold a single type of fruit. 
//There is no limit on the amount of fruit each basket can hold.
//Starting from any tree of your choice, 
//you must pick exactly one fruit from every tree (including the start tree) while moving to the right.
//The picked fruits must fit in one of your baskets.
//Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//Given the integer array fruits, return the maximum number of fruits you can pick.

//Basicall this question is longest subarray with atmost 2 distinct elements
public class FruitIntoBaskets {

	public static void main(String[] args) {

		int[] fruits = { 1, 2, 1 };
		System.out.println(maxSubArrayWithAtmostTwoDistinctElementsBetter(fruits));

		int[] fruits1 = { 0, 1, 2, 2 };
		System.out.println(maxSubArrayWithAtmostTwoDistinctElementsBetter(fruits1));

		int[] fruits2 = { 1, 2, 3, 2, 2 };
		System.out.println(maxSubArrayWithAtmostTwoDistinctElementsBetter(fruits2));

	}

	// Time : O(n^2)
	// Space : O(1)
	private static int maxSubArrayWithAtmostTwoDistinctElementsNaive(int[] fruits) {

		int n = fruits.length;
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			Set<Integer> distinctSet = new HashSet<>();
			for (int j = i; j < n; j++) {
				distinctSet.add(fruits[j]);
				if (distinctSet.size() > 2) {
					break;
				}
				maxLen = Math.max(maxLen, j - i + 1);
			}
		}
		return maxLen;
	}

	private static int maxSubArrayWithAtmostTwoDistinctElementsBetter(int[] fruits) {

		int n = fruits.length;
		int maxLen = 0;
		int l = 0;
		int r = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
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
				l++;
			} else {
				maxLen = Math.max(maxLen, r - l + 1);
			}
			r++;
		}
		return maxLen;
	}

}
