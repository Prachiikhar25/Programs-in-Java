package LeetCodeArray;

import java.util.*;

class Node {
	int data;
	Node next;

	Node(int x) {
		this.data = x;
		this.next = null;
	}
}

public class MidLinkedList {
	static int getLength(Node head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}

	static int getMiddle(Node head) {
		int len = getLength(head);
		int mid_index = len / 2;
		while (mid_index > 0) {
			head = head.next;
			mid_index--;
		}
		return head.data;
	}

	public static void main(String args[]) {
		// 10 -> 20 -> 30 -> 40 -> 50 -> 60
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);

		System.out.println(getMiddle(head));
	}
}
