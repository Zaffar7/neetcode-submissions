class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int ans=0;
      boolean vis[][]= new boolean[grid.length][grid[0].length];
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1 && vis[i][j]==false){
          ans=  Math.max(ans,dfs(grid,i,j,vis));
            }
        }
      }
      return ans;
    }
  int  dfs(int grid[][],int i, int j,boolean vis[][]){
if(i<0 ||i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]==0)return 0 ;
if(vis[i][j]) return 0;
vis[i][j]=true;
int cnt=1;
cnt+=dfs(grid, i+1,j, vis);
cnt+=dfs(grid, i-1,j, vis);  
cnt+=dfs(grid, i,j+1, vis);  
cnt+=dfs(grid, i,j-1, vis); 
return cnt;   
    }
}
