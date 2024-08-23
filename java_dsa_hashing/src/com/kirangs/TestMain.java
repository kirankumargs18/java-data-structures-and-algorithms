package com.kirangs;

public class TestMain {
	public static void main(String[] args) {

		MyHash myHash = new MyHash(7);

		myHash.insert(70);
		myHash.insert(71);
		myHash.insert(56);
		myHash.insert(9);
		myHash.insert(72);
		myHash.insert(63);
		myHash.remove(72);
		myHash.insert(32);
		myHash.remove(70);

//		System.out.println(myHash.search(72));
//
//		System.out.println(myHash.hashTable);

//		System.out.println(String.valueOf("" + (char) ('a' + 2)));


	}
}
