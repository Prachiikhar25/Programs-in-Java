package LeetCodeArray;

import java.util.*;

public class FancyString {

	public static String makeFancyString(String s) {
		StringBuilder sb = new StringBuilder(s);
		int n = s.length() - 1;
		for (int i = 0; i < n; i++) {
			if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 1) == sb.charAt(i + 2)) {
				sb.deleteCharAt(i);
				i--;
				n--;
				// sb ke ith element ko del kiya jaa rha toh usi pr traverse karo
				// i--; karna hi hoga jab element at i del ho jaye
				// if not then vo ek step aage badhega and 2nd test case paas nhi hogi
			}
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String str = "aaabbyugjhsag";
		String res = makeFancyString(str);
		System.out.println(res);
	}
}
