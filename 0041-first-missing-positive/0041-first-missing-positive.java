class Solution {
    public int firstMissingPositive(int[] nums) {
     Set<Integer> set = new HashSet<>();
     int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
        set.add(nums[i]);
        if(nums[i] > max)
        max = nums[i];
        }
        for(int i = 1 ; i <= max; i++)
        {
        if(!set.contains(i))
        return i;
        }
        return max+1;
    }
}