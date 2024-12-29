package LeetCodeArray;

public class ConsOne {
	public static void res(int nums[]) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else if() {
				System.out.println(count);
				max = Math.max(max, count);
				count = 0;
			}

		}

	}

	public static void main(String args[]) {
		int nums[] = { 1, 1, 0, 1, 0, 1, 1, 1 };
		res(nums);
	}
}
