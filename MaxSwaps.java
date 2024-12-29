// Input: s = "]]][[["
// Output: 2
// Explanation: You can do the following to make the string balanced:
// - Swap index 0 with index 4. s = "[]][][".
// - Swap index 1 with index 5. s = "[[][]]".
// The resulting string is "[[][]]".

package LeetCodeArray;

public class MaxSwaps {
	public static int checkSwaps(String s) {
		int swaps = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '[') {
				swaps++;
			} else {
				if (swaps > 0) {
					swaps--;
				}
			}
		}

		return (swaps + 1) / 2;
	}

	public static void main(String args[]) {
		String s = "]]][[[";
		System.out.println(checkSwaps(s));
	}
}
