class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m,n;
        int len = nums.length;
        int[] ne = new int[2];
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                   ne[0] = i;
                   ne[1] = j;
                   break;
                }
            }
        }
        return ne;
        
    }
}