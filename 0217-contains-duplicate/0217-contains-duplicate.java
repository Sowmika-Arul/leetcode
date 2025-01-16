class Solution {
    public boolean containsDuplicate(int[] nums) {
       Map<Integer,Integer> ne = new HashMap<>();
    for(int i = 0; i < nums.length; i++)
    {
        if(ne.containsKey(nums[i]))
        return true;
        ne.put(nums[i],ne.getOrDefault(nums[i],0)+1);
    }
    return false;
    }
}