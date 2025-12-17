class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int c = 0,sum = 0;
        int rem = 0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
     for(int num:nums)
     {
        sum = sum + num;
        rem = sum % k;
        if(rem<0) rem = rem + k;
        if(map.containsKey(rem)) c=c+map.get(rem);
        map.put(rem,map.getOrDefault(rem,0)+1);
     }
     return c;    
    }
}