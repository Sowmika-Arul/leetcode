class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> an = new ArrayList<>();
      int[] a = new int[nums.length+1];
      for(int i = 0; i< nums.length; i++)
      a[nums[i]] = 1;
      for(int i = 1; i<= nums.length; i++)
      {
        if(a[i]!=1)
        an.add(i);
      }
      return an;
    }
}