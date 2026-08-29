class Solution {
    public int minCostClimbingStairs(int[] cost) {
         int dp[]=new int[cost.length+1];
       Arrays.fill(dp,-1);
      return Math.min(f(cost, 0, dp),
                        f(cost, 1, dp));
    }
   int f(int cost[],int n,int []dp){
        if(n>=cost.length) return 0;
       // if(n ==1) return 0;
        if(dp[n]!=-1) return dp[n];
       int a= f(cost,n+1,dp);
       int   b=f(cost,n+2,dp);
       return dp[n]=cost[n]+Math.min(a,b);
    } 
    }

