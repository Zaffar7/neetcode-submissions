class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)sum+=i;
        if(sum%2!=0) return false;
        int [][]dp = new int[nums.length][sum+1];
         for(int i=0;i<nums.length;i++)Arrays.fill(dp[i],-1);
      return  f(nums,sum/2,nums.length-1,dp);
    }
    boolean f(int arr[],int tar,int i,int dp[][]){
        if(i==0) return arr[0]==tar;
        if(tar==0)return true;
        if(dp[i][tar]!=-1) return dp[i][tar]==1;
        boolean take=false;
        if(arr[i]<=tar){
      take= f(arr,tar-arr[i],i-1,dp);
        }
        boolean not= f(arr,tar,i-1,dp);
        boolean ans= take|| not;
        dp[i][tar]=ans?1:0;
        return ans;
    }
}
