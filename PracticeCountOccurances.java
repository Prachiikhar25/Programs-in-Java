package LeetCodeArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeCountOccurances {
	public static void countOccurances(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : s.toCharArray()) {
			if (ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
		}

		for (Map.Entry<Character, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}

	}

	public static void main(String args[]) {
		String str = "geekforgeeks";
		countOccurances(str);
	};
}
