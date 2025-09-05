class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        List<Integer> store = new ArrayList();
        while(left <= right && top <= bottom){

        for(int i = left; i <= right; i++) store.add(matrix[top][i]); 
        top++;

        for(int j = top; j <= bottom; j++) store.add(matrix[j][right]); 
        right--;

        if(top <= bottom){
        for(int k = right; k >= left; k--) store.add(matrix[bottom][k]);
        bottom--;
        }

        if(left <= right){
        for(int l = bottom; l >= top; l--) store.add(matrix[l][left]);
        left++;
        }
        }
        return store;
    }
}