class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> ne = new HashMap<>();
        for(String s : strs)
        {
           char[] c = s.toCharArray();
           Arrays.sort(c);
           String s1 = String.valueOf(c);
           if(!ne.containsKey(s1))
           {
              ne.put(s1,new ArrayList());
           }
           ne.get(s1).add(s);
        }
        return new ArrayList(ne.values());
    }
}