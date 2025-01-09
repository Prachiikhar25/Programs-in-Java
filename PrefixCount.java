package LeetCodeArray;

public class PrefixCount {
	public static int prefixcount(String s[]) {
		int count = 0;
		for (String str : s) {
			if (str.startsWith("at")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		String words[] = { "attention", "charlie", "Kiiim", "atm" };
		int ans = prefixcount(words);
		System.out.println(ans + " is the answer.");
	}
}
