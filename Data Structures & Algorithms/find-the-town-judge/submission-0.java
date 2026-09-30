class Solution {
    public int findJudge(int n, int[][] trust) {
       int in[]= new int[n+1];
       int out[]= new int[n+1];
       for(int i=0;i<trust.length;i++){
        in[trust[i][1]]++;
        out[trust[i][0]]++;
       }
       int ans=-1;
       for(int i=1;i<n+1;i++){
         if(in[i]==n-1 && out[i]==0)ans=i;
       }
       return ans;
    }
}