class Solution {
    public int longestNiceSubarray(int[] nums) {
        int currentMask = 0, longest = 0;
       for(int start = 0, end = 0; end < nums.length; end++)
       {
        while((currentMask & nums[end]) != 0)
        currentMask ^= nums[start++];
        longest = Math.max(longest, end - start+1);
        currentMask |= nums[end];
       }
     return longest;
    }
}