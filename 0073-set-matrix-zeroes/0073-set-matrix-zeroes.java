import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> store = new ArrayList<>();
        int ind = 0, i, j;
        for(i =0; i < matrix.length; i++){
            for(j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0) store.add(new int[]{i, j});
            }
        }
        for(int[] index : store){
            i = index[0];
            j = index[1];
         for(int k = 0; k < matrix.length; k++) matrix[k][j] = 0;
         for(int l = 0; l < matrix[0].length; l++) matrix[i][l] = 0;
        }
    }
}
