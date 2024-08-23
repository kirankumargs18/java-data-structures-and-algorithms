package com.kirangs;

public class TrappingRainWater {

	public static void main(String[] args) {

		int[] arr = { 3, 0, 1, 2, 5 };
		int[] arr1 = { 2, 0, 2 };
		int[] arr2 = { 3, 0, 2, 0, 4 };
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 5, 4, 3, 2, 1 };

		System.out.println("RainWater Trapped : " + trapRainWaterWithExtraSpace(arr));

		System.out.println("RainWater Trapped : " + trapRainWaterWithExtraSpace(arr1));

		System.out.println("RainWater Trapped : " + trapRainWaterWithExtraSpace(arr2));

		System.out.println("RainWater Trapped : " + trapRainWaterWithExtraSpace(arr3));

		System.out.println("RainWater Trapped : " + trapRainWaterWithExtraSpace(arr4));
		
		System.out.println("RainWater Trapped : " + trapRainWater(arr));

		System.out.println("RainWater Trapped : " + trapRainWater(arr1));

		System.out.println("RainWater Trapped : " + trapRainWater(arr2));

		System.out.println("RainWater Trapped : " + trapRainWater(arr3));

		System.out.println("RainWater Trapped : " + trapRainWater(arr4));

	}

	// Time : O(n)
	// Space : O(1)
	private static int trapRainWater(int[] arr) {

		int n = arr.length;
		int rainWater = 0;
		int l = 0;
		int r = n - 1;
		int lb = arr[l];
		int rb = arr[r];
		while (l <= r) {
			if (lb <= rb) {
				if (arr[l] >= lb) {
					lb = arr[l];
				} else {
					rainWater = rainWater + (lb - arr[l]);
				}
				l++;
			} else {
				if (arr[r] >= rb) {
					rb = arr[r];
				} else {
					rainWater = rainWater + (rb - arr[r]);
				}
				r--;
			}
		}
		return rainWater;
	}

	// Time : O(n^2)
	private static int trapRainWaterNaive(int[] arr) {

		int n = arr.length;
		int rainWater = 0;
		for (int i = 1; i < n - 1; i++) {

			int lmax = arr[i];
			for (int j = 0; j < i; j++) {
				lmax = Math.max(lmax, arr[j]);
			}
			int rmax = arr[i];
			for (int j = i + 1; j < n; j++) {
				rmax = Math.max(rmax, arr[j]);
			}
			rainWater += Math.min(lmax, rmax) - arr[i];
		}
		return rainWater;
	}

	// Time : O(n)
	// Space : O(n)
	private static int trapRainWaterWithExtraSpace(int[] arr) {

		int n = arr.length;
		int rainWater = 0;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		lmax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			lmax[i] = Math.max(lmax[i - 1], arr[i]);
		}
		rmax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rmax[i] = Math.max(rmax[i + 1], arr[i]);
		}
		for (int i = 1; i < n - 1; i++) {
			rainWater += Math.min(lmax[i], rmax[i]) - arr[i];
		}
		return rainWater;
	}
}
