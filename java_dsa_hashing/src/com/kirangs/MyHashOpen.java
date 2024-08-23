package com.kirangs;

public class MyHashOpen {

	int[] table;
	int cap;
	int size;

	public MyHashOpen(int cap) {
		super();
		this.cap = cap;
		this.size = 0;
		table = new int[cap];
		for (int i = 0; i < table.length; i++) {
			table[i] = -1;
		}
	}

	public int hash(int key) {
		return key % cap;
	}

	public boolean insert(int key) {
		if (size == cap) {
			return false;
		}
		int i = hash(key);
		while (table[i] != -1 && table[i] != -2 && table[i] != key) {
			i = (i + 1) % cap;
		}
		if (table[i] == key) {
			return false;
		}
		table[i] = key;
		size++;
		return true;
	}

	public boolean search(int key) {
		int h = hash(key);
		int i = h;
		while (table[i] != -1) {
			if (table[i] == key) {
				return true;
			}
			i = (i + 1) % cap;
			if (i == h) {
				return false;
			}
		}
		return false;
	}

	public boolean erase(int key) {
		int h = hash(key);
		int i = h;
		while (table[i] != -1) {
			if (table[i] == key) {
				table[i] = -2;
				size--;
				return true;
			}
			i = (i + 1) % cap;
			if (i == h) {
				return false;
			}
		}
		return false;
	}
}
