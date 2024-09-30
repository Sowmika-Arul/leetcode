class Solution {
     public int firstUniqChar(String s) {
       int ans = Integer.MAX_VALUE;
       for(char an = 'a'; an <= 'z'; an++)
       {
        int index = s.indexOf(an);
        if(index != -1 && index == s.lastIndexOf(an))
        {
            ans = Math.min(ans,index);
        }
       }
       return ans==Integer.MAX_VALUE ? -1 : ans;
    }   
}