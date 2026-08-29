class Solution {
    public int splitArray(int[] nums, int k) {
    int max=0;
    int sum=0;
    for(int i:nums){
        max=Math.max(max,i);
        sum+=i;
    }
    if(k==nums.length)return max;
    int low=max;
    int high=sum;
    while(low<=high){
  int mid=(low+high)/2;
            int cnt=1;
             sum=0;
            for(int i=0;i<nums.length;i++){
                if(sum+ nums[i]<=mid){
                    sum+=nums[i];
                }else{
                    sum=nums[i];
                    cnt++;
                }
            }
                if(cnt>k)low=mid+1;
                else  high=mid-1;
            
    }
    return low;
    }
}