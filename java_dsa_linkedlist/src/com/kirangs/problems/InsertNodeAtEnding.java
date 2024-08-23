package com.kirangs.problems;

import com.kirangs.Node;

public class InsertNodeAtEnding {

	// Time : O(N)
	// Space : O(1)
	private static Node insertAtEnd(Node head, int data) {

		// create new node and set data and next values
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(null);

		// handle head is null
		if (head == null) {
			head = temp;
			return head;
		}

		// traverse till last node and connect last node to temp
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(temp);
		return head;
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

		Node head = insertAtEnd(null, 10);
		insertAtEnd(head, 20);
		insertAtEnd(head, 30);
		printLinkedList(head);
	}

}
