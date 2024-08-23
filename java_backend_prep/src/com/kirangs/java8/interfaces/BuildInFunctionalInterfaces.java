package com.kirangs.java8.interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces {

	public static void main(String[] args) {

		// FUNCTION

		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};

		Function<Integer, Integer> function1 = t -> t * t;

		System.out.println(function.apply(-1));
		System.out.println(function1.apply(-1));

		// BIFUNCTION

		BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>() {

			public String apply(String t, String u) {
				return t + " " + u;
			}
		};

		BiFunction<String, String, String> biFunction1 = (firstName, lastName) -> {

			String name = firstName + " " + lastName;
			return name;
		};

		System.out.println(biFunction.apply("Kiran", "Kumar"));
		System.out.println(biFunction1.apply("Kiran", "Kumar"));

		// CONSUMER

		Consumer<String> consumer = new Consumer<String>() {
			public void accept(String msg) {
				System.out.println(msg);
			}
		};

		Consumer<String> consumer1 = msg -> System.out.println(msg);
		consumer.accept("Good evening!");
		consumer1.accept("Good evening!");

		// PREDICATE

		Predicate<Integer> isEligibleToVote = new Predicate<Integer>() {

			public boolean test(Integer age) {
				return age >= 18;
			}
		};

		Predicate<Integer> isEligibleToVote1 = age -> age >= 18;

		System.out.println(isEligibleToVote.test(17));
		System.out.println(isEligibleToVote1.test(17));
	}

}
