package LeetCodeArray;

import java.util.HashSet;
import java.util.Set;

public class IsSubsetArrayBYHASH {
	public static boolean isSubset(int a[], int b[]) {
		// Your code here
		// two pointers use karungi
		Set<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}
		for (int i = 0; i < b.length; i++) {
			if (!set.contains(b[i])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]) {

		int[] a = { 11, 7, 1, 13, 21, 3, 7, 3 };
		int[] b = { 11, 3, 7, 1, 7 };

		boolean ans = isSubset(a, b);
		System.out.println(ans + " is ans");

	}

}
