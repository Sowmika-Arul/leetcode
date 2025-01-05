class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> s = new HashSet<>();
       for(int num : nums)
        s.add(num);
        int count = 0;
        for(int num : s)
        {
            if(!s.contains(num-1))
            {
                int currentnum = num;
                int currentcount = 1;
                while(s.contains(currentnum+1))
                {
                    currentcount++;
                    currentnum++;
                }
                count= Math.max(currentcount,count);
            }
        } 
        return count;
    }
}