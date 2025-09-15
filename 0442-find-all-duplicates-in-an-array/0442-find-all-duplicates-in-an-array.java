class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> store = new ArrayList<>();
        Map<Integer, Integer> duplicates = new HashMap<>();

        for(int i = 0; i < nums.length; i++)  
            duplicates.put(nums[i], duplicates.getOrDefault(nums[i],0)+1);
        
        for(Map.Entry<Integer, Integer> entry : duplicates.entrySet()){
            if(entry.getValue() > 1)
            store.add(entry.getKey());
        }

        return store;
    }
}