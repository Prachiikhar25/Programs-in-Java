package LeetCodeArray;

public class InsertionSort {
	public static int[] sort(int arr[]) {
		int n = arr.length;

		int j;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;

		}
		return arr;
	}

	public static void main(String args[]) {
		int arr[] = { 3, 1, 2, 4, 5 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}