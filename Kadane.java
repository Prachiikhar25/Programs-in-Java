package LeetCodeArray;

public class Kadane {
	public static int sumOfSub(int a, int b, int arr[]) {
		int sum = 0;
		for (int i = a; i < b; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void maxSum(int k, int arr[]) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n - k; i++) {
			max = Math.max(sumOfSub(i, i + k, arr), max);
			System.out.println(max);
		}

	}

	public static void main(String args[]) {
		// Kadane bana rhi hu guys
		// yass guys khud se kiya
		// rona niiiii
		// aww
		int k = 3;
		int arr[] = { 1, 5, 3, -2, 1000, -10 };
		System.out.println("Result is = ");
		maxSum(k, arr);
	}
}
