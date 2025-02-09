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