class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
      return f(nums,n,0,dp);
    }
    int f(int arr[],int n,int i,int dp[]){
            if(i >= n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=0;  
    take = arr[i]+f(arr,n,i+2,dp);
       int skip= f(arr,n,i+1,dp);
        return dp[i]= Math.max(take,skip);
    }
}
