package com.kirangs.problems;

import com.kirangs.Node;

//Assume pos is valid and >=1, <=length of linked list
public class InsertAtGivenPosition {

	private static Node insertAtGivenPosition(Node head, int data, int pos) {

		// create new node
		Node temp = new Node();
		temp.setData(data);

//		// find length
//		int n = lengthOfLinkedList(head);
//
//		// check if pos is greaterthan length
//		if (pos > n + 1 || pos < 1) {
//			return head;
//		}
		if (pos == 1) {
			// insert at begining
			if (head == null) {
				head = temp;
				return head;
			}
			temp.setNext(head);
			head = temp;
			return head;
		} else {
			Node curr = head;
			for (int i = 1; i <= pos - 2 && curr != null; i++) {
				curr = curr.getNext();
			}
			if (curr == null) {
				return head;
			}
			Node currNext = curr.getNext();
			curr.setNext(temp);
			temp.setNext(currNext);
			return head;
		}
	}

	// Time : O(N)
	// Space : O(1)
	private static int lengthOfLinkedList(Node head) {

		Node temp = head;
		int count = 0;
		while (temp != null) {
			count = count + 1;
			temp = temp.getNext();
		}
		return count;
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

		Node head = new Node();
		head.setData(10);

		Node temp1 = new Node();
		temp1.setData(20);

		Node temp2 = new Node();
		temp2.setData(30);

		head.setNext(temp1);
		temp1.setNext(temp2);

		printLinkedList(insertAtGivenPosition(head, 100, 6));

	}

}
