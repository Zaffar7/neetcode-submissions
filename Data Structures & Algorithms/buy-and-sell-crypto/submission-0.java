class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int cost= prices[0];
        for(int i=1;i<prices.length;i++){
        if(prices[i]>cost){
            pro=Math.max(pro,prices[i]-cost);
        }else cost=prices[i];
        }
        return pro;
    }
}
