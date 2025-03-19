package LeetCodeArray;

import java.util.*;
import java.util.LinkedHashMap;

public class Practice {

	public static void CountOccur(String s) {
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

	// Insertion sort
	public static void main(String args[]) {
		System.out.println("To count the number of Ocurrences : ");
		String s = "HelloWorldd";
		CountOccur(s);
	}

}

// Correct way to return array is:>>
// return new int[]{nums[i], nums[j]};
