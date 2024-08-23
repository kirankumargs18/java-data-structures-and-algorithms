package com.kirangs;

public class TrappingRainWater {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 4, 3, 2, 1 };

		System.out.println("Trapped Water is " + trapRainWater(arr) + " litres");
		
		System.out.println("Trapped Water is " + trapRainWater(arr1) + " litres");
		
		System.out.println("Trapped Water is " + trapRainWater(arr2) + " litres");

	}

	// Time : O(n)
	// Space : O(1)
	private static int trapRainWater(int[] arr) {

		int n = arr.length;

		int l = 0;
		int r = n - 1;

		int lb = arr[0];
		int rb = arr[n - 1];

		int trappedWater = 0;

		while (l <= r) {

			if (lb <= rb) {
				if (lb <= arr[l]) {
					lb = arr[l];
				} else {
					trappedWater = trappedWater + (lb - arr[l]);
				}
				l++;
			} else {
				if (rb <= arr[r]) {
					rb = arr[r];
				} else {
					trappedWater = trappedWater + (rb - arr[r]);
				}
				r--;
			}
		}
		return trappedWater;

	}

}
