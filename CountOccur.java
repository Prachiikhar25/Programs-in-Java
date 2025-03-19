package LeetCodeArray;

import java.util.LinkedHashMap;
import java.util.*;

public class CountOccur {

	public static void countOccur(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void main(String args[]) {
		String s = "abcdefabcdwxyz";
		countOccur(s);
	}
}
