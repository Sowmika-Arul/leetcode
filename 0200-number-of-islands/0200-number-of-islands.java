class Solution {
    void dfs(char[][] grid, int r, int c)
    {
        int rc = grid.length;
        int cc = grid[0].length;
        if(r < 0 || c < 0 || r >= rc || c >= cc || grid[r][c] == '0') return;
        grid[r][c] = '0';
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1); 
    }
    public int numIslands(char[][] grid) { 
        if(grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int num_islands = 0;
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
           if(grid[i][j] == '1')
        {
            ++num_islands;
            dfs(grid,i,j);
        }  
        }
      }  
      return num_islands;
    }
}