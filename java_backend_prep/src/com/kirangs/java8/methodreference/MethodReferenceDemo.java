package com.kirangs.java8.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

//used a refere a method of a functional interface
//we will method reference to replace lambda or bring any other method which is having similar signature as functional interface's method
public class MethodReferenceDemo {

	private static int addition(int a, int b) {
		return a + b;
	}

	private void print(String message) {
		System.out.println(message.toUpperCase());
	}

	public static void main(String[] args) {

//		1.Method reference to a static method

		// lambda expression
		Function<Integer, Double> function = n -> Math.sqrt(n);
		System.out.println(function.apply(16));

		// method reference
		Function<Integer, Double> function1 = Math::sqrt;
		System.out.println(function1.apply(16));

		// lambda
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
		System.out.println(biFunction.apply(10, 20));

		BiFunction<Integer, Integer, Integer> biFunction1 = MethodReferenceDemo::addition;
		System.out.println(biFunction1.apply(10, 20));

//		2.Method reference to a instance method

		// lambda expression
		Consumer<String> consumer = msg -> System.out.println(msg.toUpperCase());
		consumer.accept("Hello!");

		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		Consumer<String> consumer1 = methodReferenceDemo::print;
		consumer1.accept("Hello!");

//		3.Reference to an instance method of arbitrary object

		// sometimes we call method of an argument. ex. toLowerCase() method on string
		// argument
		// lambda
		Function<String, String> function2 = str -> str.toLowerCase();
		System.out.println(function2.apply("KIRAN"));

		Function<String, String> function3 = String::toLowerCase;
		System.out.println(function3.apply("KIRAN"));

		// example
		String[] strings = { "K", "I", "R", "A", "N" };
		// lambda
//		Arrays.sort(strings, (s1, s2) -> s1.compareToIgnoreCase(s2));
		// method reference
		Arrays.sort(strings, String::compareToIgnoreCase);
		System.out.println();
		for (String str : strings) {
			System.out.print(str + " ");
		}
		System.out.println();

//		4.Reference to a constructor

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("mango");

		// lambda
//		Function<List<String>, Set<String>> function4 = fruits1 -> new HashSet(fruits1);

		// method reference
		Function<List<String>, Set<String>> function4 = HashSet::new;
		Set<String> set = function4.apply(fruits);
		System.out.println(set);

	}
}

@FunctionalInterface
interface Printable {
	void print(String msg);
}