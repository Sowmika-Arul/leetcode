class Solution {
    public int hIndex(int[] citations) {
         int length = citations.length, count = 0;
         Arrays.sort(citations);
         int h;
        for(int i = 0 ;i < length; i++)
        {
            h = length - i;
            if(citations[i] >= h)
            return h;
        } 
       return 0; 
    }
}