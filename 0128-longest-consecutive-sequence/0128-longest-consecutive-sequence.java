class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int currentValue=0,currentCount=0;
        for(int num : nums) {
            set.add(num);
        }
        for(int num : set) {
            if(!set.contains(num-1)) {
                currentValue = num;
                currentCount = 1;
                while(set.contains(currentValue+1)) {
                    currentCount++;
                    currentValue++;
                }
                ans = Math.max(ans,currentCount);
            }
        }
        return ans;
    }
}
