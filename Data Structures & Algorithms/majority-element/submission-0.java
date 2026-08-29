class Solution {
    public int majorityElement(int[] nums) {
       // for(int i=0;i<nums.length;i++){
           Arrays.sort(nums);
        return nums[nums.length / 2];   
       // }
    }
}