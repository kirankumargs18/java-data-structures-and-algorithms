package com.kirangs.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	private static String convert(String name) {
		return name.toUpperCase();
	}

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Kiran", "Naveen", "Nandish", "Shravan");

		List<String> names1 = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
//		List<String> names1 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
//		List<String> names1 = names.stream().map(StreamMapDemo::convert).collect(Collectors.toList());
		names1.forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numbers1 = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		numbers1.forEach(n -> System.out.println(n));

		// map List<Student> to List<String> (list containing full names)
		List<Student> students = Data.getData();
		List<String> fullNames = students.stream().map(student -> {
			return student.getFirstName() + " " + student.getLastName();
		}).collect(Collectors.toList());
		fullNames.forEach(System.out::println);
	}

}
