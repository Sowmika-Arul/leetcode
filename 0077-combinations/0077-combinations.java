class Solution {  
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ne1 = new ArrayList<>();
        backtrack(ne1, new ArrayList<>(), 1, n, k);
        return ne1;
    }

    private void backtrack(List<List<Integer>> ne1, List<Integer> ne, int start, int n, int k) {
        if (ne.size() == k) { 
            ne1.add(new ArrayList<>(ne)); 
            return;
        }
        
        for (int i = start; i <= n; i++) {
            ne.add(i); 
            backtrack(ne1, ne, i + 1, n, k); 
            ne.remove(ne.size() - 1); 
        }
    }
}