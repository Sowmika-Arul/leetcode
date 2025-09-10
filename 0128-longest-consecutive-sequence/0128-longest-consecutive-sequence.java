class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int num : nums) store.add(num);
        int maxCount = 0;
        for(int num : store){
            if(!store.contains(num - 1)){
                int count = 1;
                while(store.contains(num + 1)){
                       count += 1;
                       num += 1;
                }
               if(maxCount < count) maxCount = count;
            }
        }
        return maxCount;
    }
}