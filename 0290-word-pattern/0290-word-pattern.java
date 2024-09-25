class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String>a = new HashMap<>();
        String[] b = s.split(" ");
       if(pattern.length() != b.length)
       return false;
       for(int i = 0 ; i<b.length;i++)
       {
        if(a.containsKey(pattern.charAt(i)))
        {
            String st = a.get(pattern.charAt(i));
            if(!st.equals(b[i]))
            return false;
        }
        else
        {
            if(a.containsValue(b[i]))
            return false;
        }
        a.put(pattern.charAt(i),b[i]);
       }
       return true;
    }
}