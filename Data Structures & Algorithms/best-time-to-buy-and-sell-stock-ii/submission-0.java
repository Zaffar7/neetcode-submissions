class Solution {
    public int maxProfit(int[] prices) {
       int low =Integer.MAX_VALUE;
       int high= Integer.MIN_VALUE;
       int pro=0;
       for(int i=0;i<prices.length;i++){
          low=Math.min(low,prices[i]);
          if(prices[i]>low){
            high=prices[i];
            pro+=high-low;
            low=high;
          }
       }
return pro;
    }
}