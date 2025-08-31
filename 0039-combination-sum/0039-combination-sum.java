class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0, sum1 = 0, count = 0;
        List<List<Integer>> result = new ArrayList<>();
        backtrack(target, candidates, result, 0, new ArrayList<>());
        return result;
    }

    public void backtrack(int target, int[] candidates, List<List<Integer>> result, int start, List<Integer> path){
    
    if(target == 0){
    result.add(new ArrayList<>(path));
    return;
    }
    if(target < 0) return;

    for(int i = start; i < candidates.length; i++){
        path.add(candidates[i]);
        backtrack(target - candidates[i], candidates, result, i, path);

        path.remove(path.size() - 1);
    }
    }
}