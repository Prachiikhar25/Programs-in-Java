package LeetCodeArray;

public class removeDuplicates {
	public static int rmdupi(int nums[]) {
		if (nums.length == 0)
			return 0; // Check for empty array

		int i = 0; // Points to the position to insert the next unique element
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j]; // Move the unique element to the next position
			}
		}
		return i + 1; // Length of the array without duplicates
	}

	public static void main(String args[]) {
		int[] nums = { 1, 2, 2, 5 }; // Sorted input
		int result = rmdupi(nums);
		System.out.println("Length of array without duplicates: " + result);

		// Printing the modified array up to the returned length
		for (int i = 0; i < result; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
