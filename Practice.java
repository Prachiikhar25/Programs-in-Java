package LeetCodeArray;

import java.util.Arrays;

public class Practice {
	public static int[] sort(int arr[]) {
		int key;
		int n = arr.length;
		int j;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	// Insertion sort
	public static void main(String args[]) {

		int arr[] = { 2, 1, 3, 4, 5 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}

// Correct way to return array is:>>
// return new int[]{nums[i], nums[j]};
