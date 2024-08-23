package com.kirangs.java8;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String location;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getLocation() {
		return location;
	}

	public Employee(String name, int age, double salary, String location) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
	}

	public void raiseSalary(double raiseValue) {
		this.salary = this.salary + raiseValue;
	}

}
