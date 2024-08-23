package com.kirangs.java8.interfaces;

@FunctionalInterface
interface MyFunctionalInterface {

	int factorial(int n);
}

public class FactorialWithFunctionalInterfaces {

	public static void main(String[] args) {

		MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {

			@Override
			public int factorial(int n) {
				if (n == 1) {
					return 1;
				}
				return n * factorial(n - 1);
			}
		};

	
		System.out.println(calc(myFunctionalInterface));

	}

	private static int calc(MyFunctionalInterface myFunctionalInterface) {
		return myFunctionalInterface.factorial(5);
	}

}
