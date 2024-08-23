package com.kirangs.problems;

import com.kirangs.Node;

public class DeleteFirstNodeOfLinkedList {

	// Time : O(1)
	// Space : O(1)
	private static Node deleteFirstNode(Node head) {

		if (head == null) {
			return head;
		}
		return head.getNext();

	}

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

		Node head = new Node();
		head.setData(10);

		Node temp1 = new Node();
		temp1.setData(20);

		Node temp2 = new Node();
		temp2.setData(30);

		head.setNext(temp1);
		temp1.setNext(temp2);

		Node head1 = deleteFirstNode(head);

		printLinkedList(head1);

	}

}
