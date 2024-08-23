package com.kirangs;

public class MaximumAppearingElementInRanges {

	public static void main(String[] args) {

		int[] left = { 1, 2, 5, 15 };
		int[] right = { 5, 8, 7, 18 };
		System.out.println(naiveSolution(left, right));
		System.out.println(optimalSolution(left, right));
	}

	// Time : O(N+max)
	// Space : O(1)

	// update all left array index numbers with 1 and right index number + 1 with -1
	// calculate prefix sum and that will give you frequencies of elements
	private static int optimalSolution(int[] left, int[] right) {
		int n = left.length;
		int[] freq = new int[100];
		for (int i = 0; i < n; i++) {
			freq[left[i]]++;
			freq[right[i] + 1]--;
		}
		int res = 0;
		for (int i = 1; i < 100; i++) {
			freq[i] = freq[i - 1] + freq[i];
			if (freq[i] > freq[res]) {
				res = i;
			}
		}
		return res;
	}

	// Time : O(N*max + N)
	// Space : O(100)--> O(1)
	private static int naiveSolution(int[] left, int[] right) {
		int n = left.length;
		int[] freq = new int[100];
		for (int i = 0; i < n; i++) {
			for (int j = left[i]; j <= right[i]; j++) {
				freq[j]++;
			}
		}
		int res = 0;
		for (int i = 0; i < 100; i++) {
			if (freq[i] > freq[res]) {
				res = i;
			}
		}
		return res;
	}
}
