package LeetCodeArray;

public class ConsOne {
	public static void res(int nums[]) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
		}
		// Check the last sequence of 1s
		max = Math.max(max, count);
		System.out.println("Maximum consecutive ones: " + max);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		res(nums);
	}
}