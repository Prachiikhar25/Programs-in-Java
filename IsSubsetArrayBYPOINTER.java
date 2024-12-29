package LeetCodeArray;

import java.util.Arrays;

public class IsSubsetArrayBYPOINTER {

	public static boolean isSubset(int a[], int b[]) {
		// Your code here
		// two pointers use karungi
		int i = 0, j = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		int m = a.length;
		int n = b.length;
		while (i < m && j < n) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] == b[j]) {
				i++;
				j++;
			} else {
				System.out.println("n = " + n);
				System.out.println("j = " + j);
				return false;
			}
		}
		System.out.println("n = " + n);
		System.out.println("j = " + j);
		return n == j;
	}

	public static void main(String args[]) {

		int[] a = { 11, 7, 1, 13, 21, 3, 7, 3 };
		int[] b = { 11, 3, 7, 1, 7 };
		boolean ans = isSubset(a, b);
		System.out.println(ans + " is ans");

	}

}
