class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        // directions for 8 neighbors
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1},
                        {0, -1},           {0, 1},
                        {1, -1}, {1, 0}, {1, 1}};

        // Step 1: Apply rules with temporary markers
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int liveNeighbors = 0;

                // count live neighbors
                for (int[] d : dirs) {
                    int nr = r + d[0], nc = c + d[1];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                        if (Math.abs(board[nr][nc]) == 1) {
                            liveNeighbors++;
                        }
                    }
                }

                // Rule applications
                if (board[r][c] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[r][c] = -1; // live → dead
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[r][c] = 2;  // dead → live
                    }
                }
            }
        }

        // Step 2: Finalize states
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] > 0) {
                    board[r][c] = 1;
                } else {
                    board[r][c] = 0;
                }
            }
        }
    }
}
