package com.kirangs.problems;

public class RabinKarpAlgorithmForPatternSearching {

	private static final int d = 256;

	// Time : O(m + m + (n-m+1)*m)
	// Space : O(1)
	private static void search(String txt, String pat, int q) {

		int n = txt.length();
		int m = pat.length();
		int h = 1;
		int t = 0;
		int p = 0;
		// calculate d power m-1 and store this in some variable
		for (int i = 0; i < m - 1; i++) {
			h = (h * d) % q;
		}

		// calculate hash value of pattern and first window of the text
		for (int i = 0; i < m; i++) {
			t = (t * d + txt.charAt(i)) % q;
			p = (p * d + pat.charAt(i)) % q;
		}

		// slide the pattern over text one by one
		for (int i = 0; i <= n - m; i++) {
			if (t == p) {
				int j;
				for (j = 0; j < m; j++) {
					if (pat.charAt(j) != txt.charAt(i + j)) {
						break;
					}
				}
				if (j == m) {
					System.out.println("Pattern Found at Index : " + i);
				}
			}
			// calculate hash value for the next window and remove trailing, leading digits
			if (i < n - m) {
				t = ((t - txt.charAt(i) * h) * d + txt.charAt(i + m)) % q;
				// we might get negative value of t and converting it to positive
				if (t < 0) {
					t = t + q;
				}
			}
		}
	}

	public static void main(String[] args) {

		String txt = "Practice Coding using LeetCode";
		String pat = "Cod";
		search(txt, pat, 101);

	}
}
