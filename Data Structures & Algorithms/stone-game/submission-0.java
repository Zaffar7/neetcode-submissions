class Solution {
    public boolean stoneGame(int[] piles) {
     int [][]dp=new int[piles.length][piles.length];
   for(int i[]:dp)Arrays.fill(i,-1);
     int res=f(piles,0,piles.length-1,dp);
   return  res>0;
    }
    int  f(int arr[], int f, int e,int dp[][]){ //choice 2 pick first'
   if(f==e){
    return arr[f];
   }
   if(dp[f][e]!=-1) return dp[f][e];
    int first = arr[f]- f(arr,f+1,e,dp);
    int last=  arr[e] -f(arr,f,e-1,dp);
    return dp[f][e]=Math.max(first,last);
    }
}