class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int num : nums)
            map.put(num, map.getOrDefault(num,0)+1);
            int maxFrequency = 0;
            for(int value : map.values())
            {
                if(value > maxFrequency)
                maxFrequency = value;
            }
            int totalFrequency = 0;
            for(int value : map.values())
            {
                if(value == maxFrequency)
                totalFrequency+=value;
            }
            return totalFrequency;

    }

}