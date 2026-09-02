class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
      return   dfs(grid,0,0, dp);
    }
      int  dfs(int[][] grid, int i,int j, int [][]dp){
       if(i==grid.length-1 && j== grid[0].length-1){
        return grid[i][j];
       }
       /*  if (i == grid.length || j == grid[0].length) {
            return Integer.MAX_VALUE;
        }*/
       if(dp[i][j]!=-1) return dp[i][j];
   int d = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;

        // Move down
        if (i + 1 < grid.length) {
            d = dfs(grid, i + 1, j, dp);
        }

        // Move right
        if (j + 1 < grid[0].length) {
            r= dfs(grid, i, j + 1, dp);
        }
    
//we have to store min in dp[i][j]
      return dp[i][j]= grid[i][j]+ Math.min(r,d);
        }
    }
