package com.kirangs.problems;

import com.kirangs.Node;

public class TraversingLinkedList {

	// Time : O(N)
	// Space : O(N)
	// where N is length of the linked list
	private static void recusiveTraversal(Node temp) {

		if (temp == null) {
			System.out.print("null");
			return;
		}
		System.out.print(temp.getData() + " --> ");
		recusiveTraversal(temp.getNext());
	}

	// Time : O(N)
	// Space : O(1)
	private static void linkedListTraverse(Node head) {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " --> ");
			temp = temp.getNext();
		}
		System.out.print("null");
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

		linkedListTraverse(head);
		
		System.out.println();

		Node temp = head;
		recusiveTraversal(temp);
	}

}
