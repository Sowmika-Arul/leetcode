class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int total = 0, max = piles[0];
        for(int i = 1 ; i < piles.length; i++)
         max = Math.max(piles[i],max);
         int left = 1, right = max;
         while(left < right)
         {
            total = 0;
            int mid = (left+right)/2;
            for(int i = 0 ; i < piles.length; i++)
            total += Math.ceil((double)piles[i]/mid);
            if(total <= h)
            right = mid;
            else
            left = mid+1;
         }
         return left;
    }
}