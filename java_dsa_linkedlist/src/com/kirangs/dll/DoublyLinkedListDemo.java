package com.kirangs.dll;

import java.util.Stack;

public class DoublyLinkedListDemo {

	// Time : O(N)
	// space : O(1)
	private static Node reverse(Node head) {

		if (head == null || head.getNext() == null) {
			return head;
		}
		Node curr = head;
		Node last = null;
		while (curr != null) {
			last = curr.getPrev();
			curr.setPrev(curr.getNext());
			curr.setNext(last);
			curr = curr.getPrev();
		}
		return last.getPrev();

	}

	// Time : O(N + N)
	// Space : O(N)
	private static void reverseNaiveSolution(Node head) {

		Stack<Integer> stack = new Stack<>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp.getData());
			temp = temp.getNext();
		}
		temp = head;
		while (temp != null) {
			temp.setData(stack.pop());
			temp = temp.getNext();
		}
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

		Node head = new Node();
		head.setData(10);

		Node temp = new Node();
		temp.setData(20);

		Node temp1 = new Node();
		temp1.setData(30);

		head.setNext(temp);
		temp.setNext(temp1);
		temp.setPrev(head);
		temp1.setPrev(temp);

		printLinkedList(head);
//		reverseNaiveSolution(head);
		Node head1 = reverse(head);
		printLinkedList(head1);
	}
}
