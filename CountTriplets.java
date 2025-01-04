package LeetCodeArray;

//we need to optimize !!
public class CountTriplets {

	public static int count(int[] arr, int target) {
		// Code Here
		int count = 0;
		int sum;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = 0;
				for (int k = j + 1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					System.out.println("Sum no is = " + sum);
					if (sum == target) {
						count++;
					}
				}
				// System.out.println("Sum no is = " + sum);

			}
		}
		return count;

	}

	public static void main(String args[]) {
		int arr[] = { -3, -1, -1, 0, 1, 2 };
		int target = -2;
		int res = count(arr, target);
		System.out.println("Output is :" + res);
	}

}
