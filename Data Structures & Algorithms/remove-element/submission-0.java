class Solution {
    public int removeElement(int[] nums, int val) {int cnt=0;
    int idx=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=val) {
            nums[idx++]=nums[i];
         cnt++;
       }
       }
      // if(nums[nums.length-1]!=val)cnt++;
       return cnt;
    } 
}