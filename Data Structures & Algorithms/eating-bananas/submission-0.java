class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int l=1;
        int e=max;
        int ans=max;
        while(l<=e){
            int mid= (l+e)/2;
            long hours = 0;

            for (int pile : piles) {
                hours +=  Math.ceil((double)pile/mid);
            }
            if(hours<=h){
            ans=mid;
            e=mid-1;
           }else l=mid+1;
        }
        return ans;
    }
}
