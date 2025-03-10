package LeetCodeArray;

class Node {
	int data;
	Node next;

	Node(int new_data) {
		data = new_data;
		next = null;
	}
}

public class LLReverse {
	static Node reverse(Node head) {
		Node curr = head, prev = null, next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static void printLL(Node node) {
		while (node != null) {
			System.out.println(" " + node.data);
			node = node.next;
		}
	}

	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.print("Given Linked list:");
		printLL(head);

		head = reverse(head);

		System.out.print("\nReversed Linked List:\n");
		printLL(head);

	}
}
