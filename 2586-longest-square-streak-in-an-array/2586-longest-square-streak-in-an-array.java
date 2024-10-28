import java.util.*;

class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums); 
        HashSet<Integer> set = new HashSet<>();
        
       
        for (int num : nums) {
            set.add(num);
        }
        
        int maxStreak = -1;
        

        for (int num : nums) {
          
            if (set.contains(num)) {
                int currentStreak = 0;
                int current = num;
                
              
                while (set.contains(current)) {
                    currentStreak++;
                    set.remove(current); 
                    current *= current; 
                }
                
                if (currentStreak > 1) { 
                    maxStreak = Math.max(maxStreak, currentStreak);
                }
            }
        }
        
        return maxStreak;
    }
}
