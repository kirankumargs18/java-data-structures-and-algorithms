package com.kirangs.problems;

public class MinimumNumberOfChairsInWaitingRoom {

	public static void main(String[] args) {

		String s = "EEEEEEE";
		System.out.println(minimumNumberOfChairs(s));

		String s1 = "ELELEEL";
		System.out.println(minimumNumberOfChairs(s1));

		String s2 = "ELEELEELLL";
		System.out.println(minimumNumberOfChairs(s2));


	}

	// Time : O(n)
	// Space : O(1)
	private static int minimumNumberOfChairs(String s) {

		int n = s.length();
		int res = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'E') {
				count = count + 1;
			} else {
				count = count - 1;
			}
			res = Math.max(count, res);
		}
		return res;
	}

}
