class Solution {
    public void sortColors(int[] nums) {
        int left = 0,middle = 0,right = nums.length-1;
        while(middle <= right)
        {
            if(nums[middle] == 0)
            {
               swap(nums,left,middle);
               left++;
               middle++;
            }
            else if(nums[middle] == 1)
            {
               middle++;
            }
            else
            {
                swap(nums,middle,right);
                right--;
            }
        }
    }
      void swap(int[] nums, int a,int b)
        {
            int temp;
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    
}