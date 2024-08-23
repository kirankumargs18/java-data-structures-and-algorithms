package com.kirangs.dll;

public class InsertAtEnd {

	// Time : O(N)
	// Space : O(1)
	private static Node insertAtEnd(Node head, int data) {

		Node temp = new Node();
		temp.setData(data);
		if (head == null) {
			// by deafult these values will be null only
			temp.setPrev(null);
			temp.setNext(null);
			return temp;
		}
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(temp);
		temp.setPrev(curr);
		temp.setNext(null);
		return head;
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

		Node head = insertAtEnd(null, 10);

		insertAtEnd(head, 20);
		insertAtEnd(head, 30);

		printLinkedList(head);

	}

}
