package com.kirangs.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Comparable (Object has to implement this interface)
//Comparator 
public class SortingObjects {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Orange");
		List<String> fruits1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> fruits2 = fruits.stream().sorted().collect(Collectors.toList());
		List<String> fruits3 = fruits.stream().sorted((f1, f2) -> f1.compareTo(f2)).collect(Collectors.toList());
		fruits3.forEach(System.out::println);

		List<Student> students = Data.getData();

		// Student class implemented comparable interface by default sorted as per
		// firstName
		// using comparable
		Collections.sort(students);
		students.forEach(System.out::println);
		System.out.println("****************************************************************");

		// using comparator
		SortByLastName sortByLastName = new SortByLastName();
		Collections.sort(students, sortByLastName);
		students.forEach(System.out::println);
		System.out.println("****************************************************************");

		// using lambda to implement comparator
		Collections.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());
		students.forEach(System.out::println);
		System.out.println("****************************************************************");

		// Important
		List<Student> studentsSortedList1 = students.stream().sorted(Comparator.comparing(Student::getJoinedYear))
				.collect(Collectors.toList());

		List<Student> studentsSortedList2 = students.stream().sorted(Comparator.comparing(Student::getJoinedYear).reversed())
				.collect(Collectors.toList());
		studentsSortedList2.forEach(System.out::println);

	}
}

class SortByLastName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
}