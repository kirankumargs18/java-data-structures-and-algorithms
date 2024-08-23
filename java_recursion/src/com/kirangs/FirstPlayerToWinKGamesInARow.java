package com.kirangs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstPlayerToWinKGamesInARow {

	public static void main(String[] args) {

		int[] skills = { 16, 4, 7, 17 };
		int k = 562084119;
		System.out.println(findWinningPlayer(skills, k));

	}

	private static int findWinningPlayer(int[] skills, int k) {

		int n = skills.length;
		List<Integer> list = Arrays.stream(skills).boxed().collect(Collectors.toList());
		int playerWon = iterativeSolution(list, -1, 0, k);
		for (int i = 0; i < n; i++) {
			if (skills[i] == playerWon) {
				return i;
			}
		}
		return -1;

	}

	private static int iterativeSolution(List<Integer> list, int playerWon, int currStreak, int k) {

		while (currStreak != k) {
			if (list.get(0) > list.get(1)) {
				if (playerWon == list.get(0)) {
					currStreak = currStreak + 1;
				} else {
					playerWon = list.get(0);
					currStreak = 1;
				}
				int loser = list.get(1);
				list.remove(1);
				list.add(loser);
			} else {
				if (playerWon == list.get(1)) {
					currStreak = currStreak + 1;
				} else {
					playerWon = list.get(1);
					currStreak = 1;
				}
				int loser = list.get(0);
				list.remove(0);
				list.add(loser);
			}
		}
		return playerWon;

	}

	private static int findPlayer(List<Integer> list, int playerWon, int currStreak, int k) {

		if (list.get(0) > list.get(1)) {
			if (playerWon == list.get(0)) {
				currStreak = currStreak + 1;
			} else {
				playerWon = list.get(0);
				currStreak = 1;
			}
			int loser = list.get(1);
			list.remove(1);
			list.add(loser);
		} else {
			if (playerWon == list.get(1)) {
				currStreak = currStreak + 1;
			} else {
				playerWon = list.get(1);
				currStreak = 1;
			}
			int loser = list.get(0);
			list.remove(0);
			list.add(loser);
		}
		if (currStreak == k) {
			return playerWon;
		}
		return findPlayer(list, playerWon, currStreak, k);
	}
}
