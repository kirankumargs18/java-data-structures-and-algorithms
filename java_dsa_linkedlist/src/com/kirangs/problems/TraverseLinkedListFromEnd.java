package com.kirangs.problems;

import com.kirangs.Node;

public class TraverseLinkedListFromEnd {

	// Time : O(N)
	// Space : O(N)
	private static void function(Node temp) {

		if (temp == null) {
			return;
		}
		function(temp.getNext());
		System.out.print(temp.getData() + " ");
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

		Node temp = head;
		function(temp);
	}

}
