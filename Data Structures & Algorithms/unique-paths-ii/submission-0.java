class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]= new int [m][n];
        for(int i[]:dp) Arrays.fill(i,-1);
        return f(obstacleGrid,m,n,0,0,dp);
    }
    int f(int arr[][],int m,int n,int row, int col,int dp[][]){
    
        if(row>= m || col>=n) return 0;
    if(arr[row][col]==1) return 0;
if( row== m-1 && col==n-1) return 1;
if(dp[row][col]!=-1) return dp[row][col];

      return  dp[row][col]= f(arr,m,n,row+1,col,dp)+f(arr,m,n,row,col+1,dp);
    }
}