package com.kirangs.java8;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {

//		Employee employee1 = new Employee("Ram", 25, 25000d, "Bangalore");
//
//		Employee employee2 = new Employee("Raju", 26, 25000d, "Bangalore");
//
//		employee2.raiseSalary(5000d);
//		
//		
//
//		System.out.println(employee1.getSalary());
//		System.out.println(employee2.getSalary());

//		Account account = new Account("Kiran", 50000d);
//		Account account2 = new Account("Nandish", 70000d);
//
//		account.withdraw(20000d);
//		System.out.println(account.getBalance());
//		account2.withdraw(50000d);
//		System.out.println(account2.getBalance());

		ModArrayList modArrayList = new ModArrayList();
		modArrayList.add(10);
		modArrayList.add(20);
		modArrayList.add(30);

		System.out.println(modArrayList.getElementAtIndex(10, modArrayList));

	}

}
