package LeetCodeArray;

import java.util.*;

public class PalindromeCheck {
	public static void main(String args[]) {
		String str = "Prachi";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sr = sb.reverse();
		if (sr.toString() == str) {
			// sr.toString().equals(str) ye use karna chiye
			System.out.println("IS A palindrome!");
		} else {
			System.out.println("IS NOT A PALINDROME!");
		}
	}
}

// way 1
/*
 * public class Solution {
 * public static Boolean isReflectionEqual(String s) {
 * int left = 0, right = s.length() - 1;
 * 
 * while (left < right) {
 * if (s.charAt(left) != s.charAt(right)) {
 * return false;
 * }
 * left++;
 * right--;
 * }
 * return true;
 * }
 * }
 */

// way 2

/*
 * import java.util.*;
 * import java.io.*;
 * 
 * public class Solution {
 * public static Boolean isReflectionEqual(String s) {
 * // Reverse the string using StringBuilder
 * StringBuilder sb = new StringBuilder(s);
 * String sr = sb.reverse().toString();
 * 
 * // Compare actual contents using equals()
 * return s.equals(sr);
 * }
 * }
 * 
 */

// way 3
/*
 * import java.util.* ;
 * import java.io.*;
 * public class Solution {
 * public static Boolean isReflectionEqual(String s) {
 * // Write your code here
 * StringBuilder sb = new StringBuilder(s);
 * String sr= sb.reverse().toString();
 * return s.equals(sr);
 * //mera code sirf palindrome hai ya nahi check kar rha
 * }
 * }
 * 
 */

// //palindrome I need to reverse a string
// int i=0;
// int n=s.length();
// StringBuilder sb = new StringBuilder("");
// while(s.charAt(i)!=null){
// sb.append(s.charAt(n-1-i));
// i++;
// }
// return s==(String)sb;
// }
// }
// mai string ko null tak kaise traverse kare base condition kya dein
// //str==null || str.isEmpty();
// stringBuilder ko kaise initialize kare
// //StringBuilder sb = new StringBuilder();
// string ko kaise add kare
// aur string ko kaise compare kare s==sb se kar sakte kya?
// how to compare string and string builder?