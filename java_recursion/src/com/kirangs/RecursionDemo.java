package com.kirangs;

//Waiting function calls will be stored in stack space, 
//when function calls are full of stack space it throws stack overflow error
public class RecursionDemo {
	static int count = 0;
	public static void main(String[] args) {
		function();
	}

	private static void function() {
		if (count == 4) {
			return;
		}
		System.out.println(1);
		count++;
		function();
	}
}
