package LeetCodeArray;

import java.util.HashMap;

public class SubarrayXOR {

	public static int countSubarraysWithXOR(int[] arr, int k) {
		int n = arr.length;
		int count = 0;
		int xor = 0;
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		// Traverse the array
		for (int i = 0; i < n; i++) {
			// Update XOR of the current prefix
			xor ^= arr[i];

			// Check if the current XOR equals k
			if (xor == k) {
				count++;
			}

			// Check if (xor ^ k) exists in the map
			int targetXOR = xor ^ k;
			if (freqMap.containsKey(targetXOR)) {
				count += freqMap.get(targetXOR);
			}

			// Add the current XOR to the map
			freqMap.put(xor, freqMap.getOrDefault(xor, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;
		System.out.println("Number of subarrays with XOR = " + k + ": " + countSubarraysWithXOR(arr, k));
	}
}
