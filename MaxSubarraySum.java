package LeetCodeArray;

public class MaxSubarraySum {
	public static void main(String args[]) {
		int n = 5;
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int s = 0; s < n; s++) {
			for (int end = s; end < n; end++) {
				for (int i = s; i <= end; i++) {
					System.out.print(arr[i]);
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
