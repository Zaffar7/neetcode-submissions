class Solution {
   // int sum=0;
   
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return t(n,dp);
    }
    int t(int n,int []dp){
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
       int a= t(n-1,dp);
       int b= t(n-2,dp);
       int c= t(n-3,dp);
        return dp[n]=a+b+c;
    }
}