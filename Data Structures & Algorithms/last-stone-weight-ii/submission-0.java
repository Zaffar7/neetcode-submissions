class Solution {
    public int lastStoneWeightII(int[] stones) {
        int ts=0;
             for(int I:stones)ts+=I;
      int tar=(int)  Math.ceil(ts/2.0);
 int dp[][]=new int[stones.length+1][ts+1];
 for (int[] row : dp) {
    Arrays.fill(row, -1); // Fills every element in the row with 10
}
    return f(stones,0,0,ts,dp);
    }
   int  f(int []arr,int i,int sum,int ts,int[][]dp){
    if(i==arr.length) return Math.abs(sum-(ts-sum));
    if(dp[i][sum]!=-1)return dp[i][sum];
    //take 
    int take = f(arr,i+1,sum+arr[i],ts,dp);
    //not
    int not= f(arr,i+1,sum,ts,dp);
    return dp[i][sum]= Math.min(take,not);
        
    }
}