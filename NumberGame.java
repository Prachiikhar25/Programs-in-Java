package LeetCodeArray;

import java.util.*;

// Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
// Now, first Bob will append the removed element in the array arr, and then Alice does the same.
// The game continues until nums becomes empty.
// Return the resulting array arr.
public class NumberGame {
	public static void alicebob(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < n; i += 2) {
			li.add(nums[i]);
			li.add(nums[i - 1]);
		}
		for (int i = 0; i < n; i++) {
			nums[i] = li.get(i);
			System.out.print(li.get(i) + " ");
		}
		return;
	}

	public static void main(String args[]) {
		int[] nums = { 5, 4, 2, 3 };// even length
		alicebob(nums);
	}
}
// Approach: list banayi. pehle for loop i=1 se lagakar update i+2 krk list mai
// nums[i] print kiya aur fir nums[i-1] print kiya kept on repeating till loop
// ends. At last convert list to array explicitly using for loop.and return.