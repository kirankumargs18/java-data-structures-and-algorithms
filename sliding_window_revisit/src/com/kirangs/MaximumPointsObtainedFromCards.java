package com.kirangs;

public class MaximumPointsObtainedFromCards {

	public static void main(String[] args) {

		int[] cards = { 1, 2, 3, 4, 5, 6, 1 };
		int k = 3;
		System.out.println(optimalSolution(cards, k));

		int[] cards1 = { 2, 2, 2 };
		int k1 = 2;
		System.out.println(optimalSolution(cards1, k1));

		int[] cards2 = { 9, 7, 7, 9, 7, 7, 9 };
		int k2 = 7;
		System.out.println(optimalSolution(cards2, k2));

	}

	// K Cards can only be picked from either start or end or from both start and
	// end
	// Time : O(2k)
	// Space : O(1)
	private static int optimalSolution(int[] cards, int k) {

		int n = cards.length;
		int points = 0;
		for (int i = 0; i < k; i++) {
			points += cards[i];
		}
		if (n == k) {
			return points;
		}
		int maxPoints = points;
		int r = n - 1;
		for (int i = k - 1; i >= 0; i--) {
			points = points - cards[i] + cards[r];
			maxPoints = Math.max(maxPoints, points);
			r = r - 1;
		}
		return maxPoints;
	}
}
