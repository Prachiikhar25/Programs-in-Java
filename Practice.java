package LeetCodeArray;

import java.util.Arrays;

public class Practice {
	public static int[] twosum(int nums[], int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { nums[i], nums[j] };

				}
			}
		}
		return new int[] { 0, 0 };
	}

	public static void main(String args[]) {
		// twosum ke problem mai
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println("Two sum is" + Arrays.toString(twosum(nums, target)));

	}
}

// Correct way to return array is:>>
// return new int[]{nums[i], nums[j]};
