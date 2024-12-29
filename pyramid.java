package LeetCodeArray;

public class pyramid {
	public static void main(String args[]) {
		// pyramid print karna hai
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// space n-i-1 times print karna hai
				System.out.print("  ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				// ye ab print karna hai i*2+1 times
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}