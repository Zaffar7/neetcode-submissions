class Solution { 
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
   //  List<List<Integer>> ans= new arrayList<>();
      int r= heights.length;
      int c= heights[0].length;
    boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];

        // Pacific Ocean
        for (int j = 0; j < c; j++) {
            dfs(heights, 0, j,r,c, pacific);
        }

        for (int i = 0; i < r; i++) {
            dfs(heights, i, 0,r,c, pacific);
        }

        // Atlantic Ocean
        for (int j = 0; j < c; j++) {
            dfs(heights, r - 1, j,r,c, atlantic);
        }

        for (int i = 0; i < r; i++) {
            dfs(heights, i, c - 1,r,c, atlantic);
        }

        // Cells reachable from both oceans
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        } 
   
    return ans;
    }
void dfs(int [][] heights, int i, int j, int r, int c, boolean vis[][]){
 if (i < 0 || i >= r || j < 0 || j >= c) {
            return;
        }

        // Already visited
        if (vis[i][j]) {
            return;
        }

        vis[i][j] = true;
if(i+1<r && heights[i][j]<=heights[i+1][j]) dfs(heights,i+1,j,r,c,vis);
if(i-1>=0 && heights[i][j]<=heights[i-1][j]) dfs(heights,i-1,j,r,c,vis);
if(j+1<c && heights[i][j]<=heights[i][j+1]) dfs(heights,i,j+1,r,c,vis);
if(j-1>=0 && heights[i][j]<=heights[i][j-1]) dfs(heights,i,j-1,r,c,vis);

}
}
