package LeetCodeArray;

public class SelectionSort {
	public static int[] sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 5, 2, 3, 4 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
