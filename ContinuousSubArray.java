package LeetCodeArray;

import java.util.*;

public class ContinuousSubArray {
	public static void main(String args[]) {
		int arr[] = { 5, 4, 2, 4 };
		int sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (Math.abs(arr[i] - arr[j]) <= 2) {
					sum++;
					System.out.println(sum);
				}
			}
		}
		System.out.println(sum);
	}
}
// yeah that's one way to do IT! hehe