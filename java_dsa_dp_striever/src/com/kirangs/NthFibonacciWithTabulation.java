package com.kirangs;

public class NthFibonacciWithTabulation {

	public static void main(String[] args) {

		System.out.println(fibb(5));

	}

	private static int fib(int n) {

		if (n == 1 || n == 0) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	// space optimization
	private static int fibb(int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int secPrev = 0;
		int prev = 1;
		int curr = -1;
		for (int i = 2; i <= n; i++) {
			curr = prev + secPrev;
			secPrev = prev;
			prev = curr;
		}
		return curr;
	}
}
