package LeetCodeArray;

class LL {
	int val;
	LL next;

	LL(int val) {
		this.val = val;
		this.next = null;
	}
}

public class ReverseList {
	public static LL revlist(LL head) {
		LL prev = null;
		LL curr = head;

		while (curr != null) {
			LL next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void PrintLl(LL head) {
		LL temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LL head = new LL(1);
		head.next = new LL(2);
		head.next.next = new LL(3);
		head.next.next.next = new LL(4);
		System.out.println("Original List:");
		PrintLl(head);
		head = revlist(head);
		System.out.println("Reversed List:");
		PrintLl(head);

	}
}