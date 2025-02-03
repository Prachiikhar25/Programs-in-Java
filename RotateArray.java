package LeetCodeArray;

public class RotateArray {
	public static void main(String args[]) {
		int k = 2;
		int nums[] = { 1, 2, 3, 4, 5 };
		int arr[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[i];
		}
		int n = arr.length;
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[(k + i) % n];
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// 4 5 1 2 3
		// 3 4 5 1 2

	}
}
