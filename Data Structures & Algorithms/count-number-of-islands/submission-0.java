class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
      boolean vis[][]= new boolean[grid.length][grid[0].length];
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && vis[i][j]==false){
                dfs(grid,i,j,vis);
                cnt++;
            }
        }
      }
      return cnt;  
    }
    void dfs(char grid[][],int i, int j,boolean vis[][]){
if(i<0 ||i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]=='0')return ;
if(vis[i][j]) return ;
vis[i][j]=true;
dfs(grid, i+1,j, vis);
dfs(grid, i-1,j, vis);  
dfs(grid, i,j+1, vis);  
dfs(grid, i,j-1, vis);    
    }
}
