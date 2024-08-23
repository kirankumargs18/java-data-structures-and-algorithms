package com.kirangs.basicmaths.ta.bitmanipulation;

import java.util.Arrays;
import java.util.HashSet;

public class LonelyInteger {

    public static void main(String[] args) {

	int[] arr1 = { 1, 2, 3, 1, 2, 3, 5 };

	int[] arr = { 1, 2, 3, 4, 3, 2, 1 };

	System.out.println("Lonely Integer : " + lonelyInt(arr));
	System.out.println("Lonely Integer : " + lonelyInteger(arr));
	System.out.println("Lonely Integer : " + lonelyIntegerOptimized(arr));

    }

    // Using XOR operator

    // a number XOR'ed with itself results in 0, 5^5 = 0
    // a number XOR'ed with 0 results same number, 6^0 = 6
    // If we are doing XOR operation between array elements, the pair elements
    // result in 0 and is XOR'ed with unique element we get the same element

    // Time : O(N)
    // Space : O(1)
    private static int lonelyIntegerOptimized(int[] arr) {

	int result = 0;
	for (int num : arr) {
	    result = result ^ num;
	}
	return result;
    }

    // Time : O(n)
    // Space : O(1)
    private static int lonelyInteger(int[] arr) {

	HashSet<Integer> hashSet = new HashSet<>();

	for (int i : arr) {
	    if (hashSet.contains(i)) {
		hashSet.remove(i);
	    } else {
		hashSet.add(i);
	    }
	}
	for (int i : hashSet) {
	    return i;
	}
	return -1;
    }

    // Time : O(NlogN)
    // Space : O(1)
    private static int lonelyInt(int[] arr) {

	int n = arr.length;
	Arrays.sort(arr);
	for (int i = 0; i < n - 2; i = i + 2) {
	    if (arr[i] != arr[i + 1]) {
		return arr[i];
	    }
	}
	return arr[n - 1];

    }

}
