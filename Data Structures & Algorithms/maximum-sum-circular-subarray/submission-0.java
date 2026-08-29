class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int glomax=nums[0];
        int glomin= nums[0];
        int curmax=0;
        int curmin=0;
        int tot=0;
        for(int i=0;i<nums.length;i++){
            curmax=Math.max(curmax+nums[i],nums[i]);
            curmin=Math.min(curmin+nums[i],nums[i]);
            if(curmax>glomax)glomax=curmax;
            if(curmin<glomin)glomin=curmin;
            tot+=nums[i];
        }
        if(glomax<0)return glomax;
        return Math.max(glomax, tot- glomin);
    }
}