class Solution {
    public void backtrack(int start, List<Integer> curr, List<List<Integer>> res,int n, int t)
    {
        if(curr.size() == n)
        {
            if(t==0)
            {
                res.add(new ArrayList(curr));
                return;
            }
            if(t<0)
            return;
        }
         for(int i = start; i <= 9; i++)
         {
            curr.add(i);
            backtrack(i+1, curr, res, n, t-i);
            curr.remove(curr.size()-1);
         }
    }
    public List<List<Integer>> combinationSum3(int n, int t) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        List<Integer> ne = new ArrayList<>();
        backtrack(1,ne,res,n,t);
        return res;
    }

}
