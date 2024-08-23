package com.kirangs.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {

		// create a stream
		Stream<String> stringStream = Stream.of("Kiran", "kumar", "G S");
		stringStream.forEach(System.out::println);

		// create stream from sources
		Collection<String> collection = Arrays.asList("Kiran", "kumar", "G S");
		Stream<String> cStream = collection.stream();
		cStream.forEach(System.out::println);

		String[] strings = { "Kiran", "kumar", "G S" };
		Stream<String> stream = Arrays.stream(strings);
		stream.forEach(System.out::println);
		
	}

}
