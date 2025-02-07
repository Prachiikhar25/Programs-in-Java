package LeetCodeArray;

public class Pattern {
	public static void main(String args[]) {
		// print a pattern
		char ch = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
