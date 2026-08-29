class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int max=Integer.MIN_VALUE;
         int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int l=max;
        int e=sum;
        int ans=max;
        while(l<=e){
            int mid= (l+e)/2;
            long wt = 0;
            int cnt=0;
            for (int pile : weights) {
               if(wt+pile>mid){wt=0;cnt++;}
                wt +=  pile;
            }cnt++;
            if(cnt<=days){
            ans=mid;
            e=mid-1;
           }else l=mid+1;
        }
        return ans;
    }
}