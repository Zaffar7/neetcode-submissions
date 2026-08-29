class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>>ans= new ArrayList<>();
       List<Integer> ls= new ArrayList<>();
       Arrays.sort(nums);
       f(nums,0,ans,ls);
       return ans;
    }
    void f(int []nums, int i,List<List<Integer>>ans,List<Integer> ls){
        
        if(i==nums.length){
             ans.add(new ArrayList<>(ls));
            return ;
        }
    
            ls.add(nums[i]);
            f(nums,i+1, ans, ls);
            ls.remove(ls.size()-1);
             while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
          f(nums,i+1, ans, ls);
    }
}
