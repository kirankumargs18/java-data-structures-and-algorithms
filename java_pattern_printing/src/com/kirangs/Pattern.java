package com.kirangs;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
//		pattern6(n);
//		pattern7(n);
//		pattern8(n);
//		pattern9(n);
//		pattern10(n);
//		pattern11(n);
//		pattern12(n);
//		pattern13(n);
//		pattern14(n);
//		pattern15(n);
//		pattern16(n);
//		pattern17(n);
//		pattern18(n);
//		pattern19(n);
//		pattern20(n);
//		pattern21(n);
//		pattern22(n);
		pattern23(n);
		scanner.close();

	}

	/**
	 * N = 4
	 * * * * * 
	 * * * * * 
	 * * * * * 
	 * * * * *
	 */
	private static void pattern1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	/**
	 * N = 3
	 * *
	 * * *
	 * * * *
	 * */
	private static void pattern2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	/**
	 * N = 4
	 * 1
	 * 1 2 
	 * 1 2 3
	 * 1 2 3 4
	 * 
	 * */
	private static void pattern3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * N = 3
	 * 
	 * 1
	 * 2 2 
	 * 3 3 3
	 * */
	private static void pattern4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * N = 3
	 * 
	 * * * *
	 * * *
	 * *
	 * */
	private static void pattern5(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/**
	 * N = 3
	 * 
	 * 1 2 3
	 * 1 2 
	 * 1
	 * */
	private static void pattern6(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	
	/**
	 *N = 3 
	 *     *
	 *   * * *
	 * * * * * *
	 * */
	private static void pattern7(int n) {

		for (int i = 0; i < n; i++) {
			for (int m = 0; m < (n - i - 1); m++) {
				System.out.print(" ");
			}
			for (int p = 0; p < (2 * i + 1); p++) {
				System.out.print("*");
			}
			for (int m = 0; m < (n - i - 1); m++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	/**
	 *N = 3 
	 * * * * * *
	 *   * * *
	 *     *
	 * */
	private static void pattern8(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((2 * n) - (2 * i) - 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	/**
	 *N = 3 
	 *
	 *     *
	 *   * * *
	 * * * * * *
	 * * * * * *
	 *   * * *
	 *     *
	 * */
	private static void pattern9(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((2 * n) - (2 * i) - 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	/**
	 *N = 3 
	 *
	 *     *
	 *     * *
	 *     * * *
	 *     * * 
	 *     * 
	 *     
	 * */
	private static void pattern10(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	/**
	 * N = 4
	 * 
	 * 1
	 * 0 1 
	 * 0 1 0
	 * 1 0 1 0
	 * 
	 * */
	private static void pattern11(int n) {

//		boolean flag = false;
//		for (int i = 0; i < n; i++) {
//			if (i % 2 == 0) {
//				flag = true;
//			}
//			for (int j = 0; j < i + 1; j++) {
//				if (flag) {
//					System.out.print("1 ");
//					flag = false;
//				} else {
//					System.out.print("0 ");
//					flag = true;
//				}
//
//			}
//			System.out.println();
//		}
		
		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print(start+" ");
				start = 1 - start;
			}
			System.out.println();
		}
	}
	
	/**
	 * N = 3
	 */
//	1    1
//	12  21
//	123321

	private static void pattern12(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= 2 * n - 2 * i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
	
//	Input Format: N = 3
//			Result: 
//			1
//			2 3
//			4 5 6
	private static void pattern13(int n) {
		
		int p = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
	}
	
//	Input Format: N = 3
//			Result: 
//			A
//			A B
//			A B C
	
	private static void pattern14(int n) {

		for (int i = 0; i < n; i++) {
			char c = 'A';
			for (int j = 0; j < i + 1; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
		
//		for (int i = 0; i < n; i++) {
//			for (char ch = 'A'; ch <= 'A' + i; ch++) {
//				System.out.print(ch + " ");
//			}
//			System.out.println();
//		}
	}
	
	
//	Input Format: N = 3
//	Result: 
//	A B C
//	A B
//	A
	private static void pattern15(int n) {

		for (int i = 0; i < n; i++) {
			char c = 'A';
			for (int j = n; j >= i+1; j--) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}
	

//	Input Format: N = 3
//	Result: 
//	A
//	B B
//	C C C
	private static void pattern16(int n) {

		char c = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(c + " ");
			}
			c++;
			System.out.println();
		}
	}
	
//	Input Format: N = 3
//			Result: 
//			  A  
//			 ABA 
//			ABCBA
	
	private static void pattern17(int n) {
		
		
//		for (int i = 0; i < n; i++) {
//			char c = 'A';
//			for (int j = 0; j < n - i - 1; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print(c + " ");
//				c++;
//			}
//			c--;
//			c--;
//			for (int j = 0; j < i; j++) {
//				System.out.print(c + " ");
//				c--;
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			char ch = 'A';
			int breakPoint = (2 * i + 1) / 2;
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(ch + " ");
				if (j < breakPoint) {
					ch++;
				} else {
					ch--;
				}
			}
			System.out.println();
		}
	}
	
	
//	Input Format: N = 3
//			Result: 
//			C
//			B C
//			A B C
	
	private static void pattern18(int n) {

		for (int i = 0; i < n; i++) {

			char ch = 'A';
			for (int j = 0; j < n - i - 1; j++) {
				ch++;
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}
	
//	Input: ‘N’ = 3
//
//			Output: 
//			C
//			C B 
//			C B A
	private static void pattern19(int n) {

		for (int i = 0; i < n; i++) {
			char ch = (char) ('A' + n - 1);
			for (int j = 0; j < i + 1; j++) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}

	}
	
	
//	Input Format: N = 3
//			Result: 
//			******
//			**  **
//			*    *
//			*    *
//			**  **
//			******
	private static void pattern20(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < 2 * i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= (2 * n - 2 * i); j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	
	
//	Input Format: N = 3
//			Result: 
//			*    *
//			**  **
//			******
//			**  **
//			*    *
	private static void pattern21(int n) {

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 0; j < 2 * (n - i - 1); j++) {
//				System.out.print("  ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = 0; j < n - 1 - i; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 0; j < 2 * (1 + i); j++) {
//				System.out.print("  ");
//			}
//			for (int j = 0; j < n - 1 - i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		int spaces = 2 * (n - 1);
		for (int i = 1; i <= 2 * n - 1; i++) {
			int stars = i;
			if (i > n) {
				stars = 2 * n - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("* ");
			}
			if (i < n) {
				spaces = spaces - 2;
			} else {
				spaces = spaces + 2;
			}
			System.out.println();
		}

	}
	
	
//	Input Format: N = 3
//			Result: 
//			***
//			* *
//			***
	private static void pattern22(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
//	Input Format: N = 3
//			Result: 
//			3 3 3 3 3 
//			3 2 2 2 3 
//			3 2 1 2 3 
//			3 2 2 2 3 
//			3 3 3 3 3
	
	private static void pattern23(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				int top = i;
				int left = j;
				int right = (2 * n - 2) - j;
				int down = (2 * n - 2) - i;
				System.out.print((n - Math.min(Math.min(down, top), Math.min(left, right))));
			}
			System.out.println();

		}
	}
	
}
