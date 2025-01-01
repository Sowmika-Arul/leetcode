class Solution {
    public int maxScore(String s) {
        char[] c = s.toCharArray();
        int co = 0, max = 0, sum;
        int n = c.length;
        for(int i = 0; i < c.length-1; i++)
        { 
            int c1  = 0;
            for(int j = i+1; j < c.length; j++)
             {
                 if(c[j] == '1')
                 c1++;
             }
             if(c[i] == '0')
             co++;
             sum = c1+co;
             if(sum > max)
             max = sum;
        }
        return max;
    }
}