package com.kirangs;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and 
//choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BestTimeToBuyStockAndSell {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(optimalSolution(prices));

		int[] prices1 = { 7, 6, 4, 3, 1 };
		System.out.println(optimalSolution(prices1));

		int[] prices2 = { 2, 4, 1 };
		System.out.println(optimalSolution(prices2));

	}

	// Time : O(N)
	// Space : O(1)
	private static int optimalSolution(int[] prices) {

		int n = prices.length;
		int buy = prices[0];
		int maxProfit = 0;
		for (int i = 1; i < n; i++) {
			if (buy > prices[i]) {
				buy = prices[i];
			} else if (prices[i] - buy > maxProfit) {
				maxProfit = prices[i] - buy;
			}
		}
		return maxProfit;
	}
}
