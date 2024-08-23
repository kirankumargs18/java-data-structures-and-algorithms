package com.kirangs;

public class LinkedListImplementationInJava {

	public static void main(String[] args) {

		Node head = new Node();
		head.setData(10);
		Node temp1 = new Node();
		temp1.setData(20);
		Node temp2 = new Node();
		temp2.setData(30);

		head.setNext(temp1);
		temp1.setNext(temp2);

		// Traversing linked list
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " --> ");
			temp = temp.getNext();
		}
		System.out.print("null");
	}

}
