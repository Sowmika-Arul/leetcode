class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     int sum = 0;
     Arrays.sort(nums);
     List<List<Integer>> three = new ArrayList<>();
     int l,r;
for(int i = 0; i < nums.length-2; i++)
{
    if(i > 0 && nums[i] == nums[i-1])
    continue;
    l = i+1;
    r = nums.length-1;
     while(l < r)
     {
        sum = nums[i]+nums[l]+nums[r];
       if(sum == 0)
       {
        three.add(Arrays.asList(nums[i], nums[l], nums[r]));
        while(l < r && nums[l] == nums[l+1]) l++;
        while(l < r && nums[r] == nums[r-1]) r--;
        l++;
        r--;
       }
        else if(sum < 0)
        l++;
        else
        r--;
     }
    }
    return three;
    }
}