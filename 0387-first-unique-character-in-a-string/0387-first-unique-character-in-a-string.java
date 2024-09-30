class Solution {
    public int firstUniqChar(String s) {
        char [] str = s.toCharArray();
      for(int i = 0; i < str.length; i++)
      {
        for(int j = 0; j < str.length; j++)
        {
            if(i!=j && str[i] == str[j])
            break;
            if(j == str.length-1)
            return i;
        }
      }
      return -1;
    }
}