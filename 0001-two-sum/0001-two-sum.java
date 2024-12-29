class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> ne = new HashMap<>();
    for(int i = 0; i < nums.length; i++)
    {
        int k = target-nums[i];
        if(ne.containsKey(k))
            return new int[]{i,ne.get(k)};
        else
        ne.put(nums[i],i);
    }
      throw new IllegalArgumentException("No solution found");
    }
}