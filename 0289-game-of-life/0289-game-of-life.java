class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int liveNeighbors;
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1}, {-1,1},{1,-1}};
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

              liveNeighbors = 0;

              for(int[] dir : directions){
                int ni = dir[0] + i;   int nj = dir[1] + j;
                if(ni >= 0 && nj >= 0 && ni < m && nj < n){
                    if(Math.abs(board[ni][nj]) == 1)
                    liveNeighbors++;
                }
              }

              if(board[i][j] == 1){
                if(liveNeighbors < 2 || liveNeighbors > 3) board[i][j] = -1;
              }
              else {
                if(liveNeighbors == 3) board[i][j] = 2;
              }
            }
        }
         for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(board[i][j] > 0) board[i][j] = 1;
                    else board[i][j] = 0;
                }
              }
    }
}
