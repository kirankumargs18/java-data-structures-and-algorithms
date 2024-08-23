package com.kirangs.dll;

public class ReverseDLL {

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

	}

}
