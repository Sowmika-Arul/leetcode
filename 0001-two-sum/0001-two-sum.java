class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] ne = new int[2];
      int sum = 0;
      for(int i = 0; i < nums.length-1; i++)
      {
        for(int j = i+1; j < nums.length; j++)
        {
             sum = nums[i]+nums[j];
             if(target == sum)
             {
                ne[0] = i;
                ne[1] = j;
             }
        }
      } 
      return ne; 
    }
}