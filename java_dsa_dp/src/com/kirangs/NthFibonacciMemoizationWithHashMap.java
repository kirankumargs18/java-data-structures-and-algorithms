package com.kirangs;

import java.util.HashMap;

public class NthFibonacciMemoizationWithHashMap {

	private static HashMap<Integer, Integer> hashMap = new HashMap<>();

	public static void main(String[] args) {

		System.out.println(fib(45));

	}

	private static int fib(int n) {
		if (hashMap.containsKey(n)) {
			return hashMap.get(n);
		}
		if (n <= 1) {
			return n;
		}
		hashMap.put(n, fib(n - 1) + fib(n - 2));
		return hashMap.get(n);
	}

}
