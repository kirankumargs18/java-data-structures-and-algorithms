package com.kirangs;

import java.util.HashMap;

public class ClimbingStairs {

	private static HashMap<Integer, Integer> hashMap = new HashMap<>();

	public static void main(String[] args) {

		System.out.println(climbStairs(20));

	}

	// tabulation
	private static int climbStairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	// memoization
	private static int recursive(int n) {

		if (hashMap.containsKey(n)) {
			return hashMap.get(n);
		}
		if (n == 1 || n == 2) {
			return n;
		}
		hashMap.put(n, recursive(n - 1) + recursive(n - 2));
		return hashMap.get(n);
	}

}
