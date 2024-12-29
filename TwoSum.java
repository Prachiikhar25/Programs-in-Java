package LeetCodeArray;

import java.util.Arrays;

public class TwoSum {
	public static int[] twosum(int nums[], int target) {
		int[] b = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					b[0] = nums[i];
					b[1] = nums[j];
					return b;
				}
			}
		}
		return b;
	}

	public static void main(String args[]) {
		// muze do paas karne hai ek nums[], target (equals to sum of three integers)
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println("Two sum is" + Arrays.toString(twosum(nums, target)));
		// System.out.println("Two sum is: " + Arrays.toString(twosum(nums, target)));

	}
}

// Arrays.toString(): This method is used to convert the array into a readable
// format when printing.

// Without this, the output would just show the memory reference of the array
// rather than the actual numbers.
