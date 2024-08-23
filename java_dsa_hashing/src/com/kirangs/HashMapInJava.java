package com.kirangs;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Jan", 01);
		hashMap.put("Feb", 02);
		hashMap.put("Mar", 03);
//		System.out.println(hashMap);
		System.out.println(hashMap.containsKey("Jan"));
		System.out.println(hashMap.remove("Jan"));
		System.out.println(hashMap.size());
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
