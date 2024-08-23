package com.kirangs;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {

	int bucket;
	ArrayList<LinkedList<Integer>> hashTable;

	public MyHash(int bucket) {
		this.bucket = bucket;
		hashTable = new ArrayList<>(bucket);
		for (int i = 0; i < bucket; i++) {
			hashTable.add(new LinkedList<>());
		}
	}

	public void insert(int key) {
		int i = key % bucket;
		hashTable.get(i).add(key);
	}

	public void remove(int key) {

		int i = key % bucket;
		hashTable.get(i).remove((Integer) key);

	}

	public boolean search(int key) {

		int i = key % bucket;
		return hashTable.get(i).contains(key);
	}

}
