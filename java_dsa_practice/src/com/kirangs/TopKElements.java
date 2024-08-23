package com.kirangs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKElements {

	public static void main(String[] args) {

		int[] nums = { 1, 2 };
		int k = 2;
		System.out.println(topKelements(nums, k));
	}

	private static int[] topKelements(int[] nums, int k) {
		int n = nums.length;
		Map<Integer, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hashMap.entrySet());
		Collections.sort(list, (i1, i2) -> i2.getValue() - i1.getValue());
		List<Integer> intList = new ArrayList<>();
		int k1 = 1;
		for (Entry<Integer, Integer> entry : list) {
			if (k1 <= k) {
				intList.add(entry.getKey());
				k1++;
			} else {
				break;
			}
		}
		int[] res = new int[intList.size()];
		int i = 0;
		for (int num : intList) {
			res[i] = num;
			i++;
		}
		return res;
	}

}
