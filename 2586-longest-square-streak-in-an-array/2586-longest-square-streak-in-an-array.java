import java.util.*;

class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle elements in ascending order
        HashSet<Integer> set = new HashSet<>();
        
        // Add all numbers to a set for quick lookup
        for (int num : nums) {
            set.add(num);
        }
        
        int maxStreak = -1; // Initialize maxStreak to -1 (if no streak found)
        
        // Iterate over each number to find the longest square streak
        for (int num : nums) {
            // Start a new streak only if the current number is still in the set
            if (set.contains(num)) {
                int currentStreak = 0;
                int current = num;
                
                // Keep finding squares of current value as long as they exist in the set
                while (set.contains(current)) {
                    currentStreak++;
                    set.remove(current); // Remove to avoid rechecking
                    current *= current; // Move to the next square
                }
                
                // Check if the current streak is the longest
                if (currentStreak > 1) { // Only count streaks with length >= 2
                    maxStreak = Math.max(maxStreak, currentStreak);
                }
            }
        }
        
        return maxStreak;
    }
}
