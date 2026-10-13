/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
   return  dfs(0,grid.length,0,grid[0].length,grid);
    }
  Node  dfs(int top_row, int btm_row, int col_left, int col_right,int[][] grid){
      int val= grid[top_row][col_left];
      for(int i=top_row;i<btm_row;i++){
        for(int j=col_left;j<col_right;j++){
        if(grid[i][j]!=val){
    int mid_row= (top_row+btm_row)/2;
    int mid_col= (col_left+col_right)/2;
Node topLeft =dfs(top_row,mid_row,col_left,mid_col,grid);
Node  topRight =dfs(top_row,mid_row,mid_col,col_right,grid);
Node  bottomLeft =dfs(mid_row,btm_row,col_left,mid_col,grid);
Node  bottomRight =dfs(mid_row,btm_row,mid_col,col_right,grid);
 return new Node(true,false,topLeft,topRight,bottomLeft,bottomRight);
        }
        }
        }
         return new Node(val==1,true,null,null,null,null);
      } 
    }
