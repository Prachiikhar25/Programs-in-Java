package LeetCodeArray;

public class minAddToMakeValid {
	public static int minparatovalid(String s) {
		int close_need = 0;
		int open_need = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				close_need++;
			} else if (c == ')') {
				if (close_need > 0) {
					close_need--;
				} else {
					open_need++;
				}
			}
		}
		return close_need + open_need;
	}

	public static void main(String args[]) {
		String s = "()()))";
		int result = minparatovalid(s);
		System.out.println("For String = " + s + " Result is " + result);
	}
}

// The loop for (char c : s.toCharArray()) is an enhanced for-loop (also called
// a "for-each" loop) in Java that iterates through each character in the string
// s.