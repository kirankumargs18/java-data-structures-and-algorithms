package com.kirangs;

//4. Median of Two Sorted Arrays
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		System.out.println(optimalSolution(nums1, nums2));
//		System.out.println(betterSolution(nums1, nums2));
	}

	// Naive solution
	// Merge 2 sorted arrays and calculate median
	// Time : O(M+N)
	// Space : O(M+N)

	private static double naiveSolution(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int[] temp = new int[m + n];
		if (temp.length == 1) {
			return 0.0;
		}
		int i = 0;
		int j = 0;
		int k = 0;
		while (j < m && k < n) {
			if (nums1[j] > nums2[k]) {
				temp[i++] = nums2[k++];
			} else {
				temp[i++] = nums1[j++];
			}
		}
		while (j < m) {
			temp[i++] = nums1[j++];
		}
		while (k < n) {
			temp[i++] = nums2[k++];
		}
		int len = m + n;
		int index = len / 2;
		if (len % 2 == 1) {
			return temp[index];
		} else {
			return (temp[index] + temp[index - 1]) / 2.0;
		}
	}

	// better solution
	// Merge 2 sorted arrays and calculate median
	// Time : O(M+N)
	// Space : O(1)

	private static double betterSolution(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		if (m == 0 && n == 1) {
			return nums2[0];
		}
		if (n == 0 && m == 1) {
			return nums1[0];
		}
		int len = m + n;
		if (len == 1) {
			return 0.0;
		}
		int index = len / 2;
		int first = -1;
		int second = -1;
		int i = 0;
		int j = 0;
		int k = 0;
		while (j < m && k < n) {
			if (nums1[j] > nums2[k]) {
				if (i == index) {
					first = nums2[k];
				} else if (i == index - 1) {
					second = nums2[k];
				}
				k++;
			} else {
				if (i == index) {
					first = nums1[j];
				} else if (i == index - 1) {
					second = nums1[j];
				}
				j++;
			}
			i++;
		}
		while (j < m) {
			if (i == index) {
				first = nums1[j];
			} else if (i == index - 1) {
				second = nums1[j];
			}
			j++;
			i++;
		}
		while (k < n) {
			if (i == index) {
				first = nums2[k];
			} else if (i == index - 1) {
				second = nums2[k];
			}
			k++;
			i++;
		}

		if (len % 2 == 1) {
			return first;
		} else {
			return (first + second) / 2.0;
		}
	}

	// Optimal Solution using Binary Search
	// Time : O(log(min(m,n))
	// Space : O(1)

	private static double optimalSolution(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		if (m > n) {
			return optimalSolution(nums2, nums1);
		}
		int low = 0;
		int high = m;
		int left = (m + n + 1) / 2;
		int len = m + n;
		while (low <= high) {
			int mid1 = (low + high) / 2;
			int mid2 = left - mid1;
			int l1 = Integer.MIN_VALUE;
			int l2 = Integer.MIN_VALUE;
			int r1 = Integer.MAX_VALUE;
			int r2 = Integer.MAX_VALUE;
			if (mid1 < m) {
				r1 = nums1[mid1];
			}
			if (mid2 < n) {
				r2 = nums2[mid2];
			}
			if (mid1 - 1 >= 0) {
				l1 = nums1[mid1 - 1];
			}
			if (mid2 - 1 >= 0) {
				l2 = nums2[mid2 - 1];
			}
			if (l1 <= r2 && l2 <= r1) {
				if (len % 2 == 1) {
					return Math.max(l1, l2);
				}
				return ((Math.max(l1, l2)) + (Math.min(r1, r2))) / 2.0;
			} else if (l1 > r2) {
				high = mid1 - 1;
			} else {
				low = mid1 + 1;
			}
		}
		return -1;
	}

}
