class Solution {int cnt=0;
    public int islandPerimeter(int[][] grid) {
        
        boolean vis[][]= new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                  dfs(grid,i,j,vis);
                }
            }
        }
        return cnt;
        
    }
  void  dfs(int [][]grid, int r, int c,boolean vis[][]){
      if(r<0 || r>grid.length-1 || c<0 || c>grid[0].length-1 ||grid[r][c]==0){
        cnt++; return ;
    }
        if(vis[r][c]) return;
        vis[r][c]=true;
        
     
dfs(grid,r+1,c,vis);    
dfs(grid,r-1,c,vis);
dfs(grid,r,c+1,vis);
dfs(grid,r,c-1,vis);
    }
}