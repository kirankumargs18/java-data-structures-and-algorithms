package com.kirangs.revision;

//2124. Check if All A's Appears Before All B's
public class CheckIfAllAsAppearBeforeB {
	public static void main(String[] args) {

		String str = "aaa";

		System.out.println(betterSolution(str));
	}

	// Time : O(N)
	// Space : O(1)
	private static boolean betterSolution(String s) {

		int n = s.length();
		int startIndex = -1;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'b') {
				startIndex = i;
				break;
			}
		}
		if (startIndex == -1) {
			return true;
		}
		for (int i = startIndex + 1; i < n; i++) {
			if (s.charAt(i) == 'a') {
				return false;
			}
		}
		return true;
	}
}
