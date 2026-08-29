class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []a= new int[nums.length];
        int pdt=1,cnt=0;
        for(int i=0;i<a.length;i++){
            if(nums[i]==0) cnt++;
           else pdt*=nums[i];
        }
       
        for(int i=0;i<a.length;i++){
            if(cnt==0 ){
                a[i]= (pdt/nums[i]);
            }else if(nums[i]==0 && cnt==1) a[i]=pdt;
            else a[i]=0;
        }
        return a;
    }
}  
