class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        boolean rotted;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2) queue.offer(new int[]{i,j}); 
            }
        }
       
       if(fresh == 0) return 0;
       int[][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!queue.isEmpty()){
             rotted = false;
            int size = queue.size();
          
          for(int i = 0; i < size; i++){
             int pos[] = queue.poll();
            for(int[] direction : directions){
                int ni = pos[0] + direction[0];
                int nj = pos[1] + direction[1];
            
            if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && grid[ni][nj] == 1){
                grid[ni][nj] = 2;
                fresh--;
                queue.offer(new int[]{ni, nj});
                rotted = true;
            }
            }
          }
            if(rotted) minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}