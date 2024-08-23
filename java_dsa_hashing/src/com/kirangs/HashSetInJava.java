package com.kirangs;

import java.util.HashSet;

public class HashSetInJava {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("GlobalLogic India Private Limited");
		hashSet.add("Kiran");
		hashSet.add("Kiran"); //it will not be added
		hashSet.add("Kumar G S");
		System.out.println(hashSet);
		
		System.out.println(hashSet.size());
		
//		hashSet.remove("Kiran");
		
		System.out.println(hashSet.size());
		
//		hashSet.clear();

//		System.out.println(hashSet.contains("Kiran"));

//		Iterator<String> i = hashSet.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		for(String s:hashSet) {
			System.out.println(s);
		}
	}
}
