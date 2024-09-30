class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       int max = nums[nums.length-1]+1;
       int k = 1,c = 0;
     for(int i = 0; i < nums.length; i++)
     {
       if(nums[i] > 0)
       {
        c = 1;
        if(nums[i] == k )
        {
            if(i != nums.length-1 && nums[i]!=nums[i+1])
             k++;
        } 
              
        else
        {
            max = k;
            break;
        }
       }
     }
     if(c == 0)
     return max = 1;
     return max;
    }
}