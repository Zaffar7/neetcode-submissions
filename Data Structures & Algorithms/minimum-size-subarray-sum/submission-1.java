class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int []pre= new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
         pre[i]=pre[i-1]+nums[i];
        }
        int l=0;
        int len=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            /*if(pre[r]-(l>0?pre[l-1]:0) >=target){
                len=Math.min(len,r-l+1);
                l++;
            }*/
            while (l <= r && pre[r] - (l > 0 ? pre[l - 1] : 0) >= target) {
    len = Math.min(len, r - l + 1);
    l++;
}
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}