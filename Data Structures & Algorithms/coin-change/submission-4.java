class Solution {
    public int coinChange(int[] coins, int amount) {
      /*  int dp[][]= new int[coins.length+1][amount+1];
        for( int i=0;i<dp.length;i++)
     Arrays.fill(dp[i],Integer.MAX_VALUE-1);
       int ans=  f(coins,amount,0,dp);
       if (ans == Integer.MAX_VALUE-1)
            return -1;
        return ans;
    }
    int f(int coin[],int amt,int i, int[][]dp){
        if( amt==0) return 0;
         if (i == coin.length)
            return Integer.MAX_VALUE-1;
         if(dp[i][amt]!=Integer.MAX_VALUE -1) return dp[i][amt];   
        int take=Integer.MAX_VALUE-1;
       if(coin[i]<=amt){
    //  take=  1+ f(coin,amt-coin[i],i,dp);
        int res = f(coin, amt - coin[i], i, dp);
            // FIX: safe addition
            if (res != Integer.MAX_VALUE - 1)
                take = 1 + res;
       }        
     int not=   f(coin,amt,i+1,dp);
     return dp[i][amt]=Math.min(take,not);*/
     int n=coins.length;
        int dp[][] = new int [n][amount+1];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
      int ans= f(coins,amount,dp,n-1);
      if(ans>=(int)1e9) return -1;
      return ans;
    }
    public int f(int []coins, int amount,int[] []dp,int idx){
        if(idx==0){
            if(amount%coins[idx]==0) return amount/coins[idx];
             return (int)1e9;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int nottake =0+f(coins,amount,dp,idx-1);
        int take=Integer.MAX_VALUE;
        if(coins[idx]<=amount)
        take = 1+f(coins,amount-coins[idx],dp,idx);
        return dp[idx][amount]= Math.min(nottake,take);
    }
}
