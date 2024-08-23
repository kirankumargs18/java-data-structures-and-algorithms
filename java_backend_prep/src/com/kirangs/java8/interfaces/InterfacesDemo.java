package com.kirangs.java8.interfaces;

public class InterfacesDemo {

	public static void main(String[] args) {

//		Addition addition = new Addition();
//		System.out.println(addition.add(2, 3));

//		Sum sum = new Sum() {
//			@Override
//			public int add(int a, int b) {
//				int c = a + b;
//				return c;
//			}
//		};
//
//		System.out.println(sum.add(4, 5));

//		Sum sum = (a, b) -> a + b;
//
//		System.out.println(sum.add(10, 20));

	}

}

interface Sum {
	int add(int a, int b);
}

class Addition implements Sum {

	@Override
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
}