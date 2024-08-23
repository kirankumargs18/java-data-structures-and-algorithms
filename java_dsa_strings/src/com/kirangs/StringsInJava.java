package com.kirangs;

public class StringsInJava {

	public static void main(String[] args) {

		// String class is immutable in java, once u create them u can't modify
		String str = "kiran";
		System.out.println(str);

		// few functions of String class available

		String str1 = "LeetCode";

		System.out.println(str1.length());

		System.out.println(str1.charAt(4));

		System.out.println(str1.substring(4));

		System.out.println(str1.substring(0, 4));

		String leetCode = "LeetCode";
		String leetCode1 = "LeetCode";

		String leetcode2 = new String("LeetCode");
		if (leetCode == leetCode1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		if (leetCode == leetcode2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		String s1 = "LeetCode";
		String s2 = "Code";
		System.out.println(s1.contains(s2));

		System.out.println(leetcode2.equals(leetCode1));

		// StringBuffer(ThreadSafe) and StringBuilder(not thread safe) mutable classes

	}

}
