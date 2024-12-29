package LeetCodeArray;

import java.util.Arrays;

public class FirstPositive {
	public int firstMissingPositive(int[] nums) {
		int c = 1;// initialize result by 1
		int index = -1;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 1) {
				index++;

			} else {
				break;
			}
		}
		System.out.println("my index is = " + index);
		if (index < 0) {
			return 1;
		} else if (nums[index] != 1) {
			System.out.println("corner pe" + index);
			return c;
		}

		else {
			for (int j = index; j < nums.length; j++) {
				System.out.println(index + " hai mera index");
				if (nums[j] != c) {
					System.out.println("ok");
					return c;

				} else {
					System.out.println("add ho gaya");
					c = c + 1;
				}
			}
		}

		return c;
	}

	public static void main(String[] args) {
		FirstPositive solution = new FirstPositive();

		// Test case 1
		// int[] nums1 = { 1, 2, 0 };
		// System.out.println("First Missing Positive: " +
		// solution.firstMissingPositive(nums1)); // Expected output: 3

		// Test case 2
		int[] nums2 = { 100000, 3, 4000, 2, 15, 1, 99999 };

		System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums2)); // Expected output: 2

		// // Test case 3
		// int[] nums3 = { 7, 8, 9, 11, 12 };
		// System.out.println("First Missing Positive: " +
		// solution.firstMissingPositive(nums3)); // Expected output: 1

		// Test case 4
		// int[] nums4 = { 1, 6, 2 };
		// System.out.println("First Missing Positive: " +
		// solution.firstMissingPositive(nums4)); // Expected output: 3
	}
}
