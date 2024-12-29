package LeetCodeArray;

import java.util.Arrays;
import java.util.Stack;

public class SortAStack {
	public Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> s1 = new Stack<>();
		int n = s.size();
		int arr[] = new int[s.size()];
		for (int i = 0; i < n; i++) {
			arr[i] = s.pop();
		}
		Arrays.sort(arr);
		for (int i = n - 1; i >= 0; i--) {
			s1.push(arr[n - i - 1]);
		}
		return s1;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(3);
		s.push(2);
		s.push(1);

		SortAStack obj = new SortAStack();
		Stack<Integer> sortedStack = obj.sort(s);

		while (!sortedStack.isEmpty()) {
			System.out.println(sortedStack.pop());
		}
	}
}
