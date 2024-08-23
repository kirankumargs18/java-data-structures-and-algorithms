package com.kirangs.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class InterviewQuestions {

//	1- Find list of students whose first name starts with alphabet A
	private static List<Student> namesStartsWithA(List<Student> students) {

		List<Student> resultStudents = students.stream().filter(student -> student.getFirstName().startsWith("A"))
				.collect(Collectors.toList());
		return resultStudents;
	}

//	2- Group The Student By Department Names
	private static Map<String, List<Student>> groupByDepartmentName(List<Student> students) {

		Map<String, List<Student>> resultStudentsMap = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName));
		return resultStudentsMap;
	}

//	3- Find the total count of student using stream
	private static long totalCount(List<Student> students) {

		long total = students.stream().count();
		return total;
	}

//	4- Find the max age of student
	private static int maxAge(List<Student> students) {

		OptionalInt max = students.stream().mapToInt(student -> student.getAge()).max();
		return max.getAsInt();

	}

//	5- Find all departments names
	private static List<String> allDepartmentNames(List<Student> students) {

		return students.stream().map(student -> student.getDepartmantName()).collect(Collectors.toList());
	}

//	6- Find the count of student in each department
	private static Map<String, Long> countStudentsByDepartment(List<Student> students) {

		return students.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
	}

//	9- Find the average age of male and female students

	private static Map<String, Double> getAvgAgeOfMaleAndFemale(List<Student> students) {

		return students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
	}

	public static void main(String[] args) {

		List<Student> students = Data.getData();

//		System.out.println(maxAge(students));

		Map<String, Double> map = getAvgAgeOfMaleAndFemale(students);
		for (Map.Entry<String, Double> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

//		allDepartmentNames(students).forEach(System.out::println);
	}
}
