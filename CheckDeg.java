package LeetCodeArray;

import java.util.*;
import java.io.*;

public class CheckDeg {

	public static void main(String args[]) {

		// Write code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		System.out.println("Ans is :" + (5.0 / 9.0) * (20 - 32));

		for (int i = s; i <= e; i = i + w) {
			double ans = (5.0 / 9.0) * (i - 32);
			System.out.println(i + " " + ((int) ans));
		}

	}
}