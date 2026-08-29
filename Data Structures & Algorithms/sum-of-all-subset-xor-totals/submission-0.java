class Solution {
    
    public int subsetXORSum(int[] nums) {
      return   f(nums,0,0);
    }
int f(int []nums,int i,int sum){
    if(i==nums.length) return sum;
    //take or notake
    int take=f(nums,i+1,sum^nums[i]);
    int not =f(nums,i+1,sum);
return take+not;

}
}