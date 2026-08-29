class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length-1;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k);
        reverse(nums,k+1,nums.length-1);
    }
   void reverse (int []nums,int i, int j){
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}