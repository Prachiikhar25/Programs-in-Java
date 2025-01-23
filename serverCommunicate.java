package LeetCodeArray;

// Hello in this code I need to check in the grid of computers if the computer
// in same col and row is their if yes then its communicating
public class serverCommunicate {
	public static int isServer(int grid[][]) {
		int m = grid.length;
		int n = grid[0].length;
		int rowC[] = new int[m];
		int colC[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					rowC[i]++;
					colC[j]++;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (rowC[i] > 1 || colC[j] > 1) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int grid[][] = {
				{ 1, 0 },
				{ 1, 1 }
		};
		int res = isServer(grid);
		System.out.println(res + " is the desired output.");
	}
}