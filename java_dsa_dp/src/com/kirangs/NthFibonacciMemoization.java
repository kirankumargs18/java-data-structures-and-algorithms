package com.kirangs;

import java.util.Arrays;

public class NthFibonacciMemoization {

	private static int[] mem;

	public static void main(String[] args) {

		mem = new int[51];
		Arrays.fill(mem, -1);
		mem[0] = 0;
		mem[1] = 1;
		System.out.println(fib(30));

	}

	private static int fib(int n) {

		if (mem[n] == -1) {
			if (n == 0 || n == 1) {
				return mem[n];
			}
			mem[n] = fib(n - 1) + fib(n - 2);
		}
		return mem[n];
	}

//	private static int fib(int n) {
//		if (n == 0 || n == 1) {
//			return n;
//		}
//		return fib(n - 1) + fib(n - 2);
//	}
}
