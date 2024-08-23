package com.kirangs.dll;

public class InsertAtBigining {

	// Time : O(1)
	// Space : O(1)
	// head value changes every time when we insert a new node
	private static Node insert(Node head, int data) {

		Node temp = new Node();
		temp.setData(data);

		// if list is empty, new node will be first node of the list
		if (head == null) {
			temp.setPrev(null);
			temp.setNext(null);
			return temp;
		}
		temp.setNext(head);
		temp.setPrev(null);
		head.setPrev(temp);
		return temp;
	}

	// Time : O(N)
	// Space : O(1)
	private static void printLinkedList(Node head) {

		Node curr = head;
		while (curr != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Node head = insert(null, 10);
		printLinkedList(head);

		Node head1 = insert(head, 20);
		printLinkedList(head1);

		Node head2 = insert(head1, 30);
		printLinkedList(head2);

	}
}
