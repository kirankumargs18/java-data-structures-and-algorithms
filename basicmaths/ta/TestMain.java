package com.kirangs.basicmaths.ta;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

    public static void main(String[] args) {

//	System.out.println(countSetBits("0101000"));

	int[] arr = { 1, 2, 3, 4, 3, 2, 1 };

	Set<Integer> intSet = new HashSet<>();

	for (int i = 0; i < arr.length - 1; i++) {
	    if (intSet.contains(Integer.valueOf(arr[i]))) {
		intSet.remove(Integer.valueOf(i));
	    } else {
		intSet.add(Integer.valueOf(arr[i]));
	    }
	}
	System.out.println(-1);
    }

    private static int countSetBits(String b) {

	int count = 0;
	for (int i = 0; i < b.length(); i++) {
	    if (b.charAt(i) == '1') {
		count++;
	    }
	}
	return count;
    }

}
