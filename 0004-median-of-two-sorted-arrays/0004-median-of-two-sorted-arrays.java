class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m+n];
       while(nums1.length > i && nums2.length > j)
       {
        if(nums1[i] < nums2[j])
         {
            temp[k++] = nums1[i];
            i++;
         }
         else
         {
            temp[k++] = nums2[j];
            j++;
         }
       }
       while(nums1.length > i)
       temp[k++] = nums1[i++];
       while(nums2.length > j)
       temp[k++] = nums2[j++];
        int totalLength = m + n;
        if (totalLength % 2 == 0) {
            return (temp[totalLength / 2 - 1] + temp[totalLength / 2]) / 2.0;
        } else {
            return temp[totalLength / 2];
        }
    }
}