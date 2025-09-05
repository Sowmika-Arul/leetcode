class Solution {
    public int firstMissingPositive(int[] nums) {
     int[] array = new int[nums.length + 1];
     int length = nums.length, store = 0;
     Arrays.fill(array, 0);
     int flag = 0;
     for(int i = 0; i < nums.length; i++){
        if(nums[i] <= nums.length && nums[i] > 0){
             array[nums[i]]++;
             flag = 1;
        } 
     }

     if(flag == 0) store = 1;
     
     else{
         for(int i = 1; i <= nums.length; i++){
            if(array[i] == 0){ store = i;  break;}
         }
     }

     if(store == 0) store = length + 1;

     return store;    
    }
}