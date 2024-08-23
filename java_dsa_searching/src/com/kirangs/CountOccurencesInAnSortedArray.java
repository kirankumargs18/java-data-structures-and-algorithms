package com.kirangs;

public class CountOccurencesInAnSortedArray {

	public static void main(String[] args) {

		int[] arr = { 8, 9, 10, 12, 12, 12 };
		System.out.println(numberOfOccurences(arr, 6, 12));

	}

	private static int numberOfOccurences(int[] arr, int n, int x) {

		int first = searchOccurence(arr, x, true);
		if (first == -1) {
			return 0;
		}
		int last = searchOccurence(arr, x, false);
		return last - first + 1;
	}

	private static int searchOccurence(int[] nums, int target, boolean isFirst) {

		int n = nums.length;
		if (n <= 0) {
			return -1;
		}
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				if (isFirst) {
					if (mid == 0 || nums[mid] != nums[mid - 1]) {
						return mid;
					} else {
						high = mid - 1;
					}
				} else {
					if (mid == n - 1 || nums[mid] != nums[mid + 1]) {
						return mid;
					} else {
						low = mid + 1;
					}
				}
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
