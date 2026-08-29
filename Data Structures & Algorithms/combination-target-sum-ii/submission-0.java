class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
   List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(nums);
        List<Integer>ls= new ArrayList<>();
        f(nums,0,target,ans,ls);
       return ans; 
    }
   void f(int []nums,int i, int tar,List<List<Integer>> ans,List<Integer>ls){
  //  if(tar==0 )ans.add(new ArrayList<>(ls));
   if (i == nums.length) {
            if (tar == 0) {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
    if(nums[i]<=tar){
    ls.add(nums[i]);
    f(nums,i+1,tar-nums[i],ans,ls);
    ls.remove(ls.size()-1);
    }
    //handle dupli
    while(i<nums.length-1 && nums[i]==nums[i+1])i++;
    f(nums,i+1,tar,ans,ls);     
    }
}
