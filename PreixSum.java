package LeetCodeArray;

import java.util.*;

public class PreixSum {
	public static int countSubarrays(int arr[], int k) {
		// Initialize a HashMap to store prefix sums
		HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
		int count = 0; // To store the count of valid subarrays
		int currentSum = 0; // Running sum of elements

		for (int num : arr) {
			// Add the current element to the running sum
			currentSum += num;

			// Check if the running sum itself equals k
			if (currentSum == k) {
				count++;
			}

			// Check if (currentSum - k) exists in the map
			if (prefixSumCount.containsKey(currentSum - k)) {
				count += prefixSumCount.get(currentSum - k);
			}

			// Update the HashMap with the current running sum
			prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
		}

		return count;
	}

	public static void main(String args[]) {
		int arr[] = { 9, 4, 20, 3, 10, 5 };
		int k = 33;
		int p = countSubarrays(arr, k);
		System.out.println("Answer is " + p);
	}
}
