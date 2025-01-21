class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int sum = 0;
        int s = height.length;
        while(l<r)
        {
            s--;
            int mul = Math.min(height[l],height[r])*s;
            sum = Math.max(mul,sum);
            if(height[l] < height[r]) 
            l++;
            else
            r--;
        }
    return sum;
    }
}