package com.kirangs.problems;

//Note that s may contain leading or trailing spaces or multiple spaces between two words. 
//The returned string should only have a single space separating the words.
//Do not include any extra spaces.
public class ReverseWordsInAStringThree {

	public static void main(String[] args) {

		String str = "the sky is blue";
		System.out.println(reverseWords(str));

		String str1 = "  hello world  ";
		System.out.println(reverseWords(str1));

		String str2 = "a good   example";
		System.out.println(reverseWords(str2));

	}

	private static String reverseWords(String s) {

		String result = "";
		int n = s.length();
		int i = 0;
		while (i < n) {
			while (i < n && s.charAt(i) == ' ') {
				i++;
			}
			if (i >= n) {
				break;
			}
			int j = i + 1;
			while (j < n && s.charAt(j) != ' ') {
				j++;
			}
			if (result.length() == 0) {
				result = s.substring(i, j);
			} else {
				result = s.substring(i, j) + " " + result;
			}
			i = j + 1;
		}
		return result;
	}
}
