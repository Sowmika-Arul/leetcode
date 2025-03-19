import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count occurrences of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Count how many numbers have a certain frequency
        TreeMap<Integer, Integer> freqCount = new TreeMap<>();
        for (int frequency : freq.values()) {
            freqCount.put(frequency, freqCount.getOrDefault(frequency, 0) + 1);
        }

        // Step 3: Remove elements starting from the lowest frequency
        int uniqueCount = freq.size();
        for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            int freqValue = entry.getKey(); // Frequency count (e.g., 2)
            int numCount = entry.getValue(); // How many numbers have this frequency (e.g., 3)

            int removeCount = Math.min(numCount, k / freqValue); // Fully remove elements

            k -= removeCount * freqValue; // Deduct k
            uniqueCount -= removeCount; // Reduce unique elements count

            if (k < freqValue) break; // Stop if we cannot fully remove more numbers
        }

        return uniqueCount;
    }
}
