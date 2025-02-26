package LeetCodeArray;

public class BubbleSort {
	public static int[] sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String args[]) {
		// Bubble sort hai swap (n)*(n-1)/2
		int arr[] = { 2, 1, 3, 5, 4 };
		System.out.println("Sorted array is :");
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}