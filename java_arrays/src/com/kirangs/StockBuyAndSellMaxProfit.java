package com.kirangs;

public class StockBuyAndSellMaxProfit {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 8, 12 };

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 4, 3, 2, 1 };

		System.out.println("Maximum Profit : " + maxProfit(arr));
		System.out.println("Maximum Profit : " + maxProfit(arr1));
		System.out.println("Maximum Profit : " + maxProfit(arr2));

	}

	// Time : O(n)
	private static int maxProfit(int[] arr) {
		int n = arr.length;
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				profit += (arr[i] - arr[i - 1]);
			}
		}
		return profit;
	}
}
