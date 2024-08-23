package com.kirangs.problems;

import com.kirangs.Node;

public class InsertNodeAtStarting {

	// Time : O(1)
	// Space : O(1)
	private static Node insert(Node head, int data) {

		Node temp = new Node();
		temp.setData(data);
		if (head == null) {
			head = temp;
			return head;
		} else {
			temp.setNext(head);
			head = temp;
			return head;
		}
	}

	// Time : O(N)
	// Space : O(1)
	private static void printLinkedList(Node head) {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " --> ");
			temp = temp.getNext();
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {

		Node head = null;
		head = insert(head, 30);
		head = insert(head, 20);
		head = insert(head, 10);
		printLinkedList(head);
	}
}
