package LeetCodeArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccur {
	public static void countOccurances(String s) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			}
		}
		// for (char ch : str.toCharArray())ry

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void main(String args[]) {
		String str = "helloworld";
		System.out.println("I need to count the no. of occurances.");
		countOccurances(str);
	}
}
