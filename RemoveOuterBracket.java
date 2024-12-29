package LeetCodeArray;

import java.util.Stack;

public class RemoveOuterBracket {

	public static String removeOuterParentheses(String s) {
		// mai outer bracket ko track karne k liye stack ka use karungi
		// inner bracket ko sb mai store karungi
		// agar condn(outer bracket na ho) true hoti toh hi mai use sb mai append
		// karungi
		Stack<Character> bracket = new Stack<>();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				if (bracket.size() > 0) {
					sb.append(s.charAt(i));
				}
				bracket.push(s.charAt(i));
			} else {
				bracket.pop();
				if (bracket.size() > 0) {
					sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString();
		// ye ese return karne se stringbuilder string mai conver hoga
		// aisa kyu?---> return tye string hai.
	}

	public static void main(String args[]) {
		String str = "((()()))";
		System.out.println("Result is = " + removeOuterParentheses(str));
	}
}
