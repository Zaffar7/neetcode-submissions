class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]= new int [m][n];
        for(int i[]:dp) Arrays.fill(i,-1);
        return f(m,n,0,0,dp);
    }
    int f(int m,int n,int row, int col,int dp[][]){
        if(row>= m || col>=n) return 0;
if(row== m-1 || col==n-1) return 1;
if(dp[row][col]!=-1) return dp[row][col];
      return  dp[row][col]= f(m,n,row+1,col,dp)+f(m,n,row,col+1,dp);
    }
}
