class Solution {
    public int trap(int[] height) {
        int max1 = 0,max2=0,sum=0;
        int[] right = new int[height.length];
        int[] left = new int[height.length];
        for(int i = 0;i<height.length;i++)
        {
            if(height[i] > max1) 
            max1 = height[i];
            right[i] = max1;
        }
        for(int i = height.length-1;i>=0;i--)
        {
               if(height[i] > max2)
               max2 = height[i];
               left[i] = max2;
        }
        for(int i = 0 ;i< height.length;i++)
        sum+=  Math.min(left[i],right[i]) - height[i];
        return sum;
    }
}