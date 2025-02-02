import java.util.*;

public class BooleanCheck {
	public static void check(int[] nums) {
		if (nums.length <= 2) {
			System.out.println("hai 1");

		} else if (nums[0] <= nums[1] || nums[1] <= nums[2]) {
			System.out.println(" hai 2 ");

		}

		System.out.println("nahi hai");

	}

	public static void main(String args[]) {
		int nums[] = { 2, 1, 3, 4 };
		check(nums);
	}
}
