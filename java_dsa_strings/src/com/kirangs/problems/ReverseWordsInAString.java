package com.kirangs.problems;

import java.util.Stack;

//1 <= s.length <= 5 * 104
//s contains printable ASCII characters.
//s does not contain any leading or trailing spaces.
//There is at least one word in s.
//All the words in s are separated by a single space.
public class ReverseWordsInAString {

	public static void main(String[] args) {

		String str = "Let's take LeetCode contest";
		System.out.println(optimalSolution(str));

	}

	private static String optimalSolution(String s) {

		int n = s.length();
		char[] str = s.toCharArray();
		int start = 0;
		for (int end = 0; end < n; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}
		reverse(str, start, n - 1);
//		reverse(str, 0, n - 1);
		return new String(str);
	}

	private static void reverse(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	// using stack
	private static String naiveSolution(String s) {

		int n = s.length();
		Stack<String> stack = new Stack<>();
		String temp = "";
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == ' ') {
				temp = temp + ' ';
				stack.add(temp);
				temp = "";
			} else {
				temp = temp + s.charAt(i);
			}
		}
		temp = temp + ' ';
		stack.add(temp);
		temp = "";
		while (!stack.isEmpty()) {
			temp = temp + stack.peek();
			stack.pop();
		}
		return temp.trim();
	}
}
