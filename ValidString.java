package LeetCodeArray;

import java.util.*;

public class ValidString {
	public static void checkValidString(String s) {
		if (s == null) {
			System.out.println("Null string");

		}
		int count = 0;
		int u = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
			}
			if (s.charAt(i) == '*') {
				u++;
			} else if (s.charAt(i) == ')') {
				count--;
			}
		}
		System.out.println("count is =" + count);
		System.out.println("And unique ones are :" + u);
		boolean res = (count == 0 || count <= u) ? true : false;
		System.out.println("Output should be " + res);
	}

	public static void main(String args[]) {
		// how can i get the valid paranthesis

		String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
		checkValidString(s);
	}
}
