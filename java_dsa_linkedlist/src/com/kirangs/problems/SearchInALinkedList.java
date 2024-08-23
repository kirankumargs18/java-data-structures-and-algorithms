package com.kirangs.problems;

import com.kirangs.Node;

public class SearchInALinkedList {

	// Time : O(N)
	// Space : O(1)
	private static int search(Node head, int data) {

		if (head == null) {
			return -1;
		}
		int pos = 1;
		Node temp = head;
		while (temp != null) {
			if (temp.getData() == data) {
				return pos;
			} else {
				pos++;
				temp = temp.getNext();
			}

		}
		return -1;
	}

	// Time : O(N)
	// Space : O(N)
	private static int searchRecursive(Node temp, int data, int pos) {

		if (temp == null) {
			return -1;
		}
		if (temp.getData() == data) {
			return pos;
		}
		pos++;
		return searchRecursive(temp.getNext(), data, pos);
	}

	public static void main(String[] args) {

		Node head = new Node();
		head.setData(10);
		Node temp1 = new Node();
		temp1.setData(20);
		Node temp2 = new Node();
		temp2.setData(30);

		head.setNext(temp1);
		temp1.setNext(temp2);

		System.out.println(search(head, 10));

		Node temp = head;
		System.out.println(searchRecursive(temp, 30, 1));
	}

}
