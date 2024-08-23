package com.kirangs.problems;

import com.kirangs.Node;

public class DeleteLastNodeOfTheLinkedList {

	// Time : O(N)
	// Space : O(1)
	private static Node deleteLastNode(Node head) {

		if (head == null || head.getNext() == null) {
			head = null;
			return head;
		}
		Node secondLast = head;
		while (secondLast.getNext().getNext() != null) {
			secondLast = secondLast.getNext();
		}
		secondLast.setNext(null);
		return head;

	}

	private static void printLinkedList(Node head) {

		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.getData() + " --> ");
			temp = temp.getNext();
		}
		System.out.print("null");
		System.out.println();
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

		// head remains same if list has 2 or more elements
		deleteLastNode(head);
		deleteLastNode(head);
		Node head1 = deleteLastNode(head);
		printLinkedList(head1);
	}

}
