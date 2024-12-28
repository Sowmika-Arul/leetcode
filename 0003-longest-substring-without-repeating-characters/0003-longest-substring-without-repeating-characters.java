class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character, Integer> ne = new HashMap<>();
        int l = 0, r = 0;
        int res = 0;
        int n = s.length();
        while(r<n)
        {
            if(ne.containsKey(s.charAt(r)))
                l = Math.max(l, ne.get(s.charAt(r))+1);
            ne.put(s.charAt(r),r);
            res = Math.max(r-l+1 ,res);
            r++;
        }
        return res;
    }
}
