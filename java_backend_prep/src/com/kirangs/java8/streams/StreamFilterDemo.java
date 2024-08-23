package com.kirangs.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	private static boolean customFilter(Student student) {

		if (student.getJoinedYear() == 2014 && "Karnataka".equals(student.getCity())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		List<Student> students = Data.getData();
//		students.forEach(System.out::println);

		// filter
		// students who joined in 2014
		List<Student> list = students.stream().filter(student -> student.getJoinedYear() == 2014)
				.collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("======================================");

		// students who joined in 2014 and from karnataka
//		List<Student> list1 = students.stream()
//				.filter(student -> student.getJoinedYear() == 2014 && "Karnataka".equals(student.getCity()))
//				.collect(Collectors.toList());
		List<Student> list1 = students.stream().filter(StreamFilterDemo::customFilter).collect(Collectors.toList());
		list1.forEach(System.out::println);

	}

}
