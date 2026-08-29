class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int ans=nums[0];
        while(l<=h){
            if(nums[l]<nums[h]) {ans= Math.min(ans,nums[l]); break;}
            int mid=(l+h)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[mid]>=nums[l]){
                //go right search
                l=mid+1;
            }else if(nums[mid]<nums[h]){
                //go left search
               h=mid-1;
            }

        }
        return ans;
    }
}
