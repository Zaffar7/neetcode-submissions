class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[]= new int[nums.length+1];
        int ans= arr.length;
        for(int i=0;i<nums.length;i++){
            if( nums[i]>0 && nums[i]<=nums.length && arr[nums[i]]==0) arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) {ans=i; break;}
        }
       return ans;
    }

}