class Solution {
    public int findUnsortedSubarray(int[] nums) {
          int left = 0, right = nums.length - 1;

         while(left < nums.length - 1 && nums[left] <= nums[left + 1]) left++;

        if(left == nums.length - 1) return 0;

       while(right > 0 && nums[right] >= nums[right - 1]) right--;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = left; i <= right; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        
        while(left > 0 && nums[left - 1] > min) left--;

        while(right < nums.length - 1 && nums[right + 1] < max) right++;

        return right - left + 1;
    }
}