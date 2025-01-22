package LeetCodeArray;

import java.util.Scanner;

public class IsUpperLower {
	public static void main(String args[]) {
		// Write a program that takes a character as input and prints either 1, 0, or -1
		// according to the following rules.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		if (Character.isUpperCase(ch)) {
			System.out.println("UpperCase Hai");
		} else if (Character.isLowerCase(ch)) {
			System.out.println("Lower Case");
		} else {
			System.out.println("Not either");
		}

	}
}
