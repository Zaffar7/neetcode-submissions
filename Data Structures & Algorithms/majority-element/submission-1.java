class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int no=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0)no=nums[i];
            if(nums[i]==no)cnt++;
            else cnt--;
     //      Arrays.sort(nums);
       // return nums[nums.length / 2];   
       }
return no;    }
}